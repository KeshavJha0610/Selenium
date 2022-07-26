package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentchildxpath {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/interview.php");
        driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
        driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

        System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));

    }
}