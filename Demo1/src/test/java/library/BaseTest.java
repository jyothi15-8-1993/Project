package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constants{
	public WebDriver driver;
	public WebDriverWait wait;
	@BeforeMethod(alwaysRun=true)
	public void testLaunchBrowser() {
		//System.setProperty("webdriver.gecko.driver","./browser/geckodriver.exe");
		System.setProperty("KEY", "PATH");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		wait=new WebDriverWait(driver, 20);
		
	}
	@AfterMethod(alwaysRun=true)
	public void testCloseBrowser() {
	driver.quit();
	}
	}

