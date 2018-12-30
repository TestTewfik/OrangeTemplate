package testCases.Authentification;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;
import utilitaires.TestUtil;

public class Login_Invalid_data_Tests extends TestBase {

	LoginPage loginPage;
	String excelPath = projectpath + "\\src\\test\\resources\\excel\\data.xlsx";

	@BeforeClass
	public void setUp() throws IOException {
		driver = initialiserDriver();
		loginPage = new LoginPage();

	}

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void loginInvalidData(String username, String password, String message) throws InterruptedException {
			loginPage.doLogin(username, password);
			Thread.sleep(500);
			Assert.assertEquals(driver.findElement(By.id("spanMessage")).getText(), message);
	}

	@AfterClass
	public void tearDown() {
		logger.info(this.getClass().getName() + " ----> TERMINÉ");
		logger.info("----------------------------------------");
		driver.quit();
		driver = null;
	}

}
