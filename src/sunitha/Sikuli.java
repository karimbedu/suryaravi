package sunitha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Sikuli {

	static Screen s = new Screen();
	static WebDriver driver;

	public static void main(String[] args) throws SikuliException, InterruptedException {
		Thread.sleep(5000);
		/*
		 * s.find("E:\\Selenium\\Sikuli\\Recyclebin.png");
		 * System.out.println("Recyclebin source image found");
		 * s.find("E:\\Selenium\\Sikuli\\Windowsicon.png");
		 * System.out.println("Windowsicon target image found");
		 * s.dragDrop("E:\\Selenium\\Sikuli\\Recyclebin.png",
		 * "E:\\Selenium\\Sikuli\\Windowsicon.png");
		 * System.out.println("Drag Drop sikuli successfully worked");
		 */
		//		 s.click("E:\\Selenium\\Sikuli\\paint.PNG");
		//
		//  s.click("E:\\Selenium\\Sikuli\\Wify.PNG");


		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");  
		driver=new ChromeDriver();
		driver.manage().window().maximize();

				driver.get("http://seleniumlearn.com/java");
		//	s.click("E:\\Selenium\\Sikuli\\Search.PNG");
		Thread.sleep(3000);
		s.type("E:\\Selenium\\Sikuli\\Search.PNG", "Purushotham Karimbedu");
		//Thread.sleep(3000);
		s.click("E:\\Selenium\\Sikuli\\Search-Botton.JPG");



	}

}
