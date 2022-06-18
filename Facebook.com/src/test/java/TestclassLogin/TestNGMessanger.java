package TestclassLogin;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.tools.picocli.CommandLine.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import BacePack.BaseClass;
import pomclass.Friends;
import pomclass.LoginClass;
import pomclass.Messanger;


public class TestNGMessanger {
	WebDriver driver;
	LoginClass loginClass;
	Messanger messanger;
	Friends friends;
	
//	@BeforeSuite
//	public void launchBrowser(String browser)
//	
//	{
//		driver= new ChromeDriver();
////		if(browser.equals("chrome"))
////		{
////			driver=BaseClass.openChromeBrowser();
////		}
////		if(browser.equals("Opera"))
////		{
////			driver=BaseClass.openOperaBrowser();
////		}
////		if(browser.equals("Firefox"))
////		{
////			driver=BaseClass.openFireFoxBrowser();
////		}
////		if(browser.equals("Edge"))
////		{
////			driver=BaseClass.openEdgeBrowser();
////		}
//	driver.manage().window().maximize();
//	System.out.println("before suite");
//	}
//	
//	@BeforeTest
//	public void launchURL()
//	{
//		driver.get("https://www.facebook.com/");
//		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
//		
//		System.out.println(" before Test");
//	}
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("before Class");
	}
	@BeforeMethod
	public void beforeMethod() {
		
		 loginClass =new LoginClass (driver);
		loginClass.sendKeysemail();
		loginClass.sendKeyspassword();
		loginClass.clickOnlogin();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		System.out.println("before Method");
	}
	@Test
	public void testA() throws InterruptedException
	{
		 messanger=new Messanger(driver);
		Thread.sleep(2000);
		 messanger.clickOnMessanger();
		 Thread.sleep(2000);
		 messanger.clickOnsearchMessanger();
		 Thread.sleep(2000);
		 messanger.clickOnOptions();
		 Thread.sleep(2000);
		 messanger.disableInComingCallTab(driver);
		 Thread.sleep(2000);
		 messanger.clickOnuntilIturnItbackOn();
		 Thread.sleep(2000);
		 messanger.clickOndisabled();
		System.out.println("TestA");
	}
	@Test
	public void testB() throws InterruptedException 
	{
		 friends=new Friends(driver);
		friends.clickOnFriends();
		Thread.sleep(2000);
		friends.clickOnfriendrequest();
		Thread.sleep(2000);
		System.out.println("TestB");
	}
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		loginClass.clickOnyourProfil();
		Thread.sleep(2000);
		loginClass.clickOnLogout(driver);
		System.out.println("after Method");
	}
	@AfterClass
	public void afterclass()
	{
		driver.close();
		System.out.println("after Class");
	}
//	@AfterTest
//	public void afterTest()
//	{
//		System.out.println("after Test");
//	}
//	@AfterSuite
//	public void afterSuite()
//	{
//		driver.close();
//		System.out.println("after suite");
//	}
	
   
	
}