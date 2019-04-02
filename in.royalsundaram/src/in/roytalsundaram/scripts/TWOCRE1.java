package in.roytalsundaram.scripts;

import org.testng.annotations.Test;

import in.royalsundaram.generics.BaseTest;
import in.royalsundaram.generics.XL;
import in.royalsundaram.pages.OtherCompanyInsurancePages;
import in.royalsundaram.pages.TWOCREPage;
import in.royalsundaram.pages.TWOther_Company_Renewal_EditPage;

public class TWOCRE1 extends BaseTest{
   @Test
   public void testTWOCR1() throws InterruptedException
   {
	   String Regno=XL.getData(XL_PATH, "RSTW", 1, 0);
	  	String mob=XL.getData(XL_PATH, "RSTW", 1, 1);
	  	
		//String MY=XL.getData(XL_PATH, "TWOCR", 1, 0);
		String MC=XL.getData(XL_PATH, "TWOCR", 1, 1);
		String RD=XL.getData(XL_PATH, "TWOCR", 1, 2);
		String PED=XL.getData(XL_PATH, "TWOCR", 1, 3);
		String MN=XL.getData(XL_PATH, "TWOCR", 1, 4);
		String mname=XL.getData(XL_PATH, "TWOCR", 1, 5);
		
		String nam=XL.getData(XL_PATH, "TWOCR1", 1, 0);
		String mail=XL.getData(XL_PATH, "TWOCR1", 1, 1);
		
		OtherCompanyInsurancePages oci=new OtherCompanyInsurancePages(driver);
		  oci.setRegno(Regno);
		  oci.setMob(mob);
		  oci.Clickon();
		
		TWOther_Company_Renewal_EditPage twocr=new TWOther_Company_Renewal_EditPage(driver);
		Thread.sleep(2000);
		
		 twocr.ClickRY();
		 Thread.sleep(3000);
		 
		  
		 twocr.clickMC(MC);
		 Thread.sleep(3000);
		 
		 twocr.clickMFC();
		 Thread.sleep(3000);
		 
		 twocr.clickMD();
		 Thread.sleep(3000);
		 
		 twocr.setMD();
		 Thread.sleep(3000);
		 
		 twocr.clickPED();
		 Thread.sleep(3000);
		 
		 twocr.setPED();
		 Thread.sleep(3000);
		 
		 twocr.clickmanufacturename(MN);
		 Thread.sleep(3000);
		 
		 twocr.clickMFN();
		 Thread.sleep(3000);
		 
		 twocr.clickMN(mname);
		 Thread.sleep(3000);
		 
		 twocr.setMN();
		 Thread.sleep(3000);
		 
		 twocr.clicknext();
		 Thread.sleep(3000);
		 
		TWOCREPage twocr1=new TWOCREPage(driver);
		
		twocr1.clickNCB();
		Thread.sleep(3000);
		
		twocr1.ClickNCB1();
		Thread.sleep(3000);
		
		twocr1.Clicktitle();
		Thread.sleep(3000);
		
		twocr1.clicktitle1();
		Thread.sleep(3000);
		
		twocr1.setName(nam);
		Thread.sleep(3000);
		
		twocr1.setEmail(mail);
		Thread.sleep(3000);
		
		twocr1.clickGC();
		Thread.sleep(3000);
   }
}
