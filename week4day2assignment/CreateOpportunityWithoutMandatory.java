package week4day2assignment;


import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class CreateOpportunityWithoutMandatory extends BaseClassOppportunity {

		@Test
		public void runCreateOpportunityWithoutMandatory() throws InterruptedException 
		{

			// Click on toggle menu button from the left corner	

			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

			// Click view All and click Sales from App Launcher	

			driver.findElement(By.xpath("//button[text()='View All']")).click();
			driver.findElement(By.xpath("//p[text()='Sales']")).click();

			// Click on Opportunity tab 

			WebElement opportunity = driver.findElement(By.xpath("//span[text()='Opportunities']"));
			driver.executeScript("arguments[0].click();", opportunity);
			Thread.sleep(2000);

			//		Click on New button

			WebElement newOpportunity = driver.findElement(By.xpath("//div[text()='New']"));
			driver.executeScript("arguments[0].click();", newOpportunity);
			Thread.sleep(3000);

			//		Choose Close date as Tomorrow Date

			WebElement date = driver.findElement(By.xpath("//input[@name='CloseDate']"));
			driver.executeScript("arguments[0].click();", date);
			Thread.sleep(2000);
			WebElement tommorrowDate = driver.findElement(By.xpath("//span[text()='13']/following::span"));		
			driver.executeScript("arguments[0].click();", tommorrowDate);		
			Thread.sleep(2000);

			//		Click on save

			driver.findElement(By.xpath("//button[text()='Save']")).click();

			//		Verify the Alert message (Complete this field) displayed for Name and Stage"

			List<WebElement> errorMessage = driver.findElements(By.xpath("//div[text()='Complete this field.']"));
			List<String> errorList = new ArrayList<String>();
			for (WebElement onebyone : errorMessage) {
				String text = onebyone.getText();
				errorList.add(text);
			}
			System.out.println(errorList);
			Thread.sleep(2000);
		}
		
	}



