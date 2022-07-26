package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class JavascriptExecutorDemo extends BaseTest {

    @Test
    public void javascriptExecutor() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum = 0;
        for (int i = 0; i < values.size(); i++) {
            sum = sum + Integer.parseInt(values.get(i).getText());
        }
        System.out.println(sum);
        driver.findElement(By.cssSelector(".totalAmount")).getText();
        int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());

        Assert.assertEquals(sum, total);


    }

}
