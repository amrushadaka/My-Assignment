package wwek3day4assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ArchitectCertifications {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("-disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);

		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> value=driver.getWindowHandles();
		List<String> window=new ArrayList<String>(value);
		driver.switchTo().window(window.get(1));
		driver.findElement(By.xpath("(//div[@class='dialog']//button)[2]")).click();
		Shadow sh = new Shadow(driver);
		sh.findElementByXPath("//span[text()='Learning']").click();
		WebElement ele = sh.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions obj=new Actions(driver);
		Thread.sleep(3000);
		obj.moveToElement(ele).perform();
		//Thread.sleep(3000);
		WebElement ele2 = sh.findElementByXPath("//a[text()='Salesforce Certification']");
		obj.scrollToElement(ele2).perform();
		//value2.click();
		//javascript
		driver.executeScript("arguments[0].click();", ele2);
		driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("architectoverview")) {
			System.out.println("This is correct url");
		}
		else {
			System.out.println("This is wrong url");
		}
		String text = driver.findElement(By.xpath("//h1[text()='Salesforce Architect']/following-sibling::div")).getText();
		System.out.println("The description is"+text);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='credentials-card_type']/following-sibling::div[1]"));
		int size2 = list.size();
		System.out.println("ListSize"+size2);
		List<String> name=new ArrayList<String>();
		for(WebElement i:list) {
			name.add(i.getText());
		}

       System.out.println(name);
		Set<String>str=new LinkedHashSet<String>(name);
		int size = str.size();
		System.out.println("Setsize:"+size);
		
		if(size2==size) {
			System.out.println("There is no duplicate in salesforce Cetificates");
		}
		else {
			System.out.println("There is dupliacte in salesforce certificates");
		}
		driver.findElement(By.xpath("//div[@class='credentials-card_title']/a")).click();
		List<WebElement> cer = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		int size3 = cer.size();
		System.out.println("ListSize:"+size3);
		List<String> certi=new ArrayList<String>();
		for(WebElement i : cer) {
			certi.add(i.getText());
		}
		System.out.println(certi);
		Set<String>values=new LinkedHashSet<String>(certi);
		int size4 = values.size();
		System.out.println("Setsize:"+size4);
		if(size3==size4) {
			System.out.println("There is no dulpicate in Architect certificate");
		}
		else {
			System.out.println("THere is duplicate in Architect certificate");
		}
	}

}
