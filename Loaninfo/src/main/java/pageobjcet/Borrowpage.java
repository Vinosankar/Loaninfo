package pageobjcet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Borrowpage {
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt80\']/ul/li[3]/a")
	public static WebElement Borrow;
	@FindBy(id="form_Id1:j_idt80:mobileNo")
	public static WebElement Moblienumber;
	@FindBy(id="form_Id1:j_idt80:email")
	public static WebElement Emailid;
	@FindBy(id="form_Id1:j_idt80:statePincode")
	public static WebElement pincode;
	@FindBy(id="form_Id1:j_idt80:city")
	public static WebElement city;
	@FindBy(id="form_Id1:j_idt80:caddress")
	public static WebElement address;
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt80:j_idt318\']/div[2]")
	public static WebElement checkbox;
	@FindBy(id="form_Id1:j_idt80:paddress")
	public static WebElement Address2;
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt80:residenceType\']/div[3]/span")
	public static WebElement Residencetype;
	
	
}
