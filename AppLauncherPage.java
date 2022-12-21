package pagesparent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import parent.ParentClass;

public class AppLauncherPage extends ParentClass{
	
	
	
	public AppLauncherPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
//	public AppLauncherPage clickOnSales() {
//	driver.findElement(By.xpath("//p[text()='Sales']")).click();
//    return this;
//}



public ContactsPage clickContacts() {
		
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("contacts");
		
		driver.findElement(By.xpath("//mark[text()='Contacts']")).click();
		
		return new ContactsPage(driver);

}
	
	
}