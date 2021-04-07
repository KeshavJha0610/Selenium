package coreselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
//		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("keshav");
//		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("keshav");
//		driver.findElement(By.xpath("//*[@value='1']")).click();
		
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("myowncss");
		driver.findElement(By.cssSelector("input#email")).sendKeys("myowncss");

		driver.findElement(By.cssSelector("[value='1']")).click();

				
	}

}
