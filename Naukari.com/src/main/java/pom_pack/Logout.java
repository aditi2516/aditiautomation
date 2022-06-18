package pom_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	@FindBy(xpath="//a[@title='Logout']")
	private WebElement logout;
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
public void clickOnLogin()
{
	logout.click();
}
}
