package in.royalsundaram.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtherCompanyInsurancePages {
	@FindBy(xpath="//input[contains(@placeholder,'Please enter your registration number')]")
	private WebElement Regno;
	
	@FindBy(xpath="//input[contains(@placeholder,'Please enter mobile number')]")
	private WebElement Mobileno;
	
	@FindBy(xpath="//button[@title='Get Quote']")
	private WebElement GetBTN;
	public OtherCompanyInsurancePages(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setRegno(String reg)
	{
		Regno.sendKeys(reg);
	}
	
	public void setMob(String mob)
	{
		Mobileno.sendKeys(mob);
	}
	
	public void Clickon()
	{
		GetBTN.click();
	}
	
	
	

}
