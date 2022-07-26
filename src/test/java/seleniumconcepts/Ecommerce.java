package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Ecommerce extends BaseTest {

    @Test
    public void ecommerceTest() throws InterruptedException {
        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        Thread.sleep(3000);

        addItems(itemsNeeded);

    }

    public void addItems(String[] itemsNeeded) {

        int j = 0;

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {

            // Brocolli - 1 Kg

            // Brocolli, 1 kg

            String[] name = products.get(i).getText().split("-");

            String formattedName = name[0].trim();

            // format it to get actual vegetable name

            // convert array into array list for easy search

            // check whether name you extracted is present in arrayList or not-

            List<String> itemsNeededList = Arrays.asList(itemsNeeded);

            if (itemsNeededList.contains(formattedName)) {

                j++;

                // click on Add to cart

                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if (j == itemsNeeded.length) {

                    break;

                }

            }

        }

    }

}
