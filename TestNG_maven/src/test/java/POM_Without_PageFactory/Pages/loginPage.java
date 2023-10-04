package POM_Without_PageFactory.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    WebDriver driver;

    By username=By.xpath("//input[@id='userName']");
    By pasword=By.xpath("//input[@id='password']");
    By loginid=By.xpath("//button[@id='login']");

    public loginPage(WebDriver driver){
        this.driver=driver;
    }
    public void loginpagetc(){
        driver.findElement(username).sendKeys("gunjankaushik");
        driver.findElement(pasword).sendKeys("Password@123");
        driver.findElement(loginid).click();

    }

}
