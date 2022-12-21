package pagesparent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import parent.ParentClass;

public class NewContact extends ParentClass {


	public NewContact(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public NewContact enterPhoneNo() {
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("9876543210");
		return this;
	}
	public NewContact enterFirstName() {
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("Amrusha");
		return this;
	}
	public NewContact enterLasttName() {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Daka");
		return this;
	}
//	public NewContact ClickOnSalutation() {
//		driver.findElement(By.xpath("//button[@name='salutation']")).click();
//		driver.findElement(By.xpath("//button[@data-value='Ms.']")).click();
//		return this;
//}
	public NewContact ClickOnSalutation() {
		driver.findElement(By.xpath("//button[@name='salutation']")).click();
				
				driver.findElement(By.xpath("//span[@title='Mrs.']")).click();
			
				return this;
			}
	
	public  VerifyContactPage ClickOnSaveButton() {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		return new VerifyContactPage(driver);
	}

	
	}

