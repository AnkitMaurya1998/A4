package tc_Repository;

import org.testng.annotations.Test;

import genricUtilityorLibrary.BaseClass;
import genricUtilityorLibrary.ExcelUtility;
import genricUtilityorLibrary.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class Org_04 extends BaseClass {
	
	
	@Test
	public void Org_03Case() throws Exception{
		JavaUtility JUTIL =new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL=new ExcelUtility();
		
		String ORGNAME=EUTIL.readDatafromExcel("Organization", 15, 1);
		String EMP=EUTIL.readDatafromExcel("Organization", 15, 2);
		String WEB=EUTIL.readDatafromExcel("Organization", 15, 3);
		String PHONE=EUTIL.readDatafromExcel("Organization", 15, 4);
		String OTPHONE=EUTIL.readDatafromExcel("Organization", 15, 5);
		String EMAIL=EUTIL.readDatafromExcel("Organization", 15, 6);
		String BILL_CITY =EUTIL.readDatafromExcel("Organization",15 , 7);
		String OTEMAIL =EUTIL.readDatafromExcel("Organization",15, 8);
		String POCODE =EUTIL.readDatafromExcel("Organization",15 , 9);
	
	HomePage hp =new HomePage(driver);
	hp.clickonOrg();
	OrgHomePage ohp= new OrgHomePage(driver);
	ohp.clickOnNewOrgBtn();
	CreateNewOrgPage op=new CreateNewOrgPage(driver);
	op.createOrganisation(ORGNAME, EMP, WEB, PHONE, OTPHONE, EMAIL, BILL_CITY, OTEMAIL, POCODE);
	Thread.sleep(4000);

	}
}