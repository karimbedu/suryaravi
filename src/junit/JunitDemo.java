package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

class JunitDemo {

	WebDriver driver;
	Screen s = new Screen();

	@Test
	void test() throws InterruptedException, SikuliException {

		s.click("E:\\Selenium\\Sikuli\\Wify.PNG");

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "E:\\SeleniumIDE\\chromedriver.exe"); // Your chromedriver path. driver=new
		 * ChromeDriver(); driver.manage().window().maximize();
		 * //driver.get("http://www.google.com");
		 * 
		 * 
		 * driver.get("http://seleniumlearn.com/confirmation-dialog-box");
		 * 
		 * s.type("E:\\SeleniumIDE\\Search.PNG", "Java");
		 * 
		 * driver.findElement(By.id("edit-submit")).click();
		 * 
		 * //
		 * driver.findElement(By.xpath("//*[@id='node-102']/div/div[1]/div/div/button"))
		 * .click(); Thread.sleep(3000);
		 * 
		 * s.click("E:\\SeleniumIDE\\Ok.PNG");
		 * 
		 * 
		 * 
		 * 
		 * driver.findElement(By.xpath("//*[@id='node-102']/div/div[1]/div/div/button"))
		 * .click(); Thread.sleep(5000); driver.switchTo().alert().accept();
		 * 
		 * // accept means :click on "OK" option button //
		 * driver.switchTo().alert().dismiss(); //dismiss means : click on "Cancel"
		 * option button
		 * 
		 */
	}

}
