package parent;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass extends AbstractTestNGCucumberTests {
	
	//public static ChromeDriver driver;
	public ChromeDriver driver;
		
		
		@BeforeMethod
		public void precondition() {
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://login.salesforce.com/");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		@AfterMethod
	public void postcondition() {
			driver.close();
		}
	}


