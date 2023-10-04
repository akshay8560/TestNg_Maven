package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDiner {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world");

        WebDriver  driver=new ChromeDriver();
        driver.get("https://topswagcode.com/xpath/");

        //level 1
        // abs xpath //html/body/div[1]/div/div/div[2]/div[1]/div[3]
        //relative xpath

       // WebElement element=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/plate[2]"));
       /* WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
        element.sendKeys("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/plate"+ Keys.ENTER);
 */


        /*WebElement element1=driver.findElement(By.xpath("//input[@type='text']"));
        element1.sendKeys("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/plate"+ Keys.ENTER);
*/




        /*WebElement element=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/h1/span[1]"));
        element.click(); */



        /*Thread.sleep(2000);
        WebElement element=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div/a[2]"));*/


       /* element.click();
        element1.sendKeys("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//*[contains(@class,'strobe')]"+ Keys.ENTER);

        Thread.sleep(2000);
        element.click();
        element1.sendKeys("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//*[contains(@class,'strobe')]"+ Keys.ENTER);
*/


        for (int i=0;i<26;i++){

            Thread.sleep(2000);
            WebElement element1=driver.findElement(By.xpath("//input[@type='text']"));
            element1.sendKeys("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//*[contains(@class,'strobe')]"+ Keys.ENTER);
            element1.click();

            // System.out.println("level "+i+" :"+ element1.getText().toString());

        }
        //level 2
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/bento
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/bento

        // level 3
            // /html/body/div[1]/div/div[1]/div[2]/div[1]/div[3]/plate/apple

        // level 4
        //  /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/child::*

        //level 5
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/child::*/child::*

        // level 6
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/plate[1]

        // level 7
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/plate[1]/apple


        // level 8
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/plate[1]/pickle

        // level 9
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//apple[@class='small strobe']

        // level 10
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//orange[@class='small strobe']

        // level 11
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/bento//orange[@class='small strobe']

        // level 12
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//*[@class='strobe']

        // level 13
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//*[contains(@class,'strobe')]

        // level 14
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//*[contains(@class,'strobe')]

        // level 15
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//*[contains(@class,'strobe')]

        // level 16
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//*[contains(@class,'strobe')]

        // level 17
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//*[contains(@class,'strobe')]

        // level 18
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//*[contains(@class,'strobe')]

        // level 19
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//*[contains(@class,'strobe')]

        // level 20
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//*[contains(@class,'strobe')]

        // level 21
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//*[contains(@class,'strobe')]

        //level 22
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//*[contains(@class,'strobe')]

        // level 23
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//*[contains(@class,'strobe')]
        // level 24
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//*[contains(@class,'strobe')]

        // level 25
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//*[contains(@class,'strobe')]

        // level 26
        // /html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]//*[contains(@class,'strobe')]



    }
}
