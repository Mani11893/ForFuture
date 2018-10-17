package snapdeal;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class browse {
	WebDriver driver;
	
	@BeforeTest
	void before() throws IOException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\EXE\\chromedriver.exe");
		 driver= new ChromeDriver();
}
	@Test
	void run() throws InterruptedException
	{
		driver.get("http://toolsqa.com/automation-practice-form/");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#photo")).sendKeys("C:\\Users\\Mani\\Desktop\\Work.xlsx");
		Thread.sleep(10000);
		driver.close();
		
	}
}
