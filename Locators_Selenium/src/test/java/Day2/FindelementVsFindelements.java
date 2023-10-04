package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindelementVsFindelements {
    public static void main(String[] args) {
        System.out.println("find element");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        /*WebElement storeelemt=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        storeelemt.sendKeys("Akshay Kumar");*/



//        WebElement storeelemts=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/ancestor::*/parent::div"));
//        System.out.println(storeelemts.getText());


//           List<WebElement> storelist=driver.findElements(By.xpath("//input[@id='twotabsearchtextbox']/ancestor::*/parent::div"));
//           System.out.println(storelist.size());


    }
}
