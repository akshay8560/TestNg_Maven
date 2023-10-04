package AdvanceSelenium.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionClassAndMethod {
    public static void main(String[] args) {
        WebElement element;
        WebDriver driver=new ChromeDriver();



        driver.manage().window().maximize();

        driver.get("https://www.browserstack.com/");
        WebElement element1=driver.findElement(By.linkText("Get started free"));

        Actions a = new Actions(driver);

     a.moveToElement(element1).build().perform();



//Double click on element

     /*   WebElement trialaction = driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));

        a.doubleClick(trialaction).perform();*/
        //driver.get("https://www.browserstack.com/");
        /*driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        Actions action = new Actions(driver);

        WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));

        //action.click(element).perform();
        action.moveToElement(element).perform();
        System.out.println("click"+element.isDisplayed());*/


        /*driver.get("https://www.browserstack.com/");
        Actions action = new Actions(driver);
     //  WebElement element = driver.findElement(By.partialLinkText("Get started free"));
      // WebElement element1 = driver.findElement(By.xpath("//body[@data-onloadevent='OnMainLandingPage']"));
      WebElement element1 = driver.findElement(By.xpath("//button[@id='primary-menu-toggle']"));

        action.click(element1).build().perform();*/
        //driver.quit();




//using click action method
    }

}
