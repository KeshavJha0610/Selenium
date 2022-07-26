package seleniumconcepts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CSSselectors extends BaseTest {

    @Test
    public void selectors() {
        //xpath=//tagname[@attribute='value']
        //css= tagname[attribute='value'] .tagname is optional in css
        //* means any tag
        driver.get("https://login.salesforce.com");
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("keshav");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@id='Login']")).click();
        //driver.findElement(By.cssSelector("#Login")).click();
    }

}
