package coreselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//xpath=//tagname[@attribute='value']
				//css= tagname[attribute='value'] .tagname is optional in css
						//* means any tag
WebDriver driver = new ChromeDriver();
driver.get("https://login.salesforce.com");
driver.findElement(By.cssSelector("input[id='username']")).sendKeys("keshav");
driver.findElement(By.cssSelector("input[id='password']")).sendKeys("123456");
driver.findElement(By.xpath("//input[@id='Login']")).click();
//driver.findElement(By.cssSelector("#Login")).click();
	}

}
