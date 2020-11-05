package page.menu.editEmailPage;

import org.openqa.selenium.WebDriver;

import static pub.emailException.EmailException.getExceptionText;

public class SendEmailException {
    public static String  getSendEmailException(WebDriver driver){

        return getExceptionText(driver,"classname","tK1");
    }
}
