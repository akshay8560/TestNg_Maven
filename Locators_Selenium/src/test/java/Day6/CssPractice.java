package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CssPractice {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello Akshay");
        WebDriver driver=new ChromeDriver();
        driver.get("https://bstackdemo.com/");


        // by id
       // driver.findElement(By.id("offers")).click();

        //css selector


        //1. tag and id
        Thread.sleep(5);

       // driver.findElement(By.cssSelector("a#offers")).click();

        //driver.findElement(By.cssSelector("#offers")).click();
        driver.findElement(By.cssSelector("a[id='offers']")).click();

        //select password


        WebDriverWait driverWait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element1=driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=' css-1uccc91-singleValue']")));

        element1.click();

      WebElement selectuseranme= driver.findElement(By.xpath("//div[@class=' css-1uccc91-singleValue']"));
//       WebElement selectpasswpord= driver.findElement(By.cssSelector("#react-select-9-input"));
//
        Select select=new Select(selectuseranme);
        select.selectByVisibleText("fav_user");




//        Select select2=new Select(selectpasswpord);
//        select2.selectByVisibleText("testingisfun99");


       // driver.findElement(By.cssSelector(".Navbar_logo__26S5Y")).click();

        //driver.findElement(By.cssSelector(".filters>div[class='filters-available-size']>label>input[value='Apple']")).click();


        //driver.findElement(By.cssSelector(".sort>select>option[value='lowestprice']")).click();
       // driver.findElement(By.cssSelector("a#offers[href='/offers']")).click();
        //driver.findElement(By.cssSelector(".shelf-item[data-sku='iPhone12-device-info.png'][id='2']")).click();
//        //driver.findElement(By.cssSelector("div[id='3'] div[class='shelf-item__buy-btn']")).click();
//
//        driver.findElement(By.cssSelector("input[value=\"Apple\"] + .checkmark")).click();
//        driver.findElement(By.cssSelector("input[value=\"Samsung\"] + .checkmark")).click();


       // driver.findElement(By.xpath("//input[@id='react-select-4-input']")).click();
    }
}
