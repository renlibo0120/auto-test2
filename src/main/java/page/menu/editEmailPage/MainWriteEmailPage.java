package page.menu.editEmailPage;

import testUtil.FindEmailElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainWriteEmailPage {
    //    定位发送按钮
    public static WebElement getSendEmail(WebDriver driver){
        return new FindEmailElements(driver).getElement("xpath","(//*[text()='发送'])[1]");
    }
    //    定位预览按钮
    public static WebElement getPreviewEmail(WebDriver driver){
        return new FindEmailElements(driver).getElement("xpath","//*[text()='预 览']");
    }

    //    定位存草稿按钮
    public static WebElement getSaveEmail(WebDriver driver){
        return new FindEmailElements(driver).getElement("linkText","存草稿");
    }
    //    定位取消按钮
    public static WebElement getCancelEmail(WebDriver driver){
        return new FindEmailElements(driver).getElement("xpath","(//*[contains(text(),'取 消')])[1]");
    }
    //    定位收件人输入框
    public static WebElement getEmailAddressee(WebDriver driver){
//        return new FindEmailElements(driver).getElement("xptah","//*[@class='bz0']/div[2]/div/input");
        return driver.findElement(By.xpath("//*[@class='bz0']/div[2]/div/input"));
    }

    //    定位主题输入框
    public static WebElement getEmailSubject(WebDriver driver){
//        这个问题没找到，不知道为什么第一条无法获取到元素，第二条可以，后续找找
//        return new FindEmailElements(driver).getElement("xptah","//input[@class='nui-ipt-input' and @type='text' and @maxlength='256']");
        return driver.findElement(By.xpath("//input[@class='nui-ipt-input' and @type='text' and @maxlength='256']"));
    }
    //    定位邮件内容输入框
    public static WebElement getMailInput(WebDriver driver){
        return new FindEmailElements(driver).getElement("tagName","body");
//        return driver.findElement(By.tagName("body"))
    }
    //    定位邮件输入iframe框
    public static WebElement getWriteEmailIframe(WebDriver driver){
        return new FindEmailElements(driver).getElement("classname","APP-editor-iframe");
    }
    //    定位下方发送按钮
    public static WebElement getLowerSendEmail(WebDriver driver){
        return new FindEmailElements(driver).getElement("xpath","(//*[text()='发送'])[2]");
    }

    //    定位下方取消按钮
    public static WebElement getLowerCancelEmail(WebDriver driver){
        return new FindEmailElements(driver).getElement("xpath","(//*[contains(text(),'取 消')])[2]");
    }
}
