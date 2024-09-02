package tc_Repository;

import org.testng.annotations.Test;

import genricUtilityorLibrary.BaseClass;
import genricUtilityorLibrary.ExcelUtility;
import genricUtilityorLibrary.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

public class Le_04 extends BaseClass{
	@Test 
	public void le_04Case() throws Exception {
		JavaUtility JUTIL =new JavaUtility();
		int num = JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL=new ExcelUtility();
		String FIRSTNAME=EUTIL.readDatafromExcel("Leads", 14, 1);
		String LASTNAME=EUTIL.readDatafromExcel("Leads", 14, 2);
		String COMPANY=EUTIL.readDatafromExcel("Leads", 14, 3);
		String MOBILE=EUTIL.readDatafromExcel("Leads", 14, 4);
		String	EMAIL=EUTIL.readDatafromExcel("Leads", 14, 5);
		String POSTAL=EUTIL.readDatafromExcel("Leads", 14, 6);
		String COUNTRY=EUTIL.readDatafromExcel("Leads", 14, 7);
		String STATE=EUTIL.readDatafromExcel("Leads", 14, 8);
		String ANN_REV=EUTIL.readDatafromExcel("Leads", 14, 9);
		String STREET=EUTIL.readDatafromExcel("Leads", 14, 10);
		String POBOX=EUTIL.readDatafromExcel("Leads", 14, 11);
		
		
		HomePage hp=new HomePage(driver);
		hp.clickonLeads();
		LeadsHomePage lp=new LeadsHomePage(driver);
		lp.clickOnNEwLeadBtn();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		cn.createLead(FIRSTNAME+num, LASTNAME, COMPANY, MOBILE, POSTAL, EMAIL, STATE, COUNTRY, ANN_REV, STREET, POBOX);
		Thread.sleep(4000);
	}

}
