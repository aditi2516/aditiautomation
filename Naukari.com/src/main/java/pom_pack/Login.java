package pom_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(xpath="//a[@id='login_Layer']")
	private WebElement login;
	@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']")
	private WebElement emailid;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath="//button[text()='Login']")
	private WebElement logintab;
	
	public   Login(WebDriver driver)
	{
		PageFactory.initElements(driver ,this);
		
	}
	public void clickOnLogin()
	{
		login.click();
	}
	public void sendKeysemailid()
	{
		emailid.sendKeys("kulkarniaditi1225@gmail.com");
	}
	public void sendKeysPassword()
	{
		password.sendKeys("Adiraj1225$");
	}
public void clickOnLogintab()
{
	logintab.click();
}
}
