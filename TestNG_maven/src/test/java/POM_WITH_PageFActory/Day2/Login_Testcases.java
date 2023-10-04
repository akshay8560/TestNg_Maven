package POM_WITH_PageFActory.Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login_Testcases {
WebDriver  driver;


@Test
    void loginTest(){
    driver=new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    driver.manage().window().maximize();

    PageObjectModel_Login pageObjectModelLogin=PageFactory.initElements(driver,PageObjectModel_Login.class);
    pageObjectModelLogin.clickloginBtn();
    driver.quit();
}
}
