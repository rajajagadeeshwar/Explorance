package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {
	protected static final Logger STATIC_LOGGER = LogManager.getLogger(Testbase.class);
	protected Logger logger = LogManager.getLogger(this.getClass());
	
	public static WebDriver driver;

	public static Properties Repository = new Properties();
	public File f;
	public FileInputStream FI;

	public void init() throws IOException {
		loadPropertiesFile();
		selectBrowser(Repository.getProperty("browser"));
		driver.get(Repository.getProperty("url"));
	}

	public void loadPropertiesFile() throws IOException {
		f = new File(System.getProperty("user.dir") + "\\src\\main\\java\\config\\config.properties");
		FI = new FileInputStream(f);
		Repository.load(FI);
	}

	public WebDriver selectBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}
		else
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				return driver;
			}
		return null;
	}

}



