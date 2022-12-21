package pagesparent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import parent.ParentClass;

public class ContactsPage extends ParentClass{
	
	

	public ContactsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public NewContact clickNew() {

		driver.findElement(By.xpath("//div[text()='New']")).click();
		return new NewContact(driver);
	}

}
