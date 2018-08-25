package group.id;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	
	@FindBy(xpath = "//*[@id='identifierId']")
	WebElement id;
	@FindBy(css = ".CwaK9")
	List<WebElement> enter;
	@FindBy(xpath = "//*[@name='password']")
	WebElement pwd;
	@FindBy(xpath = "//*[@id='passwordNext']/content/span")
	WebElement submit;
	@FindBy(xpath = "//*[@id=':2y']")
	WebElement pri;
	@FindBy(css = "span.ts")
	List<WebElement> count;
	public void enterid()
	{
		id.sendKeys("manishdangwal8");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void enter_pass()
	{
		enter.get(1).click();
		//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}
	public void pass()
	{
	pwd.sendKeys("enter");	
	
	}
	public void sub() throws InterruptedException
	{
		submit.click();
		Thread.sleep(1000);
	}

	public void pri()
	{
		if(pri.isSelected());
		{
			System.out.println("Selected");
		}
	}
	public void getcount()
	{
		
		System.out.println(count.get(2).getText());
	}
}
