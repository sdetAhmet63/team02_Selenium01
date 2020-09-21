package team02.tests;

import com.sun.xml.internal.ws.server.ServerRtException;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import team02.pages.AmazonPages;
import team02.utilities.ConfigurationReader;
import team02.utilities.Driver;
import team02.utilities.TestBaseFinal;

import java.security.Key;

public class AmazonRaporTest extends TestBaseFinal {

    @Test
    public void amazonRapor(){

        extentTest = extentReports.createTest("amazonRapor","Ämazonda samsung arama yapma");
        extentTest.info("amazon.com`a gidelim");
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_url"));
        extentTest.info("webelementlere ulasmak icin AmazonPages nesnesi olusturalim");
        AmazonPages amazonPage = new AmazonPages(Driver.getDriver());
        extentTest.info("Amazonda samsung aramasi yapalim");
        amazonPage.aramaKutusu.sendKeys(ConfigurationReader.getProperty("amazonsearch_object")+ Keys.ENTER);
        extentTest.info("Arama sonucunu yazdiralim");
        System.out.println(amazonPage.sonucYazisi.getText());
        extentTest.info("Assert ile dogrulama islemi yapalim");
        String sonucYazisi =amazonPage.sonucYazisi.getText();
        Assert.assertTrue(sonucYazisi.contains(ConfigurationReader.getProperty("amazonsearch_object")));
        extentTest.pass("Test PASSED !");





    }
}
