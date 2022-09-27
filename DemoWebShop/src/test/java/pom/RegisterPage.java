package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	RegisterPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="gender-male")
	private WebElement maleCheckbox;
	@FindBy(id="gender-female")
	private WebElement femaleCheckbox;
	@FindBy(id="FirstName")
	private WebElement firstname;
	@FindBy(id="LastName")
	private WebElement lastname;
	@FindBy(id="Email")
	private WebElement email;
	@FindBy(id="Password")
	private WebElement password;
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPassword;
	@FindBy(id="register-button")
	private WebElement registerButton;
	public WebElement getMaleCheckbox() {
		return maleCheckbox;
	}
	public WebElement getFemaleCheckbox() {
		return femaleCheckbox;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConfirmPassword() {
		return confirmPassword;
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}
}