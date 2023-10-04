package AdvanceSelenium.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutorDemo {
    public static void main(String[] args) {
        WebDriver driver;
        driver=new ChromeDriver();
        /*driver.get("https://demo.guru99.com/V4/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor) driver;*/

      /*  WebElement button =driver.findElement(By.name("btnLogin"));

        //Login to Guru99
        driver.findElement(By.name("uid")).sendKeys("AkshayKumar");
        driver.findElement(By.name("password")).sendKeys("Akshay@123");

        //Perform Click on LOGIN button using JavascriptExecutor
        js.executeScript("arguments[0].click();", button);
        js.executeScript("alert('Welcome to Guru99');");*/
       /* String DomainName = js.executeScript("return document.domain;").toString();
        System.out.println("Domain name of the site = "+DomainName);

        //Fetching the URL of the site. Tostring() change object to name
        String url = js.executeScript("return document.URL;").toString();
        System.out.println("URL of the site = "+url);

        //Method document.title fetch the Title name of the site. Tostring() change object to name
        String TitleName = js.executeScript("return document.title;").toString();
        System.out.println("Title of the page = "+TitleName);


        //Navigate to new Page i.e to generate access page. (launch new url)
        js.executeScript("window.location = 'https://demo.guru99.com/'");
        js.executeScript("window.scrollBy(0,600)");*/



        JavascriptExecutor js = (JavascriptExecutor)driver;

        //Launching the Site.
        driver.get("http://moneyboats.com/");

        //Maximize window
        driver.manage().window().maximize();

        //Vertical scroll down by 600  pixels
        js.executeScript("window.scrollBy(0,700)");
    }



}
