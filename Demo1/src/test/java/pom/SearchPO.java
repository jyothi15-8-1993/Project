package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class SearchPO extends BasePage{

	public SearchPO(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[text()='Facebook - Log In or Sign Up']")
	private WebElement facebookLink;
	public WebElement facebookLink() {
		return facebookLink;
	}
	@FindBy(xpath="//a[text()='Instagram']")
	private WebElement InstaLink;
	public WebElement InstaLink() {
		return InstaLink;
	}
	
	@FindBy(xpath="//a[text()='Login on Twitter']")
	private WebElement TwitLink;
	public WebElement TwitLink() {
		return TwitLink;
	}
	@FindBy(xpath="//a[text()='Sign Up | LinkedIn']")
	private WebElement LinkedLink;
	public WebElement LinkedLink() {
		return LinkedLink;
	}
}
