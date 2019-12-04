package rough;



import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


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
		clothesPage.DRESSES().click();
		log.debug("clicking Dresses button");
		clothesPage.getEveningDressesBtn().click();
		log.debug("clicking Evening Dresses button");
		clothesPage.getEveningDressProduct(1).click();
		log.debug("clicking Evening Dresses Product(1) button");
		checkout.AddCartBtn().click();
		log.debug("clicking Add Cart button");
		checkout.getProceedToCheckoutBtn().click();
		log.debug("clicking Proceed To Checkout button");
		cartproceed.getCartProceedBtn().click();
		log.debug("clicking Cart Proceed button");
		cartproceed.getCartProceedBtnTwo().click();
		log.debug("clicking Cart Proceed button2");
		cartproceed.getTermsOfService().click();
		log.debug("clicking check mark Terms Of Service button2");
		cartproceed.getCartProceedBtnTwo().click();
		log.debug("clicking Cart Proceed button3");
		pay.getPayByBankWire().click();
		log.debug("clicking Pay By Bank Wire button");
		pay.getIConfirmMyOrder().click();
		log.debug("Order Confirm button");
	}
	

}

