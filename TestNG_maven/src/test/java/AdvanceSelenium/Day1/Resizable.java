package AdvanceSelenium.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resizable/");
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());
        // switch to frame
        driver.switchTo().frame(0);

        // Element-path store in web-element variable
        WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
        Point location = resize.getLocation();
        int xOffset = location.getX();
        int yOffSet = location.getY();
        System.out.println(yOffSet);
        System.out.println(xOffset);
        //System.out.println(resize);
        // Actions class object creation
        Actions act = new Actions(driver);

        // For resizable
        //   act.dragAndDropBy(resize,167,167).perform();
        System.out.println(resize.getSize().width);
        System.out.println(resize.getSize().height);
        act.clickAndHold(resize).perform();
        act.moveByOffset(xOffset/2, yOffSet/2);

        act.release().perform();


        Thread.sleep(3000);
        driver.quit();
    }
}
