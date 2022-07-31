package seleniumconcepts;

import org.testng.annotations.Test;

public class SeleniumDemo extends BaseTest {

    @Test
    public void seleniumDemo() {
        //System.setProperty("webdriver.chrome.driver", "/Users/keshav.jha/Downloads/chromedriver.exe");
        driver.get("https://google.com");//hit url on the browser
        System.out.println(driver.getTitle());//page title is correct
        System.out.println(driver.getCurrentUrl());//validate if you are landed on current url
        System.out.println(driver.getPageSource());
        driver.get("https://yahoo.com");
        driver.navigate().back();
        driver.close();//it closes current browser
        //driver.quit();//closes all the browser opened by selenium script

    }

}
