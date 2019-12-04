package automationpractice.page.action;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import automationpractice.base.Page;
import automationpractice.page.locators.LoginPageLocators;



public class LoginPage extends Page {
	
	LoginPageLocators login;
	
	public static  Logger log = Logger.getLogger("MLogger");
	
	public LoginPage() {
		this.login=new LoginPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.login);
	}

	public void doLogin(String myusername, String mypassword) {
		log.debug("type username");
		test.log(LogStatus.INFO, "Entering username");
		login.username.sendKeys(myusername);
		log.debug("type password");
		test.log(LogStatus.INFO, "Entering password");
		login.password.sendKeys(mypassword);
		log.debug("click submit button");
		test.log(LogStatus.INFO, "Click Submit Button");
		login.submitBtn.click();
	
		
		
	}

}
