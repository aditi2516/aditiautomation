package BacePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseClass {


		public static WebDriver openChromeBrowser() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			return driver;
		}
	public static WebDriver openFireFoxBrowser() {
			
			System.setProperty("webdriver.gecko.driver", "Facebook.com\\src\\test\\resources\\Browser\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			return driver;
		}
	public static WebDriver openEdgeBrowser() {
		
		System.setProperty("webdriver.edge.driver", "Facebook.com\\src\\test\\resources\\Browser\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		return driver;
	}
	public static WebDriver openOperaBrowser() {
		
		System.setProperty("webdriver.opera.driver", "Facebook.com\\src\\test\\resources\\Browser\\operadriver.exe");
		WebDriver driver=new OperaDriver();
		return driver;
	}
	}


