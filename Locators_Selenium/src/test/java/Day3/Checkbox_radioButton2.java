package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_radioButton2 {
    public static void main(String[] args) {
        System.out.println("hello");

        WebDriver  driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");

        //Radio Button
        WebElement rdb1 =driver.findElement(By.xpath("//input[@value='Option 1']"));
        rdb1.click();

        WebElement rdb2 =driver.findElement(By.xpath("//input[@value='Option 2']"));
        rdb2.click();



        // checkbox
        WebElement chbox1 =driver.findElement(By.xpath("//input[@value='checkbox1']"));
       // chbox1.click();

        WebElement chbox2 =driver.findElement(By.xpath("//input[@value='checkbox2']"));
       // chbox2.click();

        WebElement chbox3 =driver.findElement(By.xpath("//input[@value='checkbox3']"));
       // chbox3.click();
        //chbox1.click();
        /*if (chbox1.isSelected()) {
            System.out.println("Checkbox is Toggled On");

        } else {
            System.out.println("Checkbox is Toggled Off");
        }
*/



    }
}
