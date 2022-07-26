package seleniumconcepts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AlertsDemo extends BaseTest {

    @Test
    public void alerts() {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        String text = "Keshav";


        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("name")).sendKeys(text);

        driver.findElement(By.cssSelector("[id='alertbtn']")).click();

        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();

        driver.findElement(By.id("confirmbtn")).click();

        System.out.println(driver.switchTo().alert().getText());


        driver.switchTo().alert().dismiss();

    }

}
