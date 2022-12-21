package pagesparent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import parent.ParentClass;

public class HomePages extends ParentClass{

	public HomePages (ChromeDriver driver) {
		this.driver=driver;
	}
	
	public HomePages clickAppLauncher() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;

	}
	
	public AppLauncherPage clickViewAll() {
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		return new AppLauncherPage(driver);
	}
}
