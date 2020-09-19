package team02.smokeTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import team02.utilities.ConfigurationReader;
import team02.utilities.Driver;

public class GoogleSmokeTest {
    @Test
    public void test1(){
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));

    }
    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }
}
