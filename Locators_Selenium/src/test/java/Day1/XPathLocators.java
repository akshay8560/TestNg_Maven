package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XPathLocators {
    public static void main(String[] args) {
        System.out.println("Hello Xpath");

        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Abs xpath or full xpath

        /*driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Admin");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("admin123");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
*/

        // Relative Xpath or partial xpath

        /*driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@type='submit']")).click();*/


       //1. //Xpath with OR operator

        //driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("Admin");

//        driver.findElement(By.xpath("//*[@name='username' or @placeholder='Username']")).sendKeys("Admin");
//        driver.findElement(By.xpath("//*[@name='password' or @placeholder='Password']")).sendKeys("admin123");
//        driver.findElement(By.xpath("//*[@type='submit']")).click();



       //2.
        // Xpath with And operator

        //driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("Admin");
/*
        driver.findElement(By.xpath("//*[@name='username' and @placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@name='password' and @placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@type='submit']")).click();*/

        //3.
        // Xpath with Contains;

       /* driver.findElement(By.xpath("//*[contains(@name,'name')]")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[contains(@name,'word')]")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();*/

        //4.
        // Xpath with starts-with;

//        driver.findElement(By.xpath("//*[starts-with(@name,'user')]")).sendKeys("Admin");
//        driver.findElement(By.xpath("//*[starts-with(@name,'pass')]")).sendKeys("admin123");
//        driver.findElement(By.xpath("//*[starts-with(@type,'submit')]")).click();


         // 5.
        // Xpath with text


       // driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();


        // 6.
        // chained xpath
        driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']//p[1]")).click();
    }


}
