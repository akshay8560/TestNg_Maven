package TestNG.Day3;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.time.Duration;

public class Annotaions {
    WebDriver driver;

    @BeforeMethod
    void setup(){
        driver=new ChromeDriver();
        // driver.navigate().to("https:/www.google.com");
        driver.get("https:/www.google.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }


    @Test(priority = 1,dependsOnMethods = "setup")
    void googleTitle(){
        String title=driver.getTitle();
        System.out.println("Title :"+title);
    }
    @Test(priority = 2)
    void googleSearch(){
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Akshay Kumar"+ Keys.ENTER);

    }
    @Test (priority = 3)
    void googleImage(){
        String url= String.valueOf(driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed());

        System.out.println("img: "+url);

    }
    @Test (priority = 4)
    void mailLinkTest(){
        WebElement maillink=driver.findElement(By.xpath("//a[@href=\"https://mail.google.com/mail/&ogbl\"]"));
        String link= String.valueOf(maillink.isDisplayed());
        System.out.println("Mail link: "+ link );
    }




    @AfterMethod
    void teardown(){
        driver.quit();
    }
  /*  @AfterTest
    void closebrowser(){
        driver.close();
    }*/


}
