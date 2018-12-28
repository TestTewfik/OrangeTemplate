package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.TestBase;

public class HomePage extends TestBase {
	
    // Localisateurs
	By welcomeLink = By.xpath("//a[@id='welcome']");
	By logoutBtn = By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a");

	
	
	//Webelement
	public WebElement getWelcomeLinkElement() {
		return driver.findElement(welcomeLink);
	}
	
	public WebElement getLogoutBtnElement() {
		return driver.findElement(logoutBtn);
	}
	
	//Actions
	public void doLogout() {
		getWelcomeLinkElement().click();
		logger.info("Cliquer sur le lien 'Welcome Admin'");
		getLogoutBtnElement().click();
		logger.info("Cliquer sur le bouton 'Logout'");
	}
	
	
	
}
