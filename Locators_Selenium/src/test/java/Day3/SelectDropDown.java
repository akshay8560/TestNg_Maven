package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello ");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.get("https://demo.guru99.com/test/newtours/register.php");

//        Select select=new Select(driver.findElement(By.xpath("//select[@name='country']")));
//        select.selectByVisibleText("INDIA");
        WebElement element=driver.findElement(By.name("country"));
        Select select=new Select(element);
        select.selectByValue("INDIA");
        Thread.sleep(3000);
       // select.deselectByValue("ALBANIA");
       // driver.close();



    }
}
