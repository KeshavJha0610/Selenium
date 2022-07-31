package seleniumconcepts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ParentchildXpath extends BaseTest {

    @Test
    public void parentChildXpath() {

        driver.get("http://www.qaclickacademy.com/interview.php");
        driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
        driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

        System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));

    }
}