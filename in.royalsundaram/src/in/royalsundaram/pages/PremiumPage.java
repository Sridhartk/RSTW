package in.royalsundaram.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringKeyboard;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

public class PremiumPage {
	WebDriver driver;
	
	@FindBy(id="scale-slider")
	private WebElement slider;
	
	//span[@style='left: 66.6667%;']
	
	@FindBy(xpath="//span[@data-value='7']")
	private WebElement  clickslide;
	
	@FindBy(xpath="//button[@title='Buy']")
	private WebElement buyBTN;
//	
	@FindBy(xpath="//div[contains (@class,\"wrapperDiv height100 col-md-6 no-padding margin-auto col-sm-8\")]")
 private	WebElement scroll;
	
	@FindBy(xpath="//div[@class=\" wrapperDiv height100 col-md-6 no-padding margin-auto col-sm-8\"]/../div/div[4]")
	private WebElement cancelBTN;
	
//	@FindBy(xpath="(//table[@class='table table-responsive premium-breakup-table'])[3]")
//	private WebElement clickBTN;
	
	@FindBy(xpath="(//button[@title='OK'])[5]")
	private WebElement okBTN;
	
	public PremiumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		
	}
	
//	public void Clickslider1() throws AWTException
//	{
//		slider.click();
//		Robot r=new Robot();
//		r.mousePress(0);
//		r.mouseMove(5, 0);
//		r.mouseRelease(0);
//	}
	
//	public void clikcslider2() throws AWTException
//	{
//		Robot r1=new Robot();
//		r1.mousePress(1);
//		r1.mouseMove(66, 0);
//		r1.mouseRelease(0);
//		clickslide.click();
//	}
	public void clickbuyBTN()
	{
		buyBTN.click();
	}
	
	/*public void cilckBTN()
	{
	//	clickBTN.click();
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,3000)");
//		cancelBTN.click();
	}*/
	
	public void cilckscroll() throws AWTException
	{
		
		
		//js.executeScript("window.scrollBy(0,2000)");
		
	//	
		
//		
//		scroll.click();
		cancelBTN.click();
		
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_SHIFT);
//		r.keyPress(KeyEvent.VK_2);
//		r.keyRelease(KeyEvent.VK_SHIFT);
//		r.keyRelease(KeyEvent.VK_2);
			   
	}
	
	public void clickok() 
	{
	
	//	JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		js.executeScript("arguments[0].scrollIntoView();", okBTN);
//		js.executeScript("window.scrollBy(0,6000)");
//		cancelBTN.click();
		okBTN.click();
	}
	
	
}
