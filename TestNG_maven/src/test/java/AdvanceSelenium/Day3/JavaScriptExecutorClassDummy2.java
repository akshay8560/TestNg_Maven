package AdvanceSelenium.Day3;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
public class JavaScriptExecutorClassDummy2 {
    @Test
    public void Login()
    {
        WebDriver driver= new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
//To launch a site
        driver.get("https://www.softwaretestingmaterial.com");
//To maximize the window
        driver.manage().window().maximize();
//To set the script timeout to 10 seconds
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
//To declare and set the start time
        long startTime = System.currentTimeMillis();
//Calling executeAsyncScript() method to wait for 10 seconds
        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 10000);");
//To get the difference current time and start time
        System.out.println("Wait time: " + (System.currentTimeMillis() - startTime));
    }
}