package pom_pack;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//div[text()='My Naukri']")
	private WebElement mynaukri;
	@FindBy(xpath="//a[text()='Recruiter Messages']")
	private WebElement recruitermessage;
	
	public HomePage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnMyNaukri(WebDriver driver)
	{
//		ArrayList<String>addr= new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(addr.get(0));
		Actions action= new Actions(driver);
	action.moveToElement(mynaukri).perform();
	}
	public void clickOnrecruitermessage(WebDriver driver) 
	{
		Actions action= new Actions(driver);
		action.moveToElement(recruitermessage).click().build().perform();
		//recruitermessage.click();
	}

}
