package tirupatinews;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeBrowserLaunch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");  // Your chromedriver path.
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    

		/*
		 * driver.get("http://seleniumlearn.com/confirmation-dialog-box");
		 * 
		 * driver.findElement(By.xpath("//*[@id='node-102']/div/div[1]/div/div/button"))
		 * .click(); Thread.sleep(5000); driver.switchTo().alert().accept();// accept
		 * means :click on "OK" option button // driver.switchTo().alert().dismiss(); //
		 * dismiss means : click on "Cancel" option button
		 */
	}

}
