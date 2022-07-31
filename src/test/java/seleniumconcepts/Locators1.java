package seleniumconcepts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators1 extends BaseTest {

    @Test
    public void locators() {
        driver.get("https://www.facebook.com");
        //driver.findElement(By.className("inputtext")).sendKeys("hello");
        //driver.findElement(By.id("email")).sendKeys("Keshav");
        //driver.findElement(By.name("pass")).sendKeys("123456");
        //driver.findElement(By.linkText("Forgotten password?")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("keshav");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@value='1']")).click();//button is tagname or can give *


    }

}
