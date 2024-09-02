package tc_Repository;

import genricUtilityorLibrary.BaseClass;
import genricUtilityorLibrary.ExcelUtility;
import genricUtilityorLibrary.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class Org_02 extends BaseClass {
	
	public void Org_01Case() throws Exception{
		JavaUtility JUTIL =new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL=new ExcelUtility();

	
		String ORGNAME=EUTIL.readDatafromExcel("Organization", 6, 1);
		String EMP=EUTIL.readDatafromExcel("Organization", 6, 2);
		String WEBSITE=EUTIL.readDatafromExcel("Organization", 6, 3);
		String PHONE=EUTIL.readDatafromExcel("Organization", 6, 4);
		String OTPHONE=EUTIL.readDatafromExcel("Organization", 6, 5);
		String EMAIL=EUTIL.readDatafromExcel("Organization", 6, 6);
		String BILL_City =EUTIL.readDatafromExcel("Organization",6 , 7);
		
		HomePage hp =new HomePage(driver);
		hp.clickonOrg();
		OrgHomePage ohp= new OrgHomePage(driver);
		ohp.clickOnNewOrgBtn();
		CreateNewOrgPage op=new CreateNewOrgPage(driver);
		op.createOrganisation(ORGNAME+num, EMP, WEBSITE, PHONE, OTPHONE, EMAIL, BILL_City);
		Thread.sleep(4000);
}
}
