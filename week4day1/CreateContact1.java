package week4day1;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact1 {

	@Test
	public void CreateContact1Run() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeOptions ch= new ChromeOptions();
		ch.addArguments("-disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);

		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
		driver.findElement(By.xpath("//input[@id='Login']")).click();

		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[text()='Sales']")).click();

		Thread.sleep(3000);
		WebElement opp = driver.findElement(By.xpath("//span[text()='Opportunities']"));

		driver.executeScript("arguments[0].click();", opp);

		Thread.sleep(3000);

		WebElement acc = driver.findElement(By.xpath("//span[text()='Accounts']"));

		driver.executeScript("arguments[0].click();", acc);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@title='New']")).click();

		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Amrusha Daka");

		WebElement sc = driver.findElement(By.xpath("//button[@aria-label='Ownership, --None--']"));
            Actions obj=new Actions(driver);
	        obj.scrollToElement(sc).perform();
	        driver.executeScript("arguments[0].click();", sc);
	     //clicking the public option
	      driver.findElement(By.xpath("//span[contains(text(),'Public')]")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//button[text()='Save']")).click();
		//driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

		WebElement message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));

		String text = message.getText();

		System.out.println(text);

		if(text.contains("Amrusha Daka")) {
			System.out.println("account created Successfully");
		}else
			System.out.println("account not created Successfully");	

		driver.close();
	}

}
