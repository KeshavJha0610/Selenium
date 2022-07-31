package seleniumconcepts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators2 extends BaseTest {

    @Test
    public void locatorsDemo() {
        driver.get("https://login.salesforce.com");
        driver.findElement(By.name("username")).sendKeys("name");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id='Login']")).click();
        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

    }

}
