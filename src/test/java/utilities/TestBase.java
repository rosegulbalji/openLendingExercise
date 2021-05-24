package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;
    public Actions actions;

    @BeforeClass
    public static void setup(){
        Driver.getDriver();
    }

    @Before
    public void startTest(){
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        actions = new Actions(driver);
    }

    @After
    public void cleaning(){
        Driver.closeDriver();

    }
}