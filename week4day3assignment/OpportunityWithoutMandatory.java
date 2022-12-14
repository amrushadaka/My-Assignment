package week4day3assignment;


import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class OpportunityWithoutMandatory extends BaseOppportunity {
	
	@DataProvider(name="CreateWithoutMandatory")
	public String[][] createOpportunityWithoutMandatory() {
		String[][] data1=new String [2][2];
		data1[0][0]="Review";
		data1[0][1]="Testing in Progress";
		data1[1][0]="Message";
		data1[1][1]="Verify the Alert";
		return data1;
	}
	@Test(dataProvider="CreateWithoutMandatory")
	public void runOpportunityWithoutMandatoryFields(String VerifyAlert,String descName) throws InterruptedException {
		

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
			driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys(descName);
			driver.findElement(By.xpath("//button[text()='Save']")).click();

			//		Verify the Alert message (Complete this field) displayed for Name and Stage"

			String text2 = driver.findElement(By.xpath("//div[@class='fieldLevelErrors']")).getText();
			System.out.println(text2);
			if (text2.contains(VerifyAlert)) {
				System.out.println("Alert message matched");
			} else {
				System.out.println("Alert message not matched");
			}
		}
		
	}



