package seleniumconcepts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WindowPopup extends BaseTest {

    @Test
    public void windowPopup() {
        //driver.get("https://the-internet.herokuapp.com/");
        //http://username:password@siteurl
        driver.get("http://admin:admin@the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Basic Auth")).click();

    }

}
