package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpicejetDropdown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        // OriginStation

        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

        driver.findElement(By.cssSelector("a[value='DEL']")).click();

        System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']"))
                .getAttribute("value"));

        // Destination

        driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();

        driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();

        System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).getAttribute("value"));
        //using parent child relationship
        //in xpath we give /  but in css we give space from parent to child
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

    }

}
