package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
    // Localisateurs
//	By welcomeLink = By.xpath("//a[@id='welcome']");
//	By logoutBtn = By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a");

	@FindBy(id="welcome") public WebElement welcomeLink;
	@FindBy(xpath="//*[@id='welcome-menu']/ul/li[2]/a") public WebElement logoutBtn;
	
	//Webelement
//	public WebElement getWelcomeLinkElement() {
//		return driver.findElement(welcomeLink);
//	}
//	
//	public WebElement getLogoutBtnElement() {
//		return driver.findElement(logoutBtn);
//	}
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public void doLogout() throws InterruptedException {
		
		welcomeLink.click();
		Thread.sleep(1000);
		logger.info("Cliquer sur le lien 'Welcome Admin'");
		
		logoutBtn.click();
		logger.info("Cliquer sur le bouton 'Logout'");
	}
	
	
	
}
