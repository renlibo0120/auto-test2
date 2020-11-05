package page.login;

import pub.emailException.EmailException;
import org.openqa.selenium.WebDriver;

public class LoginExceptionText extends EmailException {
    public static String getLoginExceptionText(WebDriver driver){
        return getExceptionText(driver,"xpath","//*[@class=\\\"ferrorhead\\\"]");
    }
}
