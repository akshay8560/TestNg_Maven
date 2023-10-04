package Evalutaion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class EvalutaionTest {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //driver.get("https://www.facebook.com/r.php?locale=en_GB");
        driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();

        String url="https://www.facebook.com";
        System.out.println("url of webpage"+url);
        String title =driver.getTitle();
        System.out.println("this is title"+title);
        //System.out.println("Title: "+"Facebook helps you connect and share with the people in your life");

        driver.findElement(By.name("firstname")).sendKeys("Akshay");
        driver.findElement(By.name("lastname")).sendKeys("Kumar");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("xyz@gmail.com");
        driver.findElement(By.xpath(("//input[@name='reg_email_confirmation__']"))).sendKeys("xyz@gmail.com");
       driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Akshay@123");


       WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
       Select selectday=new Select(day);
       selectday.selectByValue("10");

      /* WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
       Select selectmonth=new Select(month);
       selectmonth.selectByValue("5");*/


        WebElement selectmonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select seletmonts=new Select(selectmonth);
        seletmonts.selectByValue("5");

        WebElement selectyear=driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
        Select selectyr=new Select(selectyear);
        selectyr.selectByValue("2001");

       WebElement malebtn=driver.findElement(By.xpath("//input[@value='2']"));
       malebtn.click();

       WebElement submitbtn=driver.findElement(By.xpath("//button[@name='websubmit']"));
       submitbtn.click();



    }
}
