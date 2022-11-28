package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.id("ext-gen248")).sendKeys("Amrusha");
		
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Daka");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
         driver.findElement(By.xpath("//a[text()='15490']")).click();
		
		String name= driver.getTitle();
		System.out.println(name);
		    
        driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
        
        driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("Trianz");
        driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
        driver.close();
        
		
		
	}

}
