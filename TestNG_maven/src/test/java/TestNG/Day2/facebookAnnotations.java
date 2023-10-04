package TestNG.Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class facebookAnnotations {

    WebDriver driver;
    @BeforeMethod
    void setup(){

        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?locale=en_GB");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @Test
    void facebookTitleTest(){
        String title=driver.getTitle();
        System.out.println("Title: "+title);
    }

    @Test
    void usernametest(){

    }

    @Test
    void fullnametest(){

    }

    @Test
    void mailtest(){

    }



    @AfterMethod
    void tearDown(){
        driver.quit();
    }




}
