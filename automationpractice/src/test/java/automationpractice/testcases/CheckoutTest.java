package automationpractice.testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import automationpractice.base.Page;
import automationpractice.page.action.CheckoutPage;
import automationpractice.page.action.HomePage;
import automationpractice.page.action.LoginPage;
import automationpractice.page.locators.CartPageLocators;
import automationpractice.page.locators.CheckoutPageLocators;
import automationpractice.page.locators.ClothesPageLocators;

public class CheckoutTest extends Page {
	private ClothesPageLocators clothes;
	private Actions action;
	private CheckoutPageLocators shoppingActions;
	private CartPageLocators cart;

	@Test
	public void loginTest(){
				
		Page.initConfiguration();
		test.log(LogStatus.INFO, "Login Test started");
		HomePage home = new HomePage();
		home.gotoSignIn();
		LoginPage login=new LoginPage();
		login.doLogin("alaylad@gmail.com", "alay123");
		String actual = Page.driver.getTitle();
		String expected="My account - My Store";
		Assert.assertEquals(actual, expected);
		test.log(LogStatus.INFO, "Login Test started");
		CheckoutPage checkout = new CheckoutPage();
		checkout.gotoDressseBnt();
		Page.quitBrowser();
		}
	
}
