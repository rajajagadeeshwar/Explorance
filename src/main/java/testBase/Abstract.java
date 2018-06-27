package testBase;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Abstract extends Testbase{

	@BeforeClass
	public void setUp() throws IOException {
		init();
	}
	
	@AfterClass(enabled=false)
	public void endTest() {
		driver.close();
	}
}
