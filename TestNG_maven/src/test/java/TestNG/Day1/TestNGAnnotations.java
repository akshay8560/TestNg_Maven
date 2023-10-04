package TestNG.Day1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

    public WebDriver driver ;
    @BeforeTest
    public void launchBrowser() {
        System.out.println("launching Chrome browser");

        driver = new ChromeDriver();
        driver.get("https://www.browserstack.com");
    }
    @Test(priority = 1,groups = "verifyHomePage")
    public void verifyHomepageTitle() {
        String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @AfterTest
    public void terminateBrowser(){
        driver.close();
    }
}
