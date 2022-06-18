package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Friends {
	@FindBy(xpath="//a[@aria-label='Friends']")
	private WebElement friends;
	@FindBy(xpath="//span[text()='Friend requests']")
	private WebElement friendrequest;
	
	public Friends(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnFriends() {
		friends.click();
	}
	public void clickOnfriendrequest() {
		friendrequest.click();
	}

}
