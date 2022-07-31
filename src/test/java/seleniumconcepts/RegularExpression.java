package seleniumconcepts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegularExpression extends BaseTest {

    @Test
    public void regularExpression() {
        driver.get("https://www.rediff.com");
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
        driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
        driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();


         /* parent-child relationship
          div[@class='1st-c']/div/div[2]/div/input  div[2] is for second child
          *[@id='table1']/following-sibling::li[2] - when we have to reach 2nd sibling
          *[@id='table1']/parent::ul - when we have to reach parent from child*/


    }
}
