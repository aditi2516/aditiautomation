package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass {
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	@FindBy(xpath="//button[@name='login']")
	private WebElement signin;
	@FindBy (xpath="//div[@aria-label='Your profile']")
	private WebElement yourprofile;
	@FindBy(xpath="(//div[@class='qzhwtbm6 knvmm38d'])[17]")
	private WebElement logout;
	public  LoginClass (WebDriver driver) 
	{
		PageFactory.initElements(driver ,this);
	}
	public void sendKeysemail() {
		email.sendKeys("9511725196");
	}
	public void sendKeyspassword()
	{
		password.sendKeys("adiraj1225$");
	}
	public void clickOnlogin() {
	signin.click();
	}
	public void clickOnyourProfil()
	{
		yourprofile.click();
	}
	public void clickOnLogout(WebDriver driver) {
//		Actions action=new Actions(driver);
//		action.moveToElement(logout).click().build().perform();
		logout.click();
	}
}
