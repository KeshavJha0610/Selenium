package coreselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framesdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryui.com/droppable/");
		//driver.switchTo().frame(1);
		System.out.println(driver.findElements(By.tagName("iframe")).size());//to get no of all frames in a page
		driver.switchTo().frame(0);//frames using index
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));//frames using webelement
		driver.findElement(By.id("draggable")).click();
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();// coming back from frames to normal content
	}

}
