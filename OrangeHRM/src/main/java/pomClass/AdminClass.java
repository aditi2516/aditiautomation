package pomClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminClass {
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']")
	private WebElement admin;
	@FindBy(xpath="//a[@id='menu_admin_nationality']")
	private WebElement nationality;
	@FindBy(xpath="//input[@id='ohrmList_chkSelectRecord_82']")
	private WebElement indian;
	@FindBy(xpath="//table[@id='resultTable']//td[@class='left']//a[text()='Indian']")
	private WebElement indianName;
	
	
	public AdminClass (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickOnAdmin()
	{
		admin.click();  
	}
	public void clickOnNationality()
	{
		nationality.click();
	}
	public void clickOnIndianName(WebDriver driver)

	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)"); 
		indianName.click();
		
		indian.click();
	}
	
}
