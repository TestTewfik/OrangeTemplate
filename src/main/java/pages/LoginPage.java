package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	
	
	//webelements
	
	@FindBy(xpath="//div[@id='divLogo']/img") public WebElement orangeLogo;
	@FindBy(id="txtUsername") public WebElement usernameTxt;
	@FindBy(id="txtPassword") public WebElement passwordTxt;
	@FindBy(id="btnLogin") public WebElement submitBtn;
	@FindBy(id="spanMessage") public WebElement ErrorMessage;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	//By orangeLogo = By.xpath("//div[@id='divLogo']/img");
	//By usernameTxt = By.id("txtUsername");
	//By passwordTxt = By.id("txtPassword");
	//By submitBtn = By.id("btnLogin");
	//By ErrorMessage = By.id("spanMessage");

	
	
	
	//Actions
	public HomePage doLogin(String user, String pass) {
		usernameTxt.clear();
		usernameTxt.sendKeys(user);
		logger.info("Entrer le username :"+user);
		
		passwordTxt.clear();
		passwordTxt.sendKeys(pass);
		logger.info("Entrer le password :"+pass);
		
		submitBtn.click();
		logger.info("Cliquer sur le bouton 'LOGIN'");
		return new HomePage();
	}
	
}
