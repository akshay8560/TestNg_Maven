package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GooglePagePractice {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.findElement(By.name("q")).sendKeys("Akshay Kumar");
      //  driver.findElement(By.xpath("//div[@class='vOY7J M2vV3'] //*[local-name() = 'svg']")).click();
       // driver.findElement(By.xpath("//div[@class='vOY7J M2vV3'] //*[local-name() = 'path']"));
        //driver.findElement(By.xpath("//div[@class='vOY7J M2vV3'] //*[local-name() = 'svg']//*[@d='M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z']")).click();
       // driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]/*[1]")).click();
//     driver.findElement(By.cssSelector("div.L3eUgb:nth-child(2) div.o3j99.ikrT4e.om7nvf:nth-child(3) div.A8SBwf.emcav:nth-child(1) div.RNNXgb:nth-child(3) div.SDkEP div.dRYYxd div.BKRPef:nth-child(4) div.vOY7J.M2vV3 span.ExCKkf.z1asCe.rzyADb svg:nth-child(1) > path:nth-child(1)")).click();


       // driver.findElement(By.cssSelector("div[role='button'][jsname='pkjasb']  span[class='ExCKkf z1asCe rzyADb']")).click();


      /*  try {
            // Find the div element with jsname="pkjasb"
            WebElement divElement = driver.findElement(By.cssSelector("div[jsname='pkjasb']"));

            // Find the span element with class name "ExCKkf z1asCe rzyADb" within the div
            WebElement spanElement = divElement.findElement(By.cssSelector("span.ExCKkf.z1asCe.rzyADb"));

            // Click on the span element
            spanElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
           // driver.quit();
        }
*/




    }
}
