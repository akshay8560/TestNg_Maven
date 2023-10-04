package AdvanceSelenium.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class WindowsHandle {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        String parentwindow=driver.getWindowHandle();
       // WebElement opennewWindowbtn=driver.findElement(By.id("newWindowBtn"));
       // WebElement opennewTabbtn=driver.findElement(By.id("newTabBtn"));
        WebElement opennewWindowbtn=driver.findElement(By.id("newTabsBtn"));
        opennewWindowbtn.click();
        WebElement enterName=driver.findElement(By.xpath("//input[@id='name']"));
        System.out.println("parent window"+parentwindow);

        //opennewTabbtn.click();

        /*WebElement enterName=driver.findElement(By.xpath("//input[@id='name']"));
        System.out.println("parent window"+parentwindow);

        Set<String>ChidTabOpen=driver.getWindowHandles();

        for (String newTab:ChidTabOpen){
            System.out.println("child Tab"+newTab);
           // driver.switchTo().window(newTab);
            WebElement firstName=driver.findElement(By.xpath("//button[@id='alertBox']"));
            WebElement secod=driver.findElement(By.id("//button[@id='confirmBox']"));
            firstName.click();
            secod.click();


        }
*/
        Set<String> childwinpdew=driver.getWindowHandles();
        for (String handles:childwinpdew){
            System.out.println("child window"+handles);
            if(!handles.equals(parentwindow)){
                driver.switchTo().window(handles);

                WebElement firstName=driver.findElement(By.xpath("//input[@id='firstName']"));
                WebElement lastname=driver.findElement(By.xpath("//input[@id='lastName']"));

                firstName.sendKeys("Akshay");
                lastname.sendKeys("Kumar");
                //driver.close();
            }



        }
        driver.switchTo().window(parentwindow);
        enterName.sendKeys("Akshay Kumar");
        driver.quit();

    }
}
