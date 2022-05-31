package TestPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClass.LoginClass;
import pomClass.Recruitment;

public class RecruitmentTestClass {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	LoginClass loginClass=new LoginClass(driver);
	loginClass.sendKeysUserName();
	Thread.sleep(2000);
	loginClass.sendKeysPassword();
	Thread.sleep(2000);
	loginClass.clickOnLogin();
	
	Recruitment recruitment=new Recruitment(driver);
	recruitment.clickOnRecruitment();
	Thread.sleep(2000);
	recruitment.clickOnDatepicker();
	Thread.sleep(2000);
	recruitment.clickOnSelectMonth();
	Thread.sleep(2000);
	recruitment.clickOnSelectYear();
	recruitment.clickOnSelectDate(driver);
	
	
	
	
}
}