package week4day3assignment;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OpportunityWithMandatory extends BaseOppportunity {
	
	@DataProvider(name="CreateOppportunity")
	public String[][] createOpportunityWithMandatory() {
		String[][] data=new String [2][1];
		data[0][0]="Salesforce Automation by Amrusha";
		//data[0][1]="Amrusha";
		data[1][0]="Salesforce Automation by Manohar";
		//data[1][1]="Manohar";
		return data;
	}
	@Test(dataProvider="CreateOppportunity")
	
		public void runCreateOpportunityWithMandatory(String oppName) throws InterruptedException {
			
			// Click on toggle menu button from the left corner	

			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

			// Click view All and click Sales from App Launcher	

			driver.findElement(By.xpath("//button[text()='View All']")).click();
			driver.findElement(By.xpath("//p[text()='Sales']")).click();

			// Click on Opportunity tab 

			WebElement opportunity = driver.findElement(By.xpath("//span[text()='Opportunities']"));
			driver.executeScript("arguments[0].click();", opportunity);
			Thread.sleep(2000);
			
//			Click on New button
			
			WebElement newOpportunity = driver.findElement(By.xpath("//div[text()='New']"));
			driver.executeScript("arguments[0].click();", newOpportunity);
			Thread.sleep(3000);
			
//			Enter Opportunity name
			
//			WebElement name = driver.findElement(By.xpath("//input[@name='Name']"));
//			name.sendKeys(OppName);
//			driver.executeScript("arguments[0].click();", name);	
//			String text = name.getText();
//			System.out.println(text);
			WebElement text1 = driver.findElement(By.xpath("//input[@name='Name']"));
			text1.sendKeys(oppName);
			System.out.println(text1.getAttribute("value"));
			Thread.sleep(2000);
			
//			Choose close date as Today
			
			WebElement date = driver.findElement(By.xpath("//input[@name='CloseDate']"));
			driver.executeScript("arguments[0].click();", date);
			WebElement today = driver.findElement(By.xpath("//span[text()='13']"));		
			driver.executeScript("arguments[0].click();", today);		
			Thread.sleep(2000);
			
//			Select 'Stage' as Need Analysis
			
			WebElement dropdown = driver.findElement(By.xpath("(//div[@class='slds-form-element__control'])[3]"));
			dropdown.click();
			WebElement optionSelect = driver.findElement(By.xpath("(//span[text()='Qualification']/following::span)[2]"));
			optionSelect.click();
			Thread.sleep(2000);
			
//			click Save and VerifyOppurtunity Name"
			
			driver.findElement(By.xpath("//button[text()='Save']")).click();
			
		WebElement message = driver.findElement(By.xpath("(//a[@class='forceActionLink'])[2]/div"));
			driver.executeScript("arguments[0].click();", message);
			Thread.sleep(2000);
			String text2 = message.getText();
			System.out.println(text2);
			String expectedMessage= "\""+oppName+"\"";
			if(text2.equalsIgnoreCase(expectedMessage))
				{
				System.out.println("Opportunity Name matched");
			}
	          else{
				System.out.println("Opportunity name not matched");
			Thread.sleep(2000);
			}
	}

}
