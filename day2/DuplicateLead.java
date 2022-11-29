package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@id='ext-gen282']")).sendKeys("Amrushadaka@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).getText();
		//System.out.println(text);
		WebElement p = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a"));
		String s = p.getText();
		System.out.println("Text content is : " + s);
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=15490']")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']//a")).click();	
		String text2 = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
		System.out.println(text2);

		String actualTitle = driver.getTitle();
		System.out.println("Page title is : " + driver.getTitle());
		String expectedTitle = "Duplicate Lead ";
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title didn't match");
		}

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		String text3 = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		System.out.println(text3);
		if (s.equals(text3)) {
			System.out.println("not Matched");
		} else {
			System.out.println("matched");
		}
		driver.close();
	}

}
