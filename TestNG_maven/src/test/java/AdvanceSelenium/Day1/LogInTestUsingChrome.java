package AdvanceSelenium.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class LogInTestUsingChrome {

    static WebDriver driver;

    @Test(priority = 1)
    void setup() throws MalformedURLException, InterruptedException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WIN11);
        driver=new RemoteWebDriver(new URL("http://192.168.1.189:4444"),cap);


        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Akshay Kumar");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();

        Thread.sleep(3000);
        driver.close();
    }
}