package maven.maven.demo;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import testng.ActiTimeLoginPO;

public class Test1 extends BaseTest{
	@Test
	public void testValidUnInvalidpw(){
		try {
			
			
			driver.get("https://online.actitime.com/huawei2/login.do");
			ActiTimeLoginPO loginPO=new ActiTimeLoginPO(driver);
		
			
			loginPO.unTxtBx().sendKeys("yrevathy92");
			loginPO.pwTxtBx().sendKeys("hyWYpeJE");
			loginPO.loginBtn().click();
			
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.titleContains("Enter Time"));
			String eTitle="actiTIME - Enter Time-Track";
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
			driver.close();
			Reporter.log("Test PASS for valid un and password", true);
			
			
		} catch (Exception e) {
			Reporter.log("Test fail:: Exception generated");
			//Assert.fail();
			
		}
		
	}



}
