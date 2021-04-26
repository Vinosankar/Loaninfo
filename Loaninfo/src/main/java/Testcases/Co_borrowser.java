package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Commonfunction.commonfunction;
import pageobjcet.Coborrowserpage;

public class Co_borrowser extends commonfunction {
	
	public void Co_borrowser_details() throws InterruptedException {
		Coborrowserpage.Coborrowser.click();
		Coborrowserpage.personaldetailslink.click();
		Coborrowserpage.pannumber.sendKeys(properties.getProperty("PanNumber"));
		Coborrowserpage.Verify.click();
		Thread.sleep(13000);
		Coborrowserpage.coborrowsername.sendKeys("SelveKrishnan");
		Coborrowserpage.Fathername.sendKeys("K.Sankar");
		Coborrowserpage.Mothername.sendKeys("S.selvi");
	}
	
public void nationality() throws InterruptedException {
	Coborrowserpage.Nationality.click();
	List<WebElement> nationality =driver.findElements(By.id("form_Id1:j_idt80:coBorrowerTabview:0:coBorrowerPersonalDetails:nationality_items"));
	Thread.sleep(1000);
	int position=0;
	for (WebElement webElement:nationality)
	{ position++;
		if(position==1)
		{
			webElement.click();
			break;
			}
	}
}

public void Gender() throws InterruptedException {
	Coborrowserpage.gender.click();
	Thread.sleep(1000);
	List<WebElement>gender =driver.findElements(By.id("form_Id1:j_idt80:coBorrowerTabview:0:coBorrowerPersonalDetails:gender_items"));
	for(WebElement webelement:gender)
	{
	  String Text =webelement.getText();
	  if(Text.contains("Male"))
	  {
		  webelement.click();
	  }
	}
}
public void status() throws InterruptedException
{
	Coborrowserpage.status.click();
	Thread.sleep(1000);
	List<WebElement> status =driver.findElements(By.id("form_Id1:j_idt80:coBorrowerTabview:0:coBorrowerPersonalDetails:status_items"));
	int position=0;
	for(WebElement webElement:status)
	{position++;
		if(position==1)
		{
			webElement.click();
		}
	}
}
@Test()

public void Co_Borrowser_fun() throws InterruptedException
{
	PageFactory.initElements(driver,Coborrowserpage.class);
	Co_borrowser_details();
	 nationality();
	 Gender();
	 status();
	 testCase=extentReport.createTest("Co_Borrower Details Fully");
		testCase.log(Status.PASS,"Test Method Run Successfully");
}
}
