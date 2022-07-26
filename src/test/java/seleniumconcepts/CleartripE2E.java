package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CleartripE2E extends BaseTest {

    @Test
    public void clearTripE2E() throws InterruptedException {
        driver.get("https://www.cleartrip.com/");
        Thread.sleep(3000);
        // dropdown with select tag.if tagname is select then the element will be static
        // object.method.through object we can call methods
        driver.findElement(By.xpath("//*[local-name()='svg' and contains(@class,'c-pointer c-neutral')]")).click();
        driver.findElement(By.id("DepartDate")).click();
        driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
        WebElement adult = driver.findElement(By.id("Adults"));
        Select s = new Select(adult);
        s.selectByIndex(1);
        WebElement ch = driver.findElement(By.id("Childrens"));
        Select s1 = new Select(ch);
        s1.selectByIndex(1);
        driver.findElement(By.id("MoreOptionsLink")).click();
        driver.findElement(By.id("AirlineAutocomplete")).sendKeys("keshav");
        driver.findElement(By.id("SearchBtn")).click();
        System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

    }

}
