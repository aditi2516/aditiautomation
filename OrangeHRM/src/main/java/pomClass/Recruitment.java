package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Recruitment {
	Select select;
	@FindBy(xpath="//b[text()='Recruitment']")
	private WebElement recruitment;
	@FindBy(xpath="//img[@class='ui-datepicker-trigger']")
	private WebElement datepicker;
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement selectMonth;
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement selectYear;
	@FindBy(xpath="//a[text()='25']")
	private WebElement selectDate;

	
	public Recruitment(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
public void clickOnDatepicker()
{
	datepicker.click();
}
	public void clickOnRecruitment()
	{
		recruitment.click();
	}
	public void clickOnSelectMonth()
	{
		selectMonth.click();
		 select=new Select(selectMonth);
		select.selectByVisibleText("Jun");
		
	}
	public void clickOnSelectYear() {
		selectYear.click();
		select=new Select(selectYear);
		select.selectByVisibleText("2025");
	}
	public void clickOnSelectDate(WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(selectDate).click().build().perform();
		
	}
}
