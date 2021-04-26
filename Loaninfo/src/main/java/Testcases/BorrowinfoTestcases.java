package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Commonfunction.commonfunction;
import pageobjcet.Borrowinfopage;

public class BorrowinfoTestcases extends commonfunction {
	@Test
	public void Borrowdetails()
	{
		PageFactory.initElements(driver,Borrowinfopage.class);
		Borrowinfopage.Borrowlink.click();
		Borrowinfopage.SavingBank.sendKeys("10000");
		Borrowinfopage.Accountnumber.sendKeys(properties.getProperty("Accountnumber"));
		Borrowinfopage.ifcs.sendKeys(properties.getProperty("ifsc"));
	}
	
	public void otherProperty() {
		Borrowinfopage.otherProperties.click();
		List<WebElement> otherproperty =driver.findElements(By.id("form_Id1:j_idt80:j_idt534:otherPropertiesOwened_items"));
		int position=0;
		for(WebElement webElement :otherproperty)
		{
			if(position==1)
			{
				webElement.click();
				break;
			}
		}
	}
 public void bankname() {
	 Borrowinfopage.Bankname.click();
	 List<WebElement> bankname=driver.findElements(By.id("form_Id1:j_idt80:j_idt534:bankName_items"));
	 int position=0;
	 for(WebElement webElement:bankname)
	 {
		 if(position==1)
		 {
			 webElement.click();
			 break;
		 }
	 }
	 testCase=extentReport.createTest("Browserinfo Info Details");
		testCase.log(Status.PASS, "Test Method Successfgully");
 }
 @Test
 public void Borrowinfodetails()
 { 
	 PageFactory.initElements(driver,Borrowinfopage.class);
	 Borrowdetails();
	 otherProperty();
	 bankname();
	 
 }

 
}
