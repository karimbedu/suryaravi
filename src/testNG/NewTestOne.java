package testNG;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestOne {
	WebDriver driver;

	@Test(enabled=false)

	public void IndentifyLoacatorElement() throws Exception {
		driver.get("https://www.selenium.dev/downloads/");

		{
			WebElement element = (WebElement) driver.findElement(By.xpath("/html/body/div/main/div[6]/div/div/ul/li[1]/p/a"));
			Coordinates coordinate = ((Locatable)element).getCoordinates(); 
			coordinate.onPage(); 
			coordinate.inViewPort();
		}    
	}


	@Test
	public void FullPageScreenshot() throws Exception {
		DateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time=dateFormat.format(date);
		System.out.println(time);
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(f, new File("E:\\Selenium\\Screenshot"+time+".png")); 
	}

	@Test // Print Full Screenshot
	public void TakeScreenShot() throws Exception{
		driver.get("http://www.google.com");
		FullPageScreenshot();
	}







	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");  // Your chromedriver path.
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	}

}
