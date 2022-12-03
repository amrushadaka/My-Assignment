package week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {



	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();

		driver.get("https://in.bookmyshow.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='HYD']")).click();
		//Confirm the URL has got loaded with Hyderabad 
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("hyderabad")) {
			System.out.println("the Url is correct");
		}
		else {
			System.out.println("the url is wrong");
		}
		driver.findElement(By.xpath("//div[contains(@class,'sc-133848s-2 sc-1t5vwh0-1')]//img")).click();
		driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
		String text = driver.findElement(By.linkText("Alankar (Pratap Theatre): Langer House")).getText();
		
		System.out.println(text);
		driver.findElement(By.linkText("Alankar (Pratap Theatre): Langer House")).click();
		driver.findElement(By.xpath("//div[text()='Details']")).click();
		String text2 = driver.findElement(By.xpath("(//div[@class='venue-facility-item'])[2]")).getText();
			if(text2.contains("Parking")) {
			System.out.println("it has parking facilities");
		}
		else {
			System.out.println("it doesnt have parking facilities");
			
		}
			driver.findElement(By.xpath("//div[text()='							09:00 PM					']")).click();
			driver.findElement(By.id("pop_1")).click();
			driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
			driver.findElement(By.xpath("(//a[@class='_available'])[2]")).click();
			driver.findElement(By.xpath("//a[@id='btmcntbook']")).click();
			
			WebElement pay = driver.findElement(By.xpath("//span[@class='__sub-total']"));
		//	Thread.sleep(3000);
			String value = pay.getText();
			System.out.println(value);
		}

	}


