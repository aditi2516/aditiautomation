package TestPack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Basepack.BaseClass;
import pomClass.AdminClass;
import pomClass.LoginClass;
import pomClass.Logout;
import pomClass.Recruitment;
import util.UtilityClass;

public class TestNGLoginPage {
	WebDriver driver;
	LoginClass loginClass;
	AdminClass adminClass;
	Recruitment recruitment;
	Logout logout;
	@BeforeClass
	
	public void beforeClass()
	{
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver_win32\\chromedriver.exe");
	//	driver=new ChromeDriver();
	//	driver.get("https://opensource-demo.orangehrmlive.com/");
		driver=BaseClass.openChromeBrowser();
		System.out.println("before class");
	}
	@BeforeTest
//	public void launchBrowser()
//	{
////		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver_win32\\chromedriver.exe");
////		 driver=new ChromeDriver();
//		//String browser="Chrome";
//		
//			
//	
//		System.out.println("before test");
//	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		
		driver=BaseClass.openChromeBrowser();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 loginClass=new LoginClass(driver);
		loginClass.sendKeysUserName();
		Thread.sleep(2000);
		loginClass.sendKeysPassword();
		Thread.sleep(2000);
		loginClass.clickOnLogin();
		
		System.out.println("before method");
	}
	@Test
	public void testA() throws InterruptedException
	{
		 adminClass=new AdminClass(driver);
		adminClass.clickOnAdmin();
		adminClass.clickOnNationality();
		Thread.sleep(3000);
		adminClass.clickOnIndianName(driver);
		System.out.println("TestA");
	}
	@Test
	public void testB() throws InterruptedException
	{
		 recruitment=new Recruitment(driver);
		recruitment.clickOnRecruitment();
		Thread.sleep(2000);
		recruitment.clickOnDatepicker();
		Thread.sleep(2000);
		recruitment.clickOnSelectMonth();
		Thread.sleep(2000);
		recruitment.clickOnSelectYear();
		recruitment.clickOnSelectDate(driver);
		System.out.println("TestB");
	}
	@Test
	public void testC()
	{
		System.out.println("TestC");
		Assert.fail();
	}
	@Test
	public void testD()
	{
		System.out.println("TestD");
	}
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		 logout =new Logout(driver);
		logout.clickOnWelcome();
		Thread.sleep(2000);
		logout.clickOnLogout();
		
		System.out.println("after method");
	}
	@AfterTest
	public void afterTest() 
	{
		System.out.println("after test");
	}
	@AfterClass
	
		public void Screenshots(ITestResult result) throws IOException
		{
			if (ITestResult.FAILURE==result.getStatus()) 
			{
				UtilityClass.cpatureScreenshots(driver);
				System.out.println("after class");
				
			}
				
		}
		
		
	}
	

