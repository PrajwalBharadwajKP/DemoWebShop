package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Register")
	private WebElement registerLink;
	public WebElement getRegisterLink() {
		return registerLink;
	}
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	public WebElement getLoginLink() {
		return loginLink;
	}
}
