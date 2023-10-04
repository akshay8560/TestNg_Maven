package POM_WITH_PageFActory.Day1;

import POM_WITH_PageFActory.Day1.PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class VerifyLoginPage {
    WebDriver driver;

    @BeforeMethod()
    void setup()
    {
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

    }

    @Test
    void verifyLoginTest(){

       PageObjectModel ll= PageFactory.initElements(driver,PageObjectModel.class);
       ll.logindata("gunjankaushik","Akshay@123");

    }
    @AfterMethod
    void Teardown(){
        driver.quit();
    }

}
