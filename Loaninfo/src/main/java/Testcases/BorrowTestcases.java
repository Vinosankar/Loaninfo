package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Commonfunction.commonfunction;
import pageobjcet.Borrowpage;

public class BorrowTestcases extends commonfunction{
	
	public void Borrowfun() throws InterruptedException
	{
		PageFactory.initElements(driver,Borrowpage.class);
		Borrowpage.Borrow.click();
		testCase=extentReport.createTest("Browser Info Details");
		testCase.log(Status.PASS, "Test Method Successfgully");
		Borrowpage.Moblienumber.sendKeys(properties.getProperty("Moblienumber"));
		Borrowpage.Emailid.sendKeys(properties.getProperty("Emailid"));
		Borrowpage.address.sendKeys(properties.getProperty("address"));
		
		
		Borrowpage.pincode.sendKeys(properties.getProperty("pincode"));
		Borrowpage.city.click();
		Borrowpage.checkbox.click();
		Borrowpage.Address2.sendKeys(properties.getProperty("address"));
	
		Thread.sleep(2000);
		
		
	}
	
public void Resitence() throws InterruptedException
{
	Borrowpage.Residencetype.click();
	Thread.sleep(1000);
	List<WebElement> Resitence =driver.findElements(By.id("form_Id1:j_idt80:residenceType_items"));
	int position=0;
	for(WebElement webElement :Resitence)
	{
		position++;
		if(position==2)
		{
			webElement .click();
			break;
		}
	}
}
@Test
public void BorrowFunction() throws InterruptedException
{
	PageFactory.initElements(driver,Borrowpage.class);
	 Borrowfun();
	 Resitence();
}
}
