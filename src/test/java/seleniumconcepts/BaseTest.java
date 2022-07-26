package seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    public ChromeOptions options;

    @BeforeClass
    public void configureSelenium() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        options = new ChromeOptions();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
