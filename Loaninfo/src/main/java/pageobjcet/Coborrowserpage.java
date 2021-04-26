package pageobjcet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Coborrowserpage {
	
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt80\']/ul/li[6]/a")
	public static WebElement Coborrowser;
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt80:coBorrowerTabview:0:coBorrowerPersonalDetails\']/ul/li[1]/a")
	public static WebElement personaldetailslink;
	@FindBy(id="form_Id1:j_idt80:coBorrowerTabview:0:coBorrowerPersonalDetails:coBorrowerPan")
	public static WebElement pannumber;
	@FindBy(id="form_Id1:j_idt80:coBorrowerTabview:0:coBorrowerPersonalDetails:j_idt701")
	public static WebElement Verify;
	@FindBy(id="form_Id1:j_idt80:coBorrowerTabview:0:coBorrowerPersonalDetails:j_idt704")
	public static WebElement coborrowsername;
	
	@FindBy(id="form_Id1:j_idt80:coBorrowerTabview:0:coBorrowerPersonalDetails:fatherName")
	public static WebElement Fathername;
	
	@FindBy(id="form_Id1:j_idt80:coBorrowerTabview:0:coBorrowerPersonalDetails:motherName1")
	public static WebElement Mothername;
	@FindBy(id="form_Id1:j_idt80:coBorrowerTabview:0:coBorrowerPersonalDetails:nationality_label")
	public static WebElement Nationality;
	@FindBy(id="form_Id1:j_idt80:coBorrowerTabview:0:coBorrowerPersonalDetails:gender_label")
	public static WebElement gender;
	@FindBy(id="form_Id1:j_idt80:coBorrowerTabview:0:coBorrowerPersonalDetails:status_label")
	public static WebElement status;
	
	

}
