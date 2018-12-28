package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.TestBase;

public class LoginPage extends TestBase{
	
	
	//Localisateur
	By orangeLogo = By.xpath("//div[@id='divLogo']/img");
	By usernameTxt = By.id("txtUsername");
	By passwordTxt = By.id("txtPassword");
	By submitBtn = By.id("btnLogin");
	By ErrorMessage = By.id("spanMessage");

	//Webelement
	public WebElement getorangeLogoElement() {
		return driver.findElement(orangeLogo);
	}
	
	
	//Actions
	public HomePage doLogin(String user, String pass) {
		driver.findElement(usernameTxt).clear();
		driver.findElement(usernameTxt).sendKeys(user);
		driver.findElement(passwordTxt).clear();
		driver.findElement(passwordTxt).sendKeys(pass);
		driver.findElement(submitBtn).click();
		return new HomePage();
	}
	
}
