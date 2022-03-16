package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		Logger logger= Logger.getLogger("SeleniumLearnHomepage");
		PropertyConfigurator.configure("Log4j.properties");
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");  
		driver=new ChromeDriver();
		logger.info("Chrome Browser Opened");
		driver.manage().window().maximize();
		logger.info("browser maximize Opened");
		driver.get("http://www.seleniumlearn.com");
		logger.info("Website is entered");
		driver.findElement(By.linkText("Log4jhsdfh")).click();
		logger.info("Click on Log4j Tutorial");
		Thread.sleep(5000);
		logger.info("Wait for 5 sec...");
		driver.close();
		logger.info("Browser is closed");

	}

}
