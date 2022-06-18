package TestclassLogin;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomclass.Friends;
import pomclass.LoginClass;

public class TestClassLogin {
	
		public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\chromedriver_win32\\chromedriver.exe ");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		LoginClass loginClass =new LoginClass (driver);
		loginClass.sendKeysemail();
		loginClass.sendKeyspassword();
		loginClass.clickOnlogin();
		Thread.sleep(2000);
//		ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(addr.get(0));
//		loginClass.clickOnyourProfil();
//		Thread.sleep(2000);
//		loginClass.clickOnLogout();
		Friends friends=new Friends(driver);
				
	friends.clickOnFriends();
	Thread.sleep(2000);
	friends.clickOnfriendrequest();
	Thread.sleep(2000);
	
	
	loginClass.clickOnyourProfil();
	Thread.sleep(2000);
	loginClass.clickOnLogout(driver);
			System.out.println("weclome");
			System.out.println("thanku");
			System.out.println("New Change by tejaswini")
			
		

}
}
