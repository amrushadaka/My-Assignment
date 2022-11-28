package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.partialLinkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Amrusha");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Daka");

		driver.findElement(By.id("createLeadForm_description")).sendKeys("The selenium webdriver ");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Amrushadaka@gmail.com");

		//using visible text
		WebElement sele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select scr1= new Select(sele);

		scr1.selectByVisibleText("New York");


		driver.findElement(By.name("submitButton")).click();


	}

}
