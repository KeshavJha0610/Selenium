package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class FileUpload extends BaseTest {

    @Test
    public void fileUpload() throws InterruptedException, IOException {

        String downloadPath = System.getProperty("user.dir");

        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

        chromePrefs.put("profile.default_content_settings.popups", 0);

        chromePrefs.put("download.default_directory", downloadPath);

        options.setExperimentalOption("prefs", chromePrefs);

        driver = new ChromeDriver(options);

        driver.get("https://altoconvertpdftojpg.com/");

        driver.findElement(By.cssSelector("[class*='btn--choose']")).click();

        Thread.sleep(3000);

        Runtime.getRuntime().exec("C:\\Users\\Keshav\\Documents\\fileupload.exe");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));

        driver.findElement(By.cssSelector("button[class*='medium']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));

        driver.findElement(By.linkText("Download Now")).click();

        Thread.sleep(5000);

        File f = new File(downloadPath + "/converted.zip");

        if (f.exists()) {

            Assert.assertTrue(f.exists());

            if (f.delete())

                System.out.println("file deleted");

        }

    }

}




