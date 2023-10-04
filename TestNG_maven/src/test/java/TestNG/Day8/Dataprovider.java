package TestNG.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class Dataprovider {
WebDriver driver;
    @BeforeMethod
    void Setup(){
       driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

    }


    @Test(dataProvider = "dataprovide")
   void logintest(String emailid,String pass){
        WebElement eamil= driver.findElement(By.xpath("//input[@id='email']"));
        //eamil.sendKeys("akshay12@gmail.com");
        eamil.sendKeys(emailid);
        WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
        // password.sendKeys("Akshay@123");
        password.sendKeys((pass));
        WebElement submitbtn= driver.findElement(By.xpath("//button[@name='login']"));

        submitbtn.click();
       // Assert.assertTrue(driver.findElement(By.xpath("//a[@role='button']")).isDisplayed());
     /*   driver.quit();*/
    }


   @AfterMethod
    void teardown(){
       driver.quit();
   }

   @DataProvider()
   public Object[][] dataprovide(){
        Object[][] data=new Object[2][2];
        data[0][0]="akshay@gmail.com";
        data[0][1]="Akshay@123";
        data[1][0]="akshaydoodwal@gmail.com";
        data[1][1]="vikas@123";
        return data;

   }



}
