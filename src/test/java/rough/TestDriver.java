package rough;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;

public class TestDriver extends TestBase {

	@BeforeMethod
	public void setUp() throws IOException {
		driver = initialiserDriver();
		
		
	}
	
	
	@Test
	public void test01() throws InterruptedException {
		System.out.println("test01");
		Assert.assertEquals(getTitlePage(), "OrangeHRM");
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
		
	}

}
