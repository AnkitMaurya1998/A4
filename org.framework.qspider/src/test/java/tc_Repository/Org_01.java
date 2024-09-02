package tc_Repository;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genricUtilityorLibrary.BaseClass;
import genricUtilityorLibrary.ExcelUtility;
import genricUtilityorLibrary.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class Org_01 extends BaseClass{

	@Test 
	public void Org_01Case() throws Exception{
		JavaUtility JUTIL =new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL=new ExcelUtility();

	
		String ORGNAME=EUTIL.readDatafromExcel("Organization", 2, 1);
		String EMP=EUTIL.readDatafromExcel("Organization", 2, 2);
		String WEBSITE=EUTIL.readDatafromExcel("Organization", 2, 3);
		
		HomePage hp =new HomePage(driver);
		hp.clickonOrg();
		OrgHomePage ohp= new OrgHomePage(driver);
		ohp.clickOnNewOrgBtn();
		CreateNewOrgPage op=new CreateNewOrgPage(driver);
		op.createOrgnisation(ORGNAME, EMP, WEBSITE);
		Thread.sleep(4000);
	}
	
}
