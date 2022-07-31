package seleniumconcepts;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Miscellaneous extends BaseTest {

    @Test
    public void miscellaneous() throws IOException {
        //driver.manage().deleteCookieNamed("SessionKey");

        //click on any link
        //login page - verify login url

        driver.get("https://www.google.com");

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("/Users/keshav.jha/IdeaProjects/Selenium/src/test/resources/screenshot.png"));


    }

}
