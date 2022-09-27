package generic;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class WebGeneric {
	public static void verifyTitle(WebDriver driver, String actualTitle) throws InterruptedException {
		Thread.sleep(2000);
		if(actualTitle.contains(driver.getTitle()))
			Reporter.log("Page Displayed",true);
		else
			Reporter.log("Page Not Displayed",true);
	}
	public static void verifyUrl(WebDriver driver, String actualUrl) throws InterruptedException {
		Thread.sleep(2000);
		if(actualUrl.contains(driver.getCurrentUrl()))
			Reporter.log("Page Displayed",true);
		else
			Reporter.log("Page Not Displayed",true);
	}
	public static int getRandomNumber() {
		Random r=new Random();
		return r.nextInt();
	}
}