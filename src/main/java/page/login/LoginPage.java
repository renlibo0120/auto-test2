package page.login;

/*
    通过对 126 邮箱的分析，我们发现所有的用例都是需要登录邮箱之后的操作，例如，邮件的发送，接
收，删除等操作。所以，可以对登录和退出进行模块化设计。
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//  封装登录页面
public class LoginPage {
    //    登录页面
//    登录
    public static void login(WebDriver driver, String username, String password){
        driver.switchTo().frame(0);
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("dologin")).click();
    }
    //    退出
    public static void logout(WebDriver driver){
        driver.findElement(By.id("spnUid")).click();
        driver.findElement(By.id("_mail_component_72_72")).click();
    }
}
