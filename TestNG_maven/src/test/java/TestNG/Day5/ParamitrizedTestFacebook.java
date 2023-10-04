package TestNG.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParamitrizedTestFacebook {

    // facebook signup page testing
    //login  using parameter
    WebDriver driver;
    @BeforeMethod
    void setup(){
        driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Test()
    @Parameters({"email","password"})
    void logintest(String mail,String pass){
     WebElement eamil= driver.findElement(By.xpath("//input[@id='email']"));
     //eamil.sendKeys("akshay12@gmail.com");
     eamil.sendKeys(mail);
     WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
    // password.sendKeys("Akshay@123");
     password.sendKeys(pass);
     WebElement submitbtn= driver.findElement(By.xpath("//button[@name='login']"));

     submitbtn.click();
     //Assert.assertEquals("true","true");
     //Assert.assertTrue(driver.findElement(By.xpath("//a[@role='button']")).isDisplayed());
       // driver.quit();
        System.out.println("thread 3 "+Thread.currentThread().getId());
    }
    @AfterMethod
    void teardown(){
        driver.quit();
    }



}
