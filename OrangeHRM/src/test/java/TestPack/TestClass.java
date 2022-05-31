package TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClass.AdminClass;
import pomClass.LoginClass;
import pomClass.Logout;

public class TestClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//driver.manage().timeouts().implicitlyWait(2000, TimeOutUnit.)
	Thread.sleep(2000);
	LoginClass loginClass=new LoginClass(driver);
	loginClass.sendKeysUserName();
	Thread.sleep(2000);
	loginClass.sendKeysPassword();
	Thread.sleep(2000);
	loginClass.clickOnLogin();
	
	AdminClass adminClass=new AdminClass(driver);
	adminClass.clickOnAdmin();
	adminClass.clickOnNationality();
	Thread.sleep(3000);
	adminClass.clickOnIndianName(driver);
	
	Logout logout =new Logout(driver);
	logout.clickOnWelcome();
Thread.sleep(2000);
	logout.clickOnLogout();
	
	}
	

}
