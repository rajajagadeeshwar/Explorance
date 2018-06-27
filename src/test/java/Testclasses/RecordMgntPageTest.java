package Testclasses;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Pageobjects.RecordMgmtpage;
import testBase.Abstract;

public class RecordMgntPageTest extends Abstract {

	@Test(priority = 1)
	public void logintest() throws Exception {
		/*
		 * Step:Successful login with valid credentials
		 */
		loginpagetest login = new loginpagetest();
		login.login();
	}

	@Test(priority = 2)
	public void clickOnRecruitmentButton() {
		/*
		 * Step:After Successful login,Click on Record Management Tab
		 */
		try {
			RecordMgmtpage recruitmentmethod = new RecordMgmtpage(driver);
			recruitmentmethod.RecordMgmt.click();

			Thread.sleep(5000);
		} catch (Exception ex) {
			logger.catching(ex);
			assertTrue(false);
		}
	}

	@Test(priority = 3)
	public void clickOnAddButton() {

		/*
		 * Step:Click on Add Button by selecting datasource as pkStudents
		 * Fill the appropriate details and click on add button
		 */
		try {
			RecordMgmtpage managementpage = new RecordMgmtpage(driver);
			managementpage.datasource1.click();
			Select sel = new Select(managementpage.datasource1);
			sel.selectByVisibleText(Repository.getProperty("datasource1"));

			managementpage.addbutton.click();
			Thread.sleep(5000);
			managementpage.userid.sendKeys(Repository.getProperty("userid"));
			managementpage.givenname.sendKeys(Repository.getProperty("givenname"));
			managementpage.lastname.sendKeys(Repository.getProperty("lastname"));
			managementpage.email.sendKeys(Repository.getProperty("email"));
			managementpage.contact.sendKeys(Repository.getProperty("contact"));
			managementpage.age.sendKeys(Repository.getProperty("age"));
			managementpage.faculty.sendKeys(Repository.getProperty("faculty"));
			managementpage.studentstartdate.sendKeys(Repository.getProperty("startdate"));
			managementpage.studentenddate.sendKeys(Repository.getProperty("enddate"));
			managementpage.blueusertype.click();
			Select blueusertype = new Select(managementpage.blueusertype);
			blueusertype.selectByVisibleText(Repository.getProperty("blueusertype"));
			managementpage.language.click();
			Select language = new Select(managementpage.language);
			language.selectByVisibleText(Repository.getProperty("language"));
			//managementpage.addtolistbutton.click();
		} catch (Exception ex) {
			logger.catching(ex);
			assertTrue(false);
		}
	}
}
