package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Commonfunction.commonfunction;
import pageobjcet.loginpage;

public class Logintestcases extends commonfunction {



	public void Login() throws InterruptedException
	{
		testCase=extentReport.createTest("functionality1Test1");
		PageFactory.initElements(driver,loginpage.class);
		loginpage.login.sendKeys(properties.getProperty("username"));
		loginpage.password.sendKeys(properties.getProperty("password"));
		loginpage.loginbutton.click();
		loginpage.lap.click();

		loginpage.Add.click();
		loginpage.Individual.click();
		Thread.sleep(2000);
		loginpage.loan.click();
		loginpage.Pannumber.sendKeys(properties.getProperty("PanNumber"));
		loginpage.Verify.click();
		Thread.sleep(13000);

		loginpage.Fathername.sendKeys("K.sankar");
		loginpage.Mothername.sendKeys("S.selvi");


	}
	public void SelectNationality() throws InterruptedException
	{
		loginpage.Nationality.click();
		Thread.sleep(1000);
		List<WebElement>dropdown= driver.findElements(By.id("form_Id1:j_idt80:j_idt199_items"));
		int position=0;
		for(WebElement webElement :dropdown)
		{
			position++;
			if(position==1)
			{
				webElement.click();
				break;
			}
		}


	}

	public void gender() throws InterruptedException
	{
		loginpage.Gender.click();
		Thread.sleep(1000);
		List<WebElement> Dropdown =driver.findElements(By.id("form_Id1:j_idt80:j_idt206_items"));
		int position=0;
		for(WebElement webElement :Dropdown)
		{
			position++;
			if(position==1)
			{
				webElement.click();
				break;
			}
		}
		loginpage.status.click();
		Thread.sleep(1000);
		List<WebElement> dropdown2 =driver.findElements(By.id("form_Id1:j_idt80:j_idt221_items"));
		int position1=0;
		for (WebElement webElement1 :dropdown2)
		{
			position1++;
			if (position1==1)
			{
				webElement1.click();
				break;
			}
		}
	}
	public void Calender()
	{
		loginpage.Calender.click();
		WebElement month =driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/div/select[1]"));
		Select select = new Select(month);
		select.selectByIndex(1);
		WebElement Year =driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/div/select[2]"));
		Select select1 = new Select(Year);
		select1.selectByIndex(2);
		loginpage.date.click();
		loginpage.dependencies.sendKeys("number of 2");
		loginpage.location.sendKeys(properties.getProperty("location"));
		loginpage.applicationno.sendKeys(properties.getProperty("applicationno"));
		loginpage.Loanamount.sendKeys(properties.getProperty("Loanamount"));
		loginpage.Dynamicvalue.sendKeys("Individual value");
		loginpage.DSAvalue.sendKeys("Dynamic value");
		testCase=extentReport.createTest("Upload image");
		testCase.log(Status.INFO,"Uploading Image");


	}

	@Test
	public void functionorder() throws InterruptedException
	{
		PageFactory.initElements(driver,loginpage.class);
		Login();
		SelectNationality();
		gender();
		Calender();


	}

}
