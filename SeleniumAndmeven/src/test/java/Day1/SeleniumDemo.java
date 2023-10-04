package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) {
        System.out.println("hello demo");
        WebDriver driver=new ChromeDriver();
        driver.findElement(By.className("information"));
       /* driver.get("https://www.google.com");
        driver.findElement(By.id("initialView"));*/


    }
}
