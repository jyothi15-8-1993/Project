package maven.maven.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	WebDriver driver;
	@BeforeMethod(alwaysRun=true)
public void testLaunchBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jackb\\Desktop\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
}
@AfterMethod(alwaysRun=true)
public void testCloseBrowser() {
driver.quit();
}

}
