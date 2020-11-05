package testCase.login;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import page.login.LoginPage;
import testUtil.SelectDriver;
import testUtil.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

/* 编写邮箱登录自动化测试用例,只执行一条正常流用例
**/
@Epic("一级目录")
@Feature("二级目录")
public class TestLogin {
    private WebDriver driver;
    private String baseUrl;


    @BeforeMethod
    public void setUp() throws Exception{
        driver = new SelectDriver().driverName("ChromeDriver");
        baseUrl="https://www.126.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Story("Story类似三级目录")
    @Test
    public void testCase() throws Exception{
        driver.get(baseUrl);
//        定义用户名和密码
        String username = "rlbtestemail";
        String password = "renlibo0120";

//        调用登录模块
        LoginPage.login(driver,username,password);
        Sleep.sleep(5000);
//        验证
        String text = driver.findElement(By.id("spnUid")).getText();
        assertEquals(text,"rlbtestemail@126.com");




//        调用退出模块
        LoginPage.logout(driver);
    }

    @AfterMethod
    public void tearDown() throws Exception{
        driver.quit();
    }
}
