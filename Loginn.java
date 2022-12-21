package runnerparent;

import org.testng.annotations.Test;
import pagesparent.LoginPages;
import parent.ParentClass;

@Test
public class Loginn extends ParentClass{

	public void login() {
		LoginPages log=new LoginPages(driver);
	log.enterUserName().enterPassword().clickLogin();
	}
}
