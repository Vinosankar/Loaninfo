package Commonfunction;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class commonfunction {
	
	public static Properties properties = null;
	public static WebDriver driver =null;
	
public static	ExtentReports extentReport;
 public static	ExtentHtmlReporter htmlReporter;
 public static	 ExtentTest testCase;
 
	public Properties LoadPropertiesfiles() throws IOException
	{
		FileInputStream fileInputStream = new  FileInputStream("config.properties");
		 properties = new Properties();
		properties.load(fileInputStream);
		return properties;
		
	}
	
	@BeforeSuite
	public void lanchbrowser() throws IOException
	{
		
		LoadPropertiesfiles();
		htmlReporter = new ExtentHtmlReporter("report.html");
		 extentReport = new ExtentReports();
		htmlReporter.config().setReportName("Automation Test Result");
		extentReport.attachReporter(htmlReporter);
	
		String browser=properties.getProperty("browser");
		String url=properties.getProperty("url");
		String driverlocation=properties.getProperty("driverlocation");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverlocation);
			 driver = new ChromeDriver();
		
		}
		else
			if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.drivre", driverlocation);
		    driver = new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.get(url);
		testCase=extentReport.createTest("successfully Test");
		testCase.log(Status.PASS,"Test Method Successfully");
		
		
	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.navigate().refresh();
		
	}
	@AfterSuite
	public void  closedbrowser()
	{
		 
		
		extentReport.flush();
	}
	
}

