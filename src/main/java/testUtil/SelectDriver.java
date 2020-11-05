package testUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {
    public WebDriver driverName(String browser){
        if (browser.equalsIgnoreCase("ChromeDriver")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
            return new ChromeDriver();
        }else{
//            当前没有配置火狐浏览器，不可用
            System.setProperty("webdriver.gecko.driver","C:\\Program Files(x86)\\Mozilla Firefox\\geckodriver.exe");
            return new FirefoxDriver();
        }
    }

}
