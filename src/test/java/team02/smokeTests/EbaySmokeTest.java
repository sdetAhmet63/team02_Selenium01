package team02.smokeTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import team02.pages.EbayPage;
import team02.utilities.ConfigurationReader;
import team02.utilities.Driver;

import java.util.List;

public class EbaySmokeTest {

    @Test
    public void test1(){
        Driver.getDriver().get(ConfigurationReader.getProperty("ebayUrl"));
        EbayPage login = new EbayPage();
        login.aramaKutusu.sendKeys(ConfigurationReader.getProperty("ebayText"));
        login.araButonu.click();
        System.out.println(login.sonucYazisi.getText());
        Driver.getDriver().navigate().back();
        login.allCategory.click();
        Select select = new Select(login.allCategory);
        List<WebElement> list =select.getOptions();
        for (WebElement w:list ) {
            System.out.println(w.getText());

        }
        System.out.println();

        int count = 0;
        for (WebElement w : list){
            if(w.getText().length()%2==1) {
                count++;
            }
        }
        System.out.println("All categories icinde uzunlugu tek olan "+count+" tane sekme vardir");
    }
    @AfterClass
    public void test2(){
    Driver.closeDriver();
    }


}
