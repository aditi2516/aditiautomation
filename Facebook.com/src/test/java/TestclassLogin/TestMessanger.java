package TestclassLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomclass.LoginClass;
import pomclass.Messanger;

public class TestMessanger {
 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\chromedriver_win32\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		LoginClass loginClass =new LoginClass (driver);
		loginClass.sendKeysemail();
		loginClass.sendKeyspassword();
		loginClass.clickOnlogin();
		Messanger messanger=new Messanger(driver);
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
}
}
