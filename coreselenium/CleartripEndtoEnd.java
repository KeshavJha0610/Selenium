package coreselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CleartripEndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// dropdown with select tag.if tagname is select then the element will be static
		// object.method.through object we can call methods
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
		//driver.close();



	}

}
