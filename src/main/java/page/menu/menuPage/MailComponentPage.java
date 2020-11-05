package page.menu.menuPage;

import testUtil.FindEmailElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailComponentPage {

//    定位收信按钮
    public static WebElement getReceivedEmail(WebDriver driver){
       return new FindEmailElements(driver).getElement("xpath","//*[text()='收 信']");
    }

//    定位写信按钮
    public static WebElement getWriteEmail(WebDriver driver){
        return new FindEmailElements(driver).getElement("xpath","//*[text()='写 信']");
    }
}
