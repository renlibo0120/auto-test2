package testCase.sendEmail;

import action.SendEmail;
import page.login.LoginPage;
import page.menu.editEmailPage.SendEmailException;
import testUtil.SelectDriver;
import testUtil.Sleep;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SendEmailTest {
    private WebDriver driver;
    private String baseUrl;

    @BeforeMethod
    public void setUp(){
        driver = new SelectDriver().driverName("ChromeDriver");
        baseUrl="https://www.126.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    public void sendEmailTest(){
        driver.get(baseUrl);
//      登陆
        LoginPage.login(driver,"rlbtestemail","Qwe12345");
        Sleep.sleep(5000);


//       发送邮件(无法定位到输入框，导致执行失败，需要修改一下收件人、主题的输入框定位)
        SendEmail.sendEmail(driver,"386495108@qq.com","这是一个简单的邮件");

//        断言发送结果
        String sendEmailException = SendEmailException.getSendEmailException(driver);
        Assert.assertEquals(sendEmailException,"发送成功手机收发邮件更方便");


    }
    @AfterMethod
    public void tearDown() throws Exception{
        LoginPage.logout(driver);
        driver.quit();
    }
}
