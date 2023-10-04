package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDiner{
    public static void main(String[] args) {
        System.out.println("Hello Akshay");
        WebDriver driver=new ChromeDriver();
        driver.get("https://flukeout.github.io/");
        driver.findElement(By.cssSelector(""));
    }
}
