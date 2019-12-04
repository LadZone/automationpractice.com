package automationpractice.page.action;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.relevantcodes.extentreports.LogStatus;

import automationpractice.base.Page;
import automationpractice.page.locators.HomePageLocators;



public class HomePage extends Page {
	
	public HomePageLocators home;
	public HomePage() {
		this.home=new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);
	}

	public void gotoSignIn() {
		log.debug("clicking signin button");
		test.log(LogStatus.INFO, "Clicking on SignIn Button");
		
		home.signInBtn.click();
		log.debug("signIn button");
		
	
		
	}
	
	

}