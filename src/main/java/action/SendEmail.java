package action;

import page.menu.editEmailPage.MainWriteEmailPage;
import page.menu.menuPage.MailComponentPage;
import testUtil.Sleep;
import org.openqa.selenium.WebDriver;

public class SendEmail {
//    这里只是练习一下，输入了最简单的文本内容
    public static void sendEmail(WebDriver driver,String receviedName, String emailDetails){
//        new主菜单页面
        MailComponentPage componentPage = new MailComponentPage();
//        点击写信按钮，进入写信页面
        componentPage.getWriteEmail(driver).click();

        Sleep.sleep(3000);

//        new编辑邮件内容页面
        MainWriteEmailPage writeEmailPage = new MainWriteEmailPage();

//        编写邮件，并发送
        writeEmailPage.getEmailAddressee(driver).sendKeys(receviedName);
        writeEmailPage.getEmailSubject(driver).sendKeys(emailDetails);
        driver.switchTo().frame(writeEmailPage.getWriteEmailIframe(driver));
        writeEmailPage.getMailInput(driver).sendKeys("邮件内容");
//        返回上一级表单
        driver.switchTo().defaultContent();
        writeEmailPage.getLowerSendEmail(driver).click();
        Sleep.sleep(3000);
    }
}
