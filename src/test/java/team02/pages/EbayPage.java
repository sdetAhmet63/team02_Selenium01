package team02.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;

public class EbayPage {


    public EbayPage( ){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id = 'gh-ac']")
    public WebElement aramaKutusu;

    @FindBy (id = "gh-cat")
    public WebElement allCategory;

    @FindBy (id = "gh-btn")
    public WebElement araButonu;

    @FindBy (xpath = "//h1")
    public WebElement sonucYazisi;

//    @FindBy (xpath = "//select[@id=\"gh-cat\"]")
//    public WebElement dropDown;



}
