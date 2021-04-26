package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Commonfunction.commonfunction;
import pageobjcet.Companypage;

public class CompanyTestccases extends commonfunction{
	
	public void Companydetails() throws InterruptedException
	{
		
		Companypage.Companyinfo.click();
		testCase=extentReport.createTest("Company info page");
		testCase.log(Status.PASS,"Test Method Successfully");
		Companypage.PanNumber.sendKeys("BBFPV1650N");
		Companypage.verify.click();
		Thread.sleep(13000);
		Companypage.GstNo.sendKeys("33AADCE8498E1ZG");
		Companypage.Verify2.click();
		Thread.sleep(11000);
		Companypage.address.sendKeys(properties.getProperty("address"));
		Companypage.Type_of_industry.sendKeys("Own bussiness");
		Companypage.Pincode.sendKeys("621316");
		Companypage.City.click();
		Thread.sleep(3000);
	}
	
	public void professional() throws InterruptedException
	{
		Companypage.professtional.click();
		Thread.sleep(3000);
		List<WebElement> profession =driver.findElements(By.id("form_Id1:j_idt80:j_idt456_items"));
		int position=0;
		for (WebElement webElement:profession)
		{
			position++;
			if(position==1)
			{
				webElement.click();
				break;
			}
		}
	}
	
	public void Organization() throws InterruptedException {
		Companypage.organization.click();
		Thread.sleep(3000);
		List<WebElement> organization=driver.findElements(By.id("form_Id1:j_idt80:j_idt464_items"));
		 for(WebElement webElement:organization)
		 {
			String Text =webElement.getText();
			if(Text.contains("Pvt.Ltd"))
			{
				webElement.click();
				break;
			}
		 }
	}
	public void TypeofBussiness()
	{
		Companypage.Typeofbussiness.click();
		List<WebElement> Bussiness =driver.findElements(By.id("form_Id1:j_idt80:j_idt473_items"));
		int position=0;
		for(WebElement webElement: Bussiness)
		{
			position++;
			if(position==1)
			{
				webElement.click();
				break;
			}
			
		}
		Companypage.Emailid.sendKeys(properties.getProperty("Emailid"));
	}
	public void proofavailable()
	{
		Companypage.PrrofAvailable.click();
		List<WebElement> proofAvailable=driver.findElements(By.id("form_Id1:j_idt80:j_idt517_items"));
		int position=0;
		for(WebElement webElemnt:proofAvailable)
		{
			position++;
			if(position==1)
			{
				webElemnt.click();
				break;
			}
		}
		Companypage.Totelincome.sendKeys(properties.getProperty("income"));
		
		
	}
	
		
		
	
	@Test
	public void CompanyInfo() throws InterruptedException {
		PageFactory.initElements(driver,Companypage.class);
		Companydetails();
		professional();
		Organization();
	}
}
