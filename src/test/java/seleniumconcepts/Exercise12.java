package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Exercise12 extends BaseTest {

    @Test
    public void exercise() {


        driver.get("http://qaclickacademy.com/practice.php");

        driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();

        String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));

        Select s = new Select(dropdown);

        s.selectByVisibleText(opt);

        driver.findElement(By.name("enter-name")).sendKeys(opt);

        driver.findElement(By.id("alertbtn")).click();

        String text = driver.switchTo().alert().getText();

        if (text.contains(opt)) {

            System.out.println("Alert message success");

        } else

            System.out.println("Something wrong with execution");

    }


    //  System.out.println( driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());


}