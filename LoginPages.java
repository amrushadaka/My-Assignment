package pagesparent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import parent.ParentClass;

public class LoginPages extends ParentClass{
	
	public LoginPages (ChromeDriver driver) {
		this.driver=driver;
	}
	
	public LoginPages enterUserName(){
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		return this;
	}
	public LoginPages enterPassword() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
		return this;
	}
public HomePages clickLogin() {
	driver.findElement(By.xpath("//input[@id='Login']")).click();

	return new HomePages(driver);
}

}

