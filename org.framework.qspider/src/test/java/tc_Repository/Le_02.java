package tc_Repository;

import org.testng.annotations.Test;

import genricUtilityorLibrary.BaseClass;
import genricUtilityorLibrary.ExcelUtility;
import genricUtilityorLibrary.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class Le_02 extends BaseClass{
	@Test (groups= {"smoke","regression"})
	public void le_02Case() throws Exception{
		JavaUtility JUTIL =new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL=new ExcelUtility();
		String FIRSTNAME=EUTIL.readDatafromExcel("Leads", 6, 1);
		String LASTNAME=EUTIL.readDatafromExcel("Leads", 6, 2);
		String COMPANY=EUTIL.readDatafromExcel("Leads", 6, 3);
		String MOBILE=EUTIL.readDatafromExcel("Leads", 6, 4);
		String	EMAIL=EUTIL.readDatafromExcel("Leads", 6, 5);
		String POSTAL=EUTIL.readDatafromExcel("Leads", 6, 6);
		String COUNTRY=EUTIL.readDatafromExcel("Leads", 6, 7);
		String STATE=EUTIL.readDatafromExcel("Leads", 6, 8);
		
		HomePage hp=new HomePage(driver);
		hp.clickonLeads();
		LeadsHomePage lp=new LeadsHomePage(driver);
		lp.clickOnNEwLeadBtn();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		cn.createLead(FIRSTNAME+num, LASTNAME, COMPANY, MOBILE, POSTAL, EMAIL, STATE, COUNTRY);
		Thread.sleep(4000);
}
}
