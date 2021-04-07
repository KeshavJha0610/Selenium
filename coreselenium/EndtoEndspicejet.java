package coreselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndtoEndspicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		driver.findElement(By.cssSelector("a[value='DEL']")).click();

		System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']"))
				.getAttribute("value"));
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();

		driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();

		System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']"))
				.getAttribute("value"));
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{

			System.out.println("its disabled");

			Assert.assertTrue(true);

		}

		else

		{

			Assert.assertTrue(false);

		}
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
		driver.findElement(By.id("divpaxinfo")).click();

		List<WebElement> numbers = driver.findElements(By.id("divpaxinfo"));
		for (WebElement number : numbers)
		{
			if(number.getText().equals("5"))
			{
				number.click();
				break;
			}
		}
//		for (int i = 1; i < 5; i++) 
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//
//		}
//		driver.findElement(By.id("btnclosepaxoption")).click();
//		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

	}

}
