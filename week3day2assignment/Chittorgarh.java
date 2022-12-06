package week3day2assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Launch the URL https://www.chittorgarh.com/
		//2. Click on stock market
		//3. Click on NSE bulk Deals
		//4. Get all the Security names
		//5. Ensure whether there are duplicate Security names
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.chittorgarh.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("//a[@href='/report/nse_sme_share_prices_live/9/']/following-sibling::a[1]")).click();
		List<WebElement> security = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr/td[3]"));
		
		int sec=security.size();
	System.out.println("Total table size:"+sec);
	 List<String> securityNames = new ArrayList<String>();
	 
	 for (WebElement allNames : security) {
		
		 securityNames.add(allNames.getText());
		 System.out.println(allNames.getText());
	 }
	 Set<String> security2 = new LinkedHashSet<String>(securityNames);
	 int sec2 = security2.size();
	 System.out.println("Total table size: " + sec2 );
	 
	 if(sec == sec2)
	 {
		 System.out.println(" There is no Duplicates");
	 }
	 else
	 {
		 System.out.println("There is Duplicates found");
	 }
	 driver.close();
}
	
}
