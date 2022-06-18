package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Messanger {
	@FindBy(xpath="(//div[@class='rq0escxv l9j0dhe7 du4w35lb'])[3]")
	private WebElement messanger;
	@FindBy(xpath="//input[@placeholder='Search Messenger']")
	private WebElement searchMessanger;
	@FindBy(xpath="//div[@aria-label='Options']")
	private WebElement options;
	@FindBy(xpath="(//input[@dir='ltr'])[3]")
	private WebElement incomingcallTab;
	@FindBy(xpath="(//i[@data-visualcompletion='css-img'])[19]")
	private WebElement untilIturnItbackOn;
	@FindBy(xpath="//div[@aria-label='Disable']")
	private WebElement disabled;
	
	public Messanger(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickOnMessanger()
	{
		messanger.click();
	}
	public void clickOnsearchMessanger()
	{
		searchMessanger.click();
	}
	public void clickOnOptions()
	{
		options.click();
	}
	public void disableInComingCallTab(WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.moveToElement(incomingcallTab);
		incomingcallTab.click();
		
	}
	public void clickOnuntilIturnItbackOn()
	{
		untilIturnItbackOn.click();
	}
	public void clickOndisabled()
	{
		disabled.click();
	}
}
