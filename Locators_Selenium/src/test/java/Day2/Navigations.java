package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
    public static void main(String[] args) {
        System.out.println("Hello");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com");
        //driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.amazon.com");

        driver.navigate().back();//google.com
        driver.navigate().forward();// amazon.com

       driver.navigate().refresh();

       // driver.close();
    }
}
