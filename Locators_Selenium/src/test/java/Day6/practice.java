package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class practice {
    public static void main(String[] args) {
        System.out.println("hello");
        WebDriver driver=new ChromeDriver();

       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // locators type
        //id, name,className,textlink,hypertextLink,xpath,css selector,tagname

        // 1. id
        // login with id locator
       /* driver.findElement(By.id("")).sendKeys("Admin");
        driver.findElement(By.id("")).sendKeys("admin123");*/

        //2.name

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        //driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();


        //driver.close();
        //driver.quit();

    }
}
