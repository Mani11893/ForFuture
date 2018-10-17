package snapdeal;


import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class frame {
	
	WebDriver driver;
	Properties p;
	@BeforeTest
	void before() throws IOException
	{
		
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\EXE\\chromedriver.exe");
			 driver= new ChromeDriver();
		
//		 File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\object.properties");
//		 FileInputStream fil=new FileInputStream(file);
//		 p = new Properties();
//		 p.load(fil);
	}
	
	
	@Test
	void run()
	{
		driver.get("http://allwebco-templates.com/support/S_script_IFrame.htm");
//		JavascriptExecutor jp=(JavascriptExecutor)driver;
//		jp.executeScript("document.readyState").equals("complete");
//		System.out.println("Loaded");
		List<WebElement> win= driver.findElements(By.tagName("iframe"));
		win.size();
		for (WebElement web : win) {
			driver.switchTo().frame(web);
			System.out.println(driver.findElement(By.cssSelector(".colortitle")).getText());
			driver.switchTo().parentFrame();
		}
//		System.out.println(win.size());
//		driver.switchTo().frame("Framename");
System.out.println(driver.findElement(By.cssSelector(".colortitle")).getText());
//		
	}
	
	@AfterTest
	void exit()
	{
		driver.close();
	}


}
