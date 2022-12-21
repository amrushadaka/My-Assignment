package runnerparent;

import org.testng.annotations.Test;

import pagesparent.LoginPages;
import parent.ParentClass;

@Test
public class CreateSales extends ParentClass {

	
	public void CreatSales() {
		LoginPages log=new LoginPages(driver);
		log.enterUserName().enterPassword().clickLogin().clickAppLauncher().clickViewAll()
		.clickContacts().clickNew().enterPhoneNo().enterFirstName().enterLasttName().ClickOnSalutation().ClickOnSaveButton().verifyContact();
}
}
