package automationpractice.page.action;



import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import automationpractice.base.Page;
import automationpractice.page.locators.CartPageLocators;
import automationpractice.page.locators.CheckoutPageLocators;
import automationpractice.page.locators.ClothesPageLocators;
import automationpractice.page.locators.LoginPageLocators;
import automationpractice.page.locators.PayPageLocators;
import rough.Checkoutjunk;



public class CheckoutPage extends Page{
	
	public CheckoutPageLocators checkout;
	public ClothesPageLocators clothesPage;
	public LoginPageLocators login;
	public Checkoutjunk junk;
	public CartPageLocators cartproceed;
	public PayPageLocators pay;
	public CheckoutPage() {
		this.junk=new Checkoutjunk();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.junk);
		
				
	}	
	
	
	public void gotoDressseBnt() {
		
		clothesPage = new ClothesPageLocators(driver);
		checkout = new CheckoutPageLocators (driver);
		cartproceed= new CartPageLocators(driver);
		pay = new PayPageLocators(driver);
		//log working 
		log.debug("clicking signin button");
		
		
		Assert.assertTrue(clothesPage.DRESSES().isDisplayed());
		clothesPage.DRESSES().click();
		log.debug("clicking Dresses button");
		
		
		Assert.assertTrue(clothesPage.getEveningDressesBtn().isDisplayed());
		clothesPage.getEveningDressesBtn().click();
		log.debug("clicking Evening Dresses button");
		
		
		Assert.assertTrue(clothesPage.getEveningDressProduct(1).isDisplayed());
		clothesPage.getEveningDressProduct(1).click();
		log.debug("clicking Evening Dresses Product(1) button");
		
		
		Assert.assertTrue(checkout.AddCartBtn().isDisplayed());
		checkout.AddCartBtn().click();
		log.debug("clicking Add Cart button");
		
		
		
		Assert.assertTrue(checkout.getProceedToCheckoutBtn().isDisplayed());
		checkout.getProceedToCheckoutBtn().click();
		log.debug("clicking Proceed To Checkout button");
		
		
		
		Assert.assertTrue(cartproceed.getCartProceedBtn().isDisplayed());
		cartproceed.getCartProceedBtn().click();
		log.debug("clicking Cart Proceed button");
		
		
		
		Assert.assertTrue(cartproceed.getCartProceedBtnTwo().isDisplayed());
		cartproceed.getCartProceedBtnTwo().click();
		log.debug("clicking Cart Proceed button2");
		
		//Assert.assertTrue(cartproceed.getTermsOfService().isDisplayed());
		cartproceed.getTermsOfService().click();
		log.debug("clicking check mark Terms Of Service button2");
		
		Assert.assertTrue(cartproceed.getCartProceedBtnTwo().isDisplayed());
		cartproceed.getCartProceedBtnTwo().click();
		log.debug("clicking Cart Proceed button3");
		
		Assert.assertTrue(pay.getPayByBankWire().isDisplayed());
		pay.getPayByBankWire().click();
		log.debug("clicking Pay By Bank Wire button");
		
		Assert.assertTrue(pay.getIConfirmMyOrder().isDisplayed());
		pay.getIConfirmMyOrder().click();
		log.debug("Order Confirm button");
		
	}
	

}

