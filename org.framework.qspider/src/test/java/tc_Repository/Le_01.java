package tc_Repository;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genricUtilityorLibrary.BaseClass;
import genricUtilityorLibrary.ExcelUtility;
import genricUtilityorLibrary.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;
@Listeners(genricUtilityorLibrary.ListenersImplentationClass.class)
public class Le_01 extends BaseClass {
	@Test	(retryAnalyzer = genricUtilityorLibrary.RetryAnalyzerImplementationClass.class)
	public void le_01Case() throws Exception {
		JavaUtility JUTIL= new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL= new ExcelUtility();
		
		String FIRSTNAME=EUTIL.readDatafromExcel("Lead", 3, 1);
		String LASTNAME=EUTIL.readDatafromExcel("Lead", 3, 2);
		String COMPANY= EUTIL.readDatafromExcel("Lead", 3, 3);
		
		HomePage hp= new HomePage(driver);
		hp.clickonLeads();
		LeadsHomePage lp=new LeadsHomePage(driver);
		lp.clickOnNEwLeadBtn();
		CreateNewLeadPage cn= new CreateNewLeadPage(driver);
		cn.createLead(FIRSTNAME+num, LASTNAME, COMPANY);
		Thread.sleep(4000);
				
	}

}
