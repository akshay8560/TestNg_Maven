package AdvanceSelenium.Day1;

import AdvanceSelenium.Day1.PageObjectModel_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class VerifiyLogin_POM {
    WebDriver  driver;
    @BeforeMethod
    void setup(){
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test
    void logintest(){


        PageObjectModel_POM pageObjectModelPom=new PageObjectModel_POM(driver);
        pageObjectModelPom.login();
    }
    @AfterMethod
    void Teardown(){
        driver.quit();
    }


}
