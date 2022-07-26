package seleniumconcepts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumdemo {

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Keshav\\Downloads\\chromedriver_win32.exe");
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");//hit url on the browser
        System.out.println(driver.getTitle());//page title is correct
        System.out.println(driver.getCurrentUrl());//validate if you are landed on current url
        //System.out.println(driver.getPageSource());
        driver.get("https://yahoo.com");
        driver.navigate().back();
        driver.close();//it closes current browser
        //driver.quit();//closes all the browser opened by selenium script

    }

}
