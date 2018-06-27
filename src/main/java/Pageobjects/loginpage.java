package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	@FindBy(id="BlueDataSource")
	public WebElement dropdwn;
	
	@FindBy(id="BlueDataSource")
	public WebElement option;
	
	@FindBy(id = "BlueUserName")
	public WebElement username;

	@FindBy(id = "BluePassword")
	public WebElement password;

	@FindBy(id = "Submit")
	public WebElement loginBtn;

	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void login(String username, String password) {
		this.dropdwn.click();
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		loginBtn.click();
	}
}
