package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchPage {

    public SearchPage(){PageFactory.initElements(Driver.getDriver(), this); }

        @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
        public WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[4]/div/div/div[1]/a/h3")
    public WebElement linkedIn;

    @FindBy(xpath = "//*[@id=\"main-content\"]/section[1]/section[1]/div/div[2]/div[1]/h4")
    public WebElement actualText;


    }

