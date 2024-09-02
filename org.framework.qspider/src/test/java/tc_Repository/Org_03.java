package tc_Repository;

import org.testng.annotations.Test;

import genricUtilityorLibrary.BaseClass;
import genricUtilityorLibrary.ExcelUtility;
import genricUtilityorLibrary.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class Org_03 extends BaseClass {
	
	@Test
	public void Org_03Case() throws Exception{
		JavaUtility JUTIL =new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL=new ExcelUtility();

	String ORGNAME=EUTIL.readDatafromExcel("Organization", 6, 1);
	String EMP=EUTIL.readDatafromExcel("Organization", 6, 2);
	String EMAIL=EUTIL.readDatafromExcel("Organization", 6, 3);
	String Bill_State=EUTIL.readDatafromExcel("Organization", 6, 4);
	String OTEmail=EUTIL.readDatafromExcel("Organization", 6, 5);
	String BILL_ADD=EUTIL.readDatafromExcel("Organization", 6, 6);
	String BILL_STATE =EUTIL.readDatafromExcel("Organization",6 , 7);
	
	HomePage hp =new HomePage(driver);
	hp.clickonOrg();
	OrgHomePage ohp= new OrgHomePage(driver);
	ohp.clickOnNewOrgBtn();
	CreateNewOrgPage op=new CreateNewOrgPage(driver);
	op.createOrganisation(ORGNAME, EMP, EMAIL, BILL_STATE, OTEmail, BILL_ADD, BILL_STATE);
	Thread.sleep(4000);

}
}
