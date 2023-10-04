package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class loactordemo2 {
    public static void main(String[] args) {
        System.out.println("Hello Akshay");
        WebDriver driver=new ChromeDriver();
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://practice.automationtesting.in/my-account/");

        // for register

        /*driver.findElement(By.id("reg_email")).sendKeys("akshay860@gmail.com");
        driver.findElement(By.id("reg_password")).sendKeys("Akshay@860");
       // driver.findElement(By.name("register")).click();
        driver.findElement(By.cssSelector("input[type='submit']")).click();*/


        // for login

//        driver.findElement(By.id("username")).sendKeys("akshay1223@gmail.com");
//        driver.findElement(By.id("password")).sendKeys("Akshay@123");
//       // driver.findElement(By.name("register")).click();
//       // driver.findElement(By.cssSelector("input[type='submit']")).click();
//        driver.findElement(By.name("login")).click();


        // forget password
       // driver.findElement(By.linkText("Lost your password?")).click();
       // driver.findElement(By.partialLinkText("Lost your")).click();

    }
}
