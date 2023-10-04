package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class locatordemo {
    public static void main(String[] args) {
        System.out.println("Hello Akshay");
        WebDriver driver=new ChromeDriver();
       // driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //driver.manage().window().fullscreen();
       // driver.manage().window().maximize();
        //driver.quit();

//        WebElement uname=driver.findElement(By.name("username"));
//        uname.sendKeys("Admin");

/*
        By pass=By.name("username");
        WebElement uname= driver.findElement(pass);
        uname.sendKeys("Admin");*/


       /*driver.findElement(By.name("username")).sendKeys("Admin");
       driver.findElement(By.name("password")).sendKeys("admin123");*/
      // driver.findElement(By.cssSelector("button[type='submit']")).click();


     //  driver.findElement(By.className("orangehrm-login-forgot")).click();

     //   System.out.println("size="+driver.findElements(By.tagName("img")).size());


        // className locators


        //System.out.println("size of the class: "+driver.findElements(By.className("oxd")).size());


        // tagName
//        System.out.println("tag"+ driver.findElements(By.tagName("a")).size());
//        System.out.println("tag"+ driver.findElements(By.tagName("p")).size());
    }
}
