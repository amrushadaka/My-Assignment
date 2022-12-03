package week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) {
		
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();

			driver.get("https://www.redbus.in/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			
			WebElement obj = driver.findElement(By.id("src"));
			obj.sendKeys(Keys.ENTER);
			obj.sendKeys("Chennai");
			driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li")).click();
			WebElement obj1 = driver.findElement(By.id("dest"));
		    obj1.sendKeys(Keys.ENTER);
			obj1.sendKeys("Bangalore");
			driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li")).click();
			driver.findElement(By.id("onward_cal")).click();
			driver.findElement(By.xpath("//td[text()='4']")).click();
			driver.findElement(By.xpath("//button[@class='fl button']")).click();
			String text = driver.findElement(By.xpath("//span[contains(@class,'w-60 d-block')]//span[1]")).getText();
			System.out.println(text);
			driver.findElement(By.xpath("//label[@for='bt_SLEEPER']")).click();
			
			String text2 = driver.findElement(By.xpath("//*[@id=\"11771975\"]/div/div[1]/div[1]")).getText();
			System.out.println(text2);
			driver.findElement(By.xpath("(//div[text()='View Seats'])[2]")).click();
	}

	
}
