package team02.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import team02.pages.AmazonPages;
import team02.utilities.TestBaseTeam02;

public class AmazonTest extends TestBaseTeam02 {

    @Test
    public void test01(){
        driver.get("http://amazon.com");

        AmazonPages testing= new AmazonPages(driver);

        testing.aramaKutusu.sendKeys("kindle" + Keys.ENTER);
        String sonuc = testing.sonucYazisi.getText();
        System.out.println(sonuc);


    }
}
