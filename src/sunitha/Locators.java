package sunitha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;

public class Locators {

	static WebDriver driver;

	public static void main(String[] args) throws Exception  {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");  
		driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://seleniumlearn.com/");
        Thread.sleep(3000);

        Actions act=new Actions(driver);

        act.moveToElement(driver.findElement(By.id("menu-336-1"))).build().perform();
        Thread.sleep(3000);
        act.moveToElement(driver.findElement(By.linkText("Selenium Quiz"))).click().perform();
	}

}
