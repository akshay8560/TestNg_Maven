package TestNG.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class DataProviderWithFacebookPage {

    WebDriver driver;
    //@BeforeMethod
   /* void setup(){
        driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }*/

    @Test(dataProvider = "logindataproviderTest")
  //  @Parameters({"email","password"})

    void logintest(String email,String pass){
        driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        WebElement eamil= driver.findElement(By.xpath("//input[@id='email']"));
        //eamil.sendKeys("akshay12@gmail.com");
        eamil.sendKeys(email);
        WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
        // password.sendKeys("Akshay@123");
        password.sendKeys((pass));
        WebElement submitbtn= driver.findElement(By.xpath("//button[@name='login']"));

        submitbtn.click();
        Assert.assertTrue(driver.findElement(By.xpath("//a[@role='button']")).isDisplayed());
        driver.quit();

    }
   /* @AfterMethod
    void teardown(){
        driver.quit();
    }
*/
    @DataProvider
    Object[][] logindataproviderTest(){
        Object[][] data=new Object[2][2];
        data[0][0]="akshay12@gmail.com";
        data[0][1]="Akshay@123";
        data[1][0]="akshay@gmail.com";
        data[1][1]="Akshay@123";
        return data;


    }



}
