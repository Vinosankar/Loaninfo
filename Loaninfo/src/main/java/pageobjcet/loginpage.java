package pageobjcet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
	
	@FindBy(id="form:username")
	public static WebElement login;
	@FindBy(id="form:password")
	public static WebElement password;
	@FindBy(id="form:j_idt13")
	public static WebElement loginbutton;
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt19\']")
	public static WebElement lap;
	@FindBy(id="form_Id1:j_idt73")
	public static WebElement Add;
	@FindBy(xpath="//td[2]//div//div[2]//span")
	public static WebElement Individual;
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt83\']/ul/li[2]/a")
	public static WebElement loan;
	@FindBy(id="form_Id1:j_idt80:j_idt184")
	public static WebElement Pannumber;
	@FindBy(id="form_Id1:j_idt80:j_idt186")
	public static WebElement Verify;
	@FindBy(id="form_Id1:j_idt80:j_idt192")
	public static WebElement Fathername;
	@FindBy(id="form_Id1:j_idt80:j_idt195")
	public static WebElement Mothername;
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt80:j_idt199\']/div[3]")
	public static WebElement Nationality;
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt80:j_idt206\']/div[3]/span")
	public static WebElement Gender;
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt80:j_idt221\']/div[3]/span")
	public static WebElement status;
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt80:j_idt213\']/button/span[1]")
	public static WebElement Calender;
	@FindBy(xpath="//tbody/tr[2]/td[6]/a")
	public static WebElement date;
	@FindBy(id="form_Id1:j_idt80:j_idt227")
	public static WebElement dependencies;
	@FindBy(id="form_Id1:j_idt80:j_idt258_input")
	public static WebElement location;
	@FindBy(id="form_Id1:j_idt80:j_idt262")
	public static WebElement applicationno;
	@FindBy(id="form_Id1:j_idt80:borrLoan")
	public static WebElement Loanamount;
	@FindBy(id="form_Id1:j_idt80:j_idt273")
	public static WebElement Dynamicvalue;
	@FindBy(id="form_Id1:j_idt80:j_idt269")
	public static WebElement DSAvalue;
	

}
