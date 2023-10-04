package TestNG.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

public class parameterizedTestWithBroswer {

    WebDriver driver;

    @BeforeMethod
    void setup(){
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

    }

    @Test(priority = 1,groups = "EmailAddressTest")
    @Parameters("email")
    void EmailAddressTest(String email){
      WebElement emails=driver.findElement(By.xpath("//input[@name='email']"));
     // emails.sendKeys("doodwalakshay@gmail.com");
      emails.sendKeys(email);
        System.out.println("thread 2 "+Thread.currentThread().getId());
    }
    @Test(priority = 2,dependsOnMethods = "EmailAddressTest")
    @Parameters("password")
    void PasswordTest(String pass){
          WebElement emails=driver.findElement(By.xpath("//input[@name='pass']"));
          //emails.sendKeys("Akshay@123");
          emails.sendKeys(pass);
        System.out.println("thread 2 "+Thread.currentThread().getId());
    }




    @AfterMethod
    void teardown(){
        driver.quit();

    }


}
