package seleniumconcepts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;


public class FilteringDemo extends BaseTest {
    @Test
    public void filteringDemo() {

        driver.get("https://rahulshettyacademy.com/greenkart/#/offers");

        driver.findElement(By.id("search-field")).sendKeys("Rice");

        List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));

        //1 results

        List<WebElement> filteredList = veggies.stream().filter(veggie -> veggie.getText().contains("Rice")).

                collect(Collectors.toList());

        //1 result

        Assert.assertEquals(veggies.size(), filteredList.size());


    }


}

