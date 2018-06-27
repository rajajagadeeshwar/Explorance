package Testclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Pageobjects.loginpage;
import testBase.Abstract;

	
	public class loginpagetest extends Abstract {

		@Test
		public void login() throws Exception {
			String username = Repository.getProperty("uname");
			String password = Repository.getProperty("pswd");
			loginpage loginpage = new loginpage(driver);
			loginpage.dropdwn.click();
		    Select sel=new Select(loginpage.option);
			sel.selectByVisibleText(Repository.getProperty("datasource"));			
			loginpage.username.sendKeys(username);
			loginpage.password.sendKeys(password);
			loginpage.loginBtn.click();
		}

	

}


