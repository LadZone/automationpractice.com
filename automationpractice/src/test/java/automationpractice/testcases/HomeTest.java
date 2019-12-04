package automationpractice.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import automationpractice.base.Page;
import automationpractice.page.action.HomePage;



public class HomeTest extends Page {


	@Test
	public void signInTest() {

		Page.initConfiguration();
		//test.log(LogStatus.INFO, "SignIn Test started");
		HomePage home=new HomePage();
		home.gotoSignIn();
		//test.log(LogStatus.INFO, "SignIn Test ended");
		Page.quitBrowser();	

	}

}
