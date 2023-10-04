package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804791&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D1007805%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwxuCnBhDLARIsAB-cq1pmEQIeVMaHPSBi5VFpNV4RaX-D1ojFLf8Us-abmSs0Jvf5cDxG4X0aAnkzEALw_wcB");

        WebElement selectday=driver.findElement(By.name("birthday_day"));

        Select select=new Select(selectday);
       // select.selectByValue("20");

        //Thread.sleep(3000);

        //select.selectByIndex(Integer.parseInt("30"));

        //Thread.sleep(3000);

      /* select.selectByVisibleText("25");

        Thread.sleep(3000);*/
        //select.getFirstSelectedOption();
        //System.out.println("before "+select.getFirstSelectedOption().getText());

        //select.deselectByVisibleText("6");

    }
}
