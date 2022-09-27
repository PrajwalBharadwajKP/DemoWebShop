package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.ReadExcel;
import generic.WebGeneric;

public class test extends BaseTest{
	@Test
	public void login() throws EncryptedDocumentException, IOException {
		int num = WebGeneric.getRandomNumber();
		ReadExcel re=new ReadExcel();
		String username = num+re.getDataFromExcel("Sheet1",0,0);
		String password = num+re.getDataFromExcel("Sheet1",1,0);
		HomePage hp=new HomePage(driver);
		hp.getRegisterLink().click();
		RegisterPage rp=new RegisterPage(driver);
		rp.getMaleCheckbox().click();
		rp.getFirstname().sendKeys(re.getDataFromExcel("Sheet1",2,0));
		rp.getLastname().sendKeys(re.getDataFromExcel("Sheet1",3,0));
		rp.getEmail().sendKeys(username);
		rp.getPassword().sendKeys(password);
		rp.getConfirmPassword().sendKeys(password);
		rp.getRegisterButton().click();
		LogoutPage lp=new LogoutPage(driver);
		lp.getLogoutLink().click();
		hp.getLoginLink().click();
		LoginPage l=new LoginPage(driver);
		l.getEmail().sendKeys(username);
		l.getPassword().sendKeys(password);
		l.getLoginButton().click();
	}
}