package seleniumconcepts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class HerokuExercise extends BaseTest {

    @Test
    public void herokuExercise() {
        driver.get("http://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Multiple Windows")).click();


        driver.findElement(By.cssSelector("a[href*='windows']")).click();


        Set<String> abc = driver.getWindowHandles();


        Iterator<String> it = abc.iterator();


        String parentWindow = it.next();


        driver.switchTo().window(it.next());


        System.out.println(driver.findElement(By.xpath("//div/h3")).getText());

        driver.switchTo().window(parentWindow);


        System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());


    }

}


