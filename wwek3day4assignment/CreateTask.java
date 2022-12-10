package wwek3day4assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTask {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		WebElement scr = driver.findElement(By.xpath("//input[@class='slds-input']"));
		scr.click();
		scr.sendKeys("Tasks");
		Thread.sleep(3000);
//driver.findElement(By.xpath("//mark[text()='Task']")).click();
		driver.findElement(By.xpath("//p[@class='slds-truncate']/mark")).click();
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//a[@title='Show one more action']")).click();
		
		Thread.sleep(500);
		
		WebElement newTask = driver.findElement(By.xpath("//div[text()='New Task']//parent::div"));
		
		driver.executeScript("arguments[0].click();",newTask);
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("Bootcamp");
		
		driver.findElement(By.xpath("//a[@class='select']")).click();
		driver.findElement(By.xpath("//a[text()='Waiting on someone else']")).click();
		
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		
		WebElement message = driver.findElement(By.xpath("//div[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']"));
		
		String text = message.getText();
		
		System.out.println(text);
		
		if(text.contains("Bootcamp")) {
			System.out.println("Task Verified successfully");
		}else
			System.out.println("Task not Verified");
		
		driver.close();
	}

}
