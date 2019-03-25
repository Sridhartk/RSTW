package in.roytalsundaram.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;


import in.royalsundaram.generics.BaseTest;
import in.royalsundaram.generics.XL;
import in.royalsundaram.pages.OtherCompanyInsurancePages;

public class TwoWheelerInusurence extends BaseTest {
@Test
public void twowheelerinsu()
{
  	String Regno=XL.getData(XL_PATH, "RSTW", 1, 0);
  	String mob=XL.getData(XL_PATH, "RSTW", 1, 1);
  
  OtherCompanyInsurancePages oci=new OtherCompanyInsurancePages(driver);
  oci.setRegno(Regno);
  oci.setMob(mob);
  oci.Clickon();
  
}
}
