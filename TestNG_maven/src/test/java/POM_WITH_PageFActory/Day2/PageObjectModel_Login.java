package POM_WITH_PageFActory.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageObjectModel_Login {

    WebDriver driver;

    public PageObjectModel_Login(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(how = How.XPATH,using = "//input[@name='username']")
    WebElement username;

    @FindBy(how = How.XPATH,using = "//input[@name='password']")
    WebElement password;


    @FindBy(how = How.XPATH,using = "//button[@type='submit']")
    WebElement loginbtn;


    public void clickloginBtn(){
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginbtn.click();
    }

}
