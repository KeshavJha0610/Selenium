package seleniumconcepts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NestedFrames extends BaseTest {

    @Test
    public void nestedFrames() {
        driver.get("http://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Nested Frames")).click();

        driver.switchTo().frame("frame-top");

        driver.switchTo().frame("frame-middle");

        System.out.println(driver.findElement(By.id("content")).getText());

    }

}
