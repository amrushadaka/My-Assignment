package week2.day1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Amrusha");
		driver.findElement(By.name("lastname")).sendKeys("Daka");
		driver.findElement(By.name("reg_email__")).sendKeys("8889991000");

		driver.findElement(By.id("password_step_input")).sendKeys("1561@abcD");

		WebElement day = driver.findElement(By.id("day"));
		Select src = new Select(day);
		src.selectByValue("25");

		WebElement month = driver.findElement(By.id("month"));
		Select src1 = new Select(month);
		src1.selectByValue("11");

		WebElement year = driver.findElement(By.id("year"));
		Select src2 = new Select(year);
		src2.selectByValue("1996");

		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();



	}

}
