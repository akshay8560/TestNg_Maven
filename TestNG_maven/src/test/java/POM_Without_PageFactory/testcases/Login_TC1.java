package POM_Without_PageFactory.testcases;

import POM_Without_PageFactory.Pages.Dashboard;
import POM_Without_PageFactory.Pages.homePage;
import POM_Without_PageFactory.Pages.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login_TC1 {

    // without page factory
    WebDriver driver;


    @Test
    void loginpageVerify(){
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        loginPage loginPage=new loginPage(driver);
        loginPage.loginpagetc();

     /*   Dashboard dashboard=new Dashboard(driver);
        dashboard.getHeading();
        dashboard.clickLogout();


        homePage homePage =new homePage(driver);
        homePage.clickLogin();*/

        //driver.quit();


    }







  /*  @Test
    void homePageVerify(){
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
*/
  /*  @BeforeMethod
    void teardown(){
        driver.quit();
    }*/



}
