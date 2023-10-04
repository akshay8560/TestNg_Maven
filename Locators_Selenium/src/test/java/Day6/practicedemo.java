package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class practicedemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Akshay");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");

        // css locator
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Akshay");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kumar");


        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Devgaon mahaono ki dhani ");


        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");

        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("6377066167");

        WebElement radiobtton =driver.findElement(By.xpath("//input[@value='Male']"));
        radiobtton.click();


        WebElement radiobtton1 =driver.findElement(By.xpath("//input[@id='checkbox2']"));
        radiobtton1.click();

        Thread.sleep(3000);


       /*

        List<WebElement> dropdown1 =driver.findElements(By.xpath("//div[@name='Languages']"));
       // String str=dropdown1.toString();
        Select select=new Select((WebElement) dropdown1);
        select.selectByVisibleText("French");*/


        WebElement dropdown1 =driver.findElement(By.xpath("//select[@id='Skills']"));
        Select select=new Select((WebElement) dropdown1);
        select.selectByVisibleText("C++");



        /*WebElement dropdown2 =driver.findElement(By.xpath("//select[@id='countries']"));
        Select select2=new Select((WebElement) dropdown2);
        select2.selectByVisibleText("INDIA");
        */

        WebElement dropdown2 =driver.findElement(By.xpath("//select[@id='country']"));
        Select select2=new Select((WebElement) dropdown2);
        select2.selectByVisibleText("India");

        WebElement dropdown5 =driver.findElement(By.xpath("//select[@id='yearbox']"));
        Select select5=new Select((WebElement) dropdown5);
        select5.selectByVisibleText("2001");
        Thread.sleep(3000);

        WebElement dropdown3 =driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
        Select select3=new Select((WebElement) dropdown3);
        select3.selectByVisibleText("May");

        WebElement dropdown4 =driver.findElement(By.xpath("//select[@ng-model='daybox']"));
        Select select4=new Select((WebElement) dropdown4);
        select4.selectByVisibleText("10");


        Thread.sleep(3000);

        driver.findElement(By.id("firstpassword")).sendKeys("Akshaykumar@123");
        Thread.sleep(3000);


        driver.findElement(By.id("secondpassword")).sendKeys("Akshaykumar@123");


        driver.findElement(By.id("submitbtn")).click();




    }
}
