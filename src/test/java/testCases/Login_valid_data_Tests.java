package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class Login_valid_data_Tests extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeClass
	public void setUp() throws IOException {
		driver = initialiserDriver();
		loginPage = new LoginPage();
		homePage = new HomePage();
	}
	
	
	
	@Test(priority = 1)
	public void login_With_Valid_Data()  {
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(homePage.getWelcomeLinkElement().getText(), "Welcome Admin.","le lbellé est erroné");
		logger.info("l'utilisateur s'est authetifier avec succés");
	}
	
	
	@Test(priority = 2)
	public void logout()  {
		homePage.doLogout();
		Assert.assertEquals(loginPage.getorangeLogoElement().isDisplayed(), true);
		logger.info("Déconnexion avec succés");
	}
	
	@AfterClass
	public void tearDown() {
		logger.info(this.getClass().getName()+" ----> TERMINÉ");
		logger.info("----------------------------------------");
		driver.quit();
		driver=null;
		
	}
	
}
