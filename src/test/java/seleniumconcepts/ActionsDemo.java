package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDemo extends BaseTest {

    @Test
    public void actionDemo() {
        driver.get("https://www.amazon.com/");
        Actions a = new Actions(driver);
        WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().perform();
        //moves to specific element
        a.moveToElement(move).contextClick().build().perform();
        //Drag and drop
    }

}
