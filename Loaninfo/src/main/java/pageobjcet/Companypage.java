package pageobjcet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Companypage{
	
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt80\']/ul/li[4]/a")  
	public static WebElement Companyinfo;
	@FindBy(id="form_Id1:j_idt80:j_idt440")
	public static WebElement PanNumber;
	@FindBy(id="form_Id1:j_idt80:j_idt442")
	public static WebElement verify;
	@FindBy(id="form_Id1:j_idt80:j_idt448")
	public static WebElement GstNo;
	@FindBy(id="form_Id1:j_idt80:j_idt450")
	public static WebElement Verify2;
	@FindBy(id="form_Id1:j_idt80:j_idt486")
	public static WebElement address;
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt80:j_idt456\']/div[3]/span") 
	public static WebElement professtional;
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt80:j_idt464\']/div[3]/span")
	public static WebElement organization;
	@FindBy(id="form_Id1:j_idt80:j_idt480")
	public static WebElement Type_of_industry;
	@FindBy(id="form_Id1:j_idt80:Pincode1")
	public static WebElement Pincode;
	@FindBy(id="form_Id1:j_idt80:cityTown1")
	public static WebElement City;
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt80:j_idt473\']/div[3]/span")
	public static WebElement Typeofbussiness;
	@FindBy(id="form_Id1:j_idt80:emailId1")
	public static WebElement Emailid;
	@FindBy(id="form_Id1:j_idt80:j_idt506")
	public static WebElement Bussiness;
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt80:j_idt517\']/div[3]/span")
	public static WebElement PrrofAvailable;
	@FindBy(id="form_Id1:j_idt80:j_idt523")
	public static WebElement Totelincome;

}
