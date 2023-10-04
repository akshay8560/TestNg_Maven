package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static java.lang.System.setProperty;

public class testjenkins {
    static WebDriver driver;

    @BeforeMethod
    void setup() throws MalformedURLException {
     // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay Kumar Doodwal\\Downloads\\chromedriver_win32\\chromedriver.exe");


       driver = new ChromeDriver();
        //driver = new RemoteWebDriver(new URL("http://localhost:8080/"), (Capabilities) new ChromeDriver());

        driver.manage().window().maximize();

    }
    @Test
    public void verifySearchTest() {
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Akshay Kumar");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
    }
    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
