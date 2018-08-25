package com.play;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import group.id.HomePage;

public class Newauto {

	
		HomePage home;
		WebDriver driver;
		@BeforeClass
		public void abc()
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\EXE\\chromedriver.exe");
			 driver= new ChromeDriver();
			driver.get("https://gmail.com");
			 home = PageFactory.initElements(driver, HomePage.class);
		}
		@Test
		public void bcd()
		{
			home.enterid();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			home.enter_pass();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			home.pass();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			try {
				home.sub();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		@Test
		public void ccd()
		{
			home.pri();
		}
		
		@Test
		public void ddd()
		{
			home.getcount();
		}
		
		
		
		@AfterClass
		void exit()
		{
			driver.close();
		}
	}

	

