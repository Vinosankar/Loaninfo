package pageobjcet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Borrowinfopage {
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt80\']/ul/li[5]/a") 
	public static WebElement Borrowlink;
	@FindBy(id="form_Id1:j_idt80:j_idt534:savingsInBank")
	public static WebElement SavingBank;
	@FindBy(id="form_Id1:j_idt80:j_idt534:bankAccNo")
	public static WebElement Accountnumber;
	@FindBy(id="form_Id1:j_idt80:j_idt534:ifscCode")
	public static WebElement ifcs;
	
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt80:j_idt534:otherPropertiesOwened\']/div[3]/span")
	public static WebElement otherProperties;
	@FindBy(xpath="//*[@id=\'form_Id1:j_idt80:j_idt534:bankName\']/div[3]/span")
	public static WebElement Bankname;

}
