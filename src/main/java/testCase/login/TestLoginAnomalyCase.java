package testCase.login;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import page.login.LoginExceptionText;
import page.login.LoginPage;
import testUtil.SelectDriver;
import testUtil.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

/* 同一个创建创建一组用例，正常流和异常流，可以当做一条用例编写，使用@Test分别执行
* 例如登陆场景用例，正常流只有1条，但是异常流有多条，使用的代码脚本相同，那么在case层就可以使用参数化
* 这里只写了异常流参数化，执行多条异常流用例
* */
@Epic("一级目录2")
@Feature("二级目录2")
public class TestLoginAnomalyCase{
    private WebDriver driver;
    private String baseUrl;

    @BeforeMethod
    public void setUp(){
        driver = new SelectDriver().driverName("ChromeDriver");
        baseUrl="https://www.126.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
//    定义对象数组，这里使用了dataprocider进行参数化
    @DataProvider(name="user")
        public Object[][] Users(){
//     四条异常流用例，只是参数不同的话，只用参数化
//     分别是用户名、密码、报错信息
        return new Object[][]{
                {"","","请输入帐号"},
                {"rlbtestemail","","请输入密码"},
                {"","Qwe12345","请输入帐号"},
                {"error","error","请先进行验证"},
                {"rlbtestemail","Qwe12345",""},
        };
    }
    @Story("Story类似三级目录2")
    @Test(dataProvider = "user")
    public void testLoginCase(String username,String password,String expectText){
        try {
            driver.get(baseUrl);
//        调用登陆
            LoginPage.login(driver,username,password);
            Sleep.sleep(2000);

//        获取报错信息
            String loginExceptionText = LoginExceptionText.getLoginExceptionText(driver);
            System.out.println(loginExceptionText);
//        预期报错信息
            System.out.println(expectText);

//        校验报错信息
            Assert.assertEquals(loginExceptionText,expectText);
        } catch (Exception e) {
            //        最后一次正确的账号密码登录成功后验证
            String text = driver.findElement(By.id("spnUid")).getText();
            assertEquals(text,"rlbtestemail@126.com");
//        调用退出模块
            LoginPage.logout(driver);
        }
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
