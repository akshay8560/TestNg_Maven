package Evalutaion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EvalutonTest2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/r.php?r=101");
        driver.findElement(By.name("firstname")).sendKeys("Akshay");
        driver.findElement(By.name("lastname")).sendKeys("Kumar");
        driver.findElement(By.name("reg_email__")).sendKeys("abcd@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("abcd@gmail.com");


        driver.findElement(By.name("reg_passwd__")).sendKeys("abcd@123");

        WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select select=new Select(day);
        select.selectByValue("10");

        WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select selectm=new Select(month);
        selectm.selectByValue("12");

        WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select selecty=new Select(year);
        selecty.selectByValue("2001");


        WebElement years=driver.findElement(By.xpath("//input[@value='2']"));
        years.click();

          WebElement sbmt=driver.findElement(By.xpath("//button[@name='websubmit']"));
        sbmt.click();



    }
}
