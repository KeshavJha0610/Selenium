package coreselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://login.salesforce.com");
driver.findElement(By.name("username")).sendKeys("name");
driver.findElement(By.id("password")).sendKeys("123456");
driver.findElement(By.xpath("//*[@id='Login']")).click();
System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

	}

}
