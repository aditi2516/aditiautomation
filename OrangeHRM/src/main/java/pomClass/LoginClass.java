package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass {
	@FindBy(xpath="//input[@name='txtUsername']")
	private WebElement username;
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement password;
	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement login;
	public  LoginClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendKeysUserName() {
		username.sendKeys("Admin");
	}
		public void sendKeysPassword()
		{
			password.sendKeys("admin123");
		}
		public void clickOnLogin()
		{
			login.click();
		
	}
}
