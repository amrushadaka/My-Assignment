package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//label[text()='Username']/following::input")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		driver.findElement(By.xpath("(//label[text()='Password']/following::input)[2]")).click();
		driver.findElement(By.xpath("//div[@id='label']//a[1]")).click();
		driver.findElement(By.xpath("(//div[@class='x-panel-header']//a)[2]")).click();
		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
		driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
		driver.findElement(By.xpath("//input[@name = 'phoneNumber']")).sendKeys("8889991234");
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		
		String value = driver.findElement(By.xpath("//td[contains(@class,'x-grid3-col')]/div/a")).getText();
		driver.findElement(By.xpath("//td[contains(@class,'x-grid3-col')]/div/a")).click();
		System.out.println(value);
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Find')])")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(value);
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		String mes = "No records to display";
		String mes1 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(mes.equals(mes1))
		{
			System.out.println("The record is delected successfully");
		}
		else
		{ 
			System.out.println("The record is not deleted");
		}
		driver.close(); 
	
	}
}






