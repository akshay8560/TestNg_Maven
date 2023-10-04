package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MevenDemo {
    public static void main(String[] args) {
        System.out.println("hello");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
    }
}
