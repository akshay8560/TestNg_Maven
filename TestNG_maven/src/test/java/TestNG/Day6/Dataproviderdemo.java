package TestNG.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class Dataproviderdemo {

    WebDriver driver;



    @Test(dataProvider = "logindata")
    void logintest(String  usernames,String userPassword){
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
       // username.sendKeys("Admin");
        username.sendKeys(usernames);
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        //password.sendKeys("admin123");
        password.sendKeys(userPassword);
        WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();
       Assert.assertTrue(driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).isDisplayed());
       // Assert.assertTrue(driver.findElement(By.name("Dashboard")).isDisplayed());
        driver.quit();

    }


    //@DataProvider(name = "LoginDataProvider")
    @DataProvider
    public Object[][] logindata(){
        Object[][] data=new Object[2][2];
        data[0][0]="Admin";
        data[0][1]="admin123";

        data[1][0]="Admin";
        data[1][1]="Admin@123";
        return data;
    }





}
