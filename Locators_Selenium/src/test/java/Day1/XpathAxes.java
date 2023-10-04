package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class XpathAxes {
    public static void main(String[] args) {
        System.out.println("Hello Xpath Axes");

        WebDriver driver=new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
       // String element=driver.findElement(By.xpath("//*[contains(a,'IFCI Ltd')]/self::a")).getText();
       // String element=driver.findElement(By.xpath("//tbody/tr[9]/td[1]")).getText();

        //1.
        // self
     /*   String element=driver.findElement(By.xpath("//a[contains(text(),'IFCI Ltd.')]/self::a")).getText();
        System.out.println(element);*/


        //2
        // parent

//        String element=driver.findElement(By.xpath("//a[contains(text(),'IFCI Ltd.')]/parent::td")).getText();
//        System.out.println(element);

        //3
        //ancestor
//        String element=driver.findElement(By.xpath("//a[contains(text(),'IFCI Ltd.')]/ancestor::tr")).getText();
//        System.out.println(element);


        //4
        //child
//        List<WebElement> element=driver.findElements(By.xpath("//a[contains(text(),'IFCI Ltd.')]/ancestor::tr/child::td"));
//        System.out.println(element.size());
//


        //5
        // descendant
//        List<WebElement> element=driver.findElements(By.xpath("//a[contains(text(),'IFCI Ltd.')]/ancestor::tr/descendant::*"));
//        System.out.println(element.size());



        //6
        //following

    /*    List<WebElement> element=driver.findElements(By.xpath("//a[contains(text(),'IFCI Ltd.')]/ancestor::tr/following::tr"));
        System.out.println(element.size());
*/

        //7
        //following-sibling

        /*List<WebElement> element=driver.findElements(By.xpath("//a[contains(text(),'IFCI Ltd.')]/ancestor::tr/following-sibling::tr"));
        System.out.println(element.size());*/



        //8
        //preceding

//        List<WebElement> element=driver.findElements(By.xpath("//a[contains(text(),'IFCI Ltd.')]/ancestor::tr/preceding::tr"));
//        System.out.println(element.size());
//


        //9
        //preceding-sibling

        List<WebElement> element=driver.findElements(By.xpath("//a[contains(text(),'IFCI Ltd.')]/ancestor::tr/preceding-sibling::tr"));
        System.out.println(element.size());

    }
}
