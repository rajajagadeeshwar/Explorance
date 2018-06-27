package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecordMgmtpage {
	
public WebDriver driver;
	
	@FindBy(xpath="//div[@class='menu-cell']/span[@class='menu-text'][contains(text(),'Record Mgmt')]")
	public WebElement RecordMgmt;
	
	@FindBy(xpath=".//*[@id='BlueAppControl_9_ucUserManagementUC_dplDataSource']")
	public WebElement datasource1;
	
	@FindBy(xpath=".//*[@id='BlueAppControl_9_ucUserManagementUC_tbUserID_1']")
	public WebElement userid;
	
	@FindBy(xpath=".//*[@id='BlueAppControl_9_ucUserManagementUC_tbFirstName_1']")
	public WebElement givenname;
	
	@FindBy(xpath=".//*[@id='BlueAppControl_9_ucUserManagementUC_tbLastName_1']")
	public WebElement lastname;
	
	@FindBy(xpath=".//*[@id='BlueAppControl_9_ucUserManagementUC_tbFullEmail_1']")
	public WebElement email;

	@FindBy(xpath=".//*[@id='BlueAppControl_9_ucUserManagementUC_tbFullCell_1']")
	public WebElement contact;

	@FindBy(xpath=".//*[@id='BlueAppControl_9_ucUserManagementUC_tbAge_1']")
	public WebElement age;

	@FindBy(xpath=".//*[@id='BlueAppControl_9_ucUserManagementUC_tbfaculty_1']")
	public WebElement faculty;
	
	@FindBy(xpath=".//*[@id='BlueAppControl_9_ucUserManagementUC_tbstudent_startdate_1']")
	public WebElement studentstartdate;
	
	@FindBy(xpath=".//*[@id='BlueAppControl_9_ucUserManagementUC_tbstudent_enddate_1']")
	public WebElement studentenddate;

	@FindBy(xpath=".//*[@id='BlueAppControl_9_ucUserManagementUC_ddlBlueRole']")
	public WebElement blueusertype;
	
	@FindBy(xpath=".//*[@id='BlueAppControl_9_ucUserManagementUC_ddlUserLanguage']")
	public WebElement language;
	
	@FindBy(xpath=".//*[@id='BlueAppControl_9_ucUserManagementUC_btnSubmit']")
	public WebElement addtolistbutton;
	
	@FindBy(xpath=".//*[@id='BlueAppControl_9_ucUserManagementUC_btnAdd']")
	public WebElement addbutton;
	
	public RecordMgmtpage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



}
