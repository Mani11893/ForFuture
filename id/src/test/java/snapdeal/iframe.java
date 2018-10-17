package snapdeal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class iframe {
	WebDriver driver;
	Properties p;
	@BeforeTest
	void before() throws IOException
	{
		
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\EXE\\chromedriver.exe");
			 driver= new ChromeDriver();
		
		 File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\object.properties");
		 FileInputStream fil=new FileInputStream(file);
		 p = new Properties();
		 p.load(fil);
	}
	
	
	@Test
	void run()
	{
		driver.get("https://flipkart.com");
		JavascriptExecutor jp=(JavascriptExecutor)driver;
		jp.executeScript("document.readyState").equals("complete");
		driver.findElement(By.xpath(p.getProperty("close"))).click();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(p.getProperty("close")))).contextClick();
		
	}
	
	@AfterTest
	void exit()
	{
		driver.close();
	}

}
