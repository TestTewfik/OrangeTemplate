package base;

/*
 * webdriver
 * properties
 * logs
 * extentreport
 * excel
 * mail
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver = null;
	public static String projectpath = System.getProperty("user.dir");
	public static Properties prop;
	public static FileInputStream fis ;
	public static final Logger logger = LogManager.getLogger(TestBase.class);
	
	
	public WebDriver initialiserDriver() throws IOException {
		
		if (driver == null) {
			prop = new Properties();
			fis = new FileInputStream(projectpath+"\\src\\test\\resources\\properties\\config.properties");
			prop.load(fis);
			
			String browserName = prop.getProperty("browser");
			
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", projectpath+"\\src\\test\\resources\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				
			} else if (browserName.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", projectpath+"\\src\\test\\resources\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else {
				System.out.println("ie");
			}
			
			driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(prop.getProperty("pageLoadTimeOut")), TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			driver.get(prop.getProperty("baseUrl"));
			logger.info("-----------------------------------------");
			logger.info(this.getClass().getName()+" ----> COMMENCÉ");
			
		}
		
		return driver; 
	}
	
	public String getTitlePage() {
		return driver.getTitle();
	}

}
