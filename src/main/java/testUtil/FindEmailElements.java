package testUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindEmailElements {
    WebDriver driver;
//    创建一个构成方法，用于初始化对象
    public FindEmailElements(WebDriver driver) {
        this.driver = driver;
    }
//    查找单个元素
    public   WebElement getElement(String type, String locator) {
        if(type.equals("id")) {
            System.out.println("用id查找元素："+locator);
            return this.driver.findElement(By.id(locator));
        }else if(type.equals("xpath")) {
            System.out.println("用xpath查找元素："+locator);
            return this.driver.findElement(By.xpath(locator));
        }else if(type.equals("name")) {
            System.out.println("用name查找元素："+locator);
            return this.driver.findElement(By.name(locator));
        }else if(type.equals("cssSelector")) {
            System.out.println("用cssSelector查找元素："+locator);
            return this.driver.findElement(By.cssSelector(locator));
        }else if(type.equals("linkText")) {
            System.out.println("用linkText查找元素："+locator);
            return this.driver.findElement(By.linkText(locator));
        }else if(type.equals("partialLinkText")) {
            System.out.println("用partialLinkText查找元素："+locator);
            return this.driver.findElement(By.partialLinkText(locator));
        }else if(type.equals("tagName")) {
            System.out.println("用tagName查找元素："+locator);
            return this.driver.findElement(By.tagName(locator));
        }else if(type.equals("classname")) {
            System.out.println("用classname查找元素："+locator);
            return this.driver.findElement(By.className(locator));
        }else {
            System.out.println("定位的路径不支持:"+locator);
            return null;
        }
    }

//    查找多个元素
    public List<WebElement> getElementList(String type, String locator) {
        if(type.equals("id")) {
            System.out.println("用id查找元素："+locator);
            return this.driver.findElements(By.id(locator));
        }else if(type.equals("xpath")) {
            System.out.println("用xpath查找元素："+locator);
            return this.driver.findElements(By.xpath(locator));
        }else if(type.equals("name")) {
            System.out.println("用name查找元素："+locator);
            return this.driver.findElements(By.name(locator));
        }else if(type.equals("cssSelector")) {
            System.out.println("用cssSelector查找元素："+locator);
            return this.driver.findElements(By.cssSelector(locator));
        }else if(type.equals("cssSelector")) {
            System.out.println("用cssSelector查找元素："+locator);
            return this.driver.findElements(By.cssSelector(locator));
        }else if(type.equals("linkText")) {
            System.out.println("用linkText查找元素："+locator);
            return this.driver.findElements(By.linkText(locator));
        }else if(type.equals("partialLinkText")) {
            System.out.println("用partialLinkText查找元素："+locator);
            return this.driver.findElements(By.partialLinkText(locator));
        }else if(type.equals("tagName")) {
            System.out.println("用tagName查找元素："+locator);
            return this.driver.findElements(By.tagName(locator));
        }else {
            System.out.println("定位的路径不支持");
            return null;
        }
    }
}
