package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.SearchPage;
import utilities.Driver;
import utilities.TestBase;


public class Search extends TestBase {

    SearchPage searchPage;

    @Test
    public void SearchTest(){

        Driver.getDriver().get("https://www.google.com/");

        // We need to check if we are on the right page
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));
        SearchPage searchPage = new SearchPage();

        searchPage.searchBox.sendKeys("Open Lending");
        searchPage.searchBox.sendKeys(Keys.ENTER);

        Actions actions = new Actions(driver);
        actions.moveToElement(searchPage.linkedIn).click().perform();
       // searchPage.linkedIn.click();

        String expectedText = "Say YES to more automotive loans.";
        Assert.assertEquals(searchPage.actualText.getText(), expectedText);

    }
}

