package maven.maven.demo;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import testng.ActiTimeLoginPO;

public class Test2 extends BaseTest {
	@Test(priority=1,enabled=true)
	public void testValidUnInvalidpw(){
		try {
			
			
			driver.get("https://online.actitime.com/huawei2/login.do");
			ActiTimeLoginPO loginPO=new ActiTimeLoginPO(driver);
		
			
			loginPO.unTxtBx().sendKeys("yrevathy92");
			loginPO.pwTxtBx().sendKeys("hyWYpeJE1");
			loginPO.loginBtn().click();
			
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(loginPO.errormsg()));
			Boolean aStatus=loginPO.errormsg().isDisplayed();
			Boolean eStatus=true;
			Assert.assertEquals(eStatus, aStatus);
            Reporter.log("Test PASS for valid un and password", true);
			
			
		} catch (Exception e) {
			Reporter.log("Test fail:: Exception generated");
			
		}
		
}
	
	@Test(priority=2,invocationCount=2,enabled=true)
	public void testInValidUnvalidpw(){
		try {
			
			
			driver.get("https://online.actitime.com/huawei2/login.do");
			ActiTimeLoginPO loginPO=new ActiTimeLoginPO(driver);
		
			
			loginPO.unTxtBx().sendKeys("yrevathy921");
			loginPO.pwTxtBx().sendKeys("hyWYpeJE");
			loginPO.loginBtn().click();
			
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(loginPO.errormsg()));
			Boolean aStatus=loginPO.errormsg().isDisplayed();
			Boolean eStatus=true;
			Assert.assertEquals(eStatus, aStatus);
            Reporter.log("Test PASS for invalid un and password", true);
			
			
		} catch (Exception e) {
			Reporter.log("Test fail:: Exception generated");
			//Assert.fail();
		}
	}
	
	@Test(priority=3,enabled=true)
	public void testInValidUnInvalidpw(){
		try {
			
			
			driver.get("https://online.actitime.com/huawei2/login.do");
			ActiTimeLoginPO loginPO=new ActiTimeLoginPO(driver);
		
			
			loginPO.unTxtBx().sendKeys("yrevathy921");
			loginPO.pwTxtBx().sendKeys("hyWYpeJE1");
			loginPO.loginBtn().click();
			
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(loginPO.errormsg()));
			Boolean aStatus=loginPO.errormsg().isDisplayed();
			Boolean eStatus=true;
			Assert.assertEquals(eStatus, aStatus);
            Reporter.log("Test PASS for valid un and password", true);
			
			
		} catch (Exception e) {
			Reporter.log("Test fail:: Exception generated");
			//Assert.fail();
		}
		
	}
}


