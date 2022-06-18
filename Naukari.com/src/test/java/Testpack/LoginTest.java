package Testpack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pom_pack.HomePage;
import pom_pack.Login;
import pom_pack.Logout;

public class LoginTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000 ,TimeUnit.MICROSECONDS);
		Login login=new Login(driver);
		login.clickOnLogin();
		Thread.sleep(2000);
		login.sendKeysemailid();
		login.sendKeysPassword();
		login.clickOnLogintab();
		Thread.sleep(2000);
		HomePage homepage=new HomePage(driver);
		
		Thread.sleep(2000);
		homepage.clickOnMyNaukri(driver);
		Thread.sleep(2000);
		homepage.clickOnrecruitermessage(driver);
		
		Logout logout =new Logout(driver);
		logout.clickOnLogin();
		
		
		
		
	}

}
