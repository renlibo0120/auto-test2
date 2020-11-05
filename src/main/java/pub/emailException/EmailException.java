package pub.emailException;

import testUtil.FindEmailElements;
import org.openqa.selenium.WebDriver;

public class EmailException {
    public static String getExceptionText(WebDriver driver,String elementId,String element){
        String text = new FindEmailElements(driver).getElement(elementId,element).getText();
        return text;
    }
}
