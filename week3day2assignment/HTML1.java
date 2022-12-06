package week3day2assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Launch the URL https://html.com/tags/table/
		//2. Get the count of number of rows
		//3. Get the count of number of columns
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://html.com/tags/table/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	
	 List<WebElement> rows = driver.findElements(By.xpath("//div[@class = 'wrapper wrapper-main clearfix']//tr"));
	 int rowCount = rows.size();
	 System.out.println("No of Rows in HTML5 page is : " + rowCount);
	 
	 List<WebElement> columns = driver.findElements(By.xpath("//div[@class = 'wrapper wrapper-main clearfix']//th"));
	 int columnCount = columns.size();
	 System.out.println("No of Columns in HTML5 page is : " + columnCount);
	 
	}

}
