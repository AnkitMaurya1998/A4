package tc_Repository;

import org.testng.annotations.Test;

import genricUtilityorLibrary.BaseClass;
import genricUtilityorLibrary.ExcelUtility;
import genricUtilityorLibrary.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class Le_03 extends BaseClass{
	@Test (groups= {"regression"})
	public void le_02Case() throws Exception {
		JavaUtility JUTIL =new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL=new ExcelUtility();
		
		String FIRSTNAME=EUTIL.readDatafromExcel("Lead", 10, 1);
		String LASTNAME=EUTIL.readDatafromExcel("Lead", 10, 2);
		String COMPANY=EUTIL.readDatafromExcel("Lead", 10, 3);
		String TITLE=EUTIL.readDatafromExcel("Lead", 10, 4);
		String	STATE=EUTIL.readDatafromExcel("Lead", 10, 5);
		String COUNTRY=EUTIL.readDatafromExcel("Lead", 10, 6);
		String NO_OF_EMP=EUTIL.readDatafromExcel("Lead", 10, 7);
	
		
		HomePage hp=new HomePage(driver);
		hp.clickonLeads();
		LeadsHomePage lp=new LeadsHomePage(driver);
		lp.clickOnNEwLeadBtn();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		cn.createLead(FIRSTNAME+num, LASTNAME, COMPANY, TITLE, STATE, COUNTRY, NO_OF_EMP);
		Thread.sleep(4000);
	}

}
