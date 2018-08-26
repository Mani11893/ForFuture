package flipkart;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class login {
	WebDriver driver;
	Properties p;
	@Parameters("browser")
	@BeforeTest
	void before(String browser) throws IOException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\EXE\\chromedriver.exe");
			 driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\EXE\\geckodriver.exe");
		 driver= new FirefoxDriver();
		}
		 File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\object.properties");
		 FileInputStream fil=new FileInputStream(file);
		 p = new Properties();
		 p.load(fil);
	}
	
	
	@Test
	void run()
	{
		driver.get("https://flipkart.com");
		driver.findElement(By.xpath(p.getProperty("close"))).click();
		
	}
	
	@AfterTest
	void exit()
	{
		driver.close();
	}

}
