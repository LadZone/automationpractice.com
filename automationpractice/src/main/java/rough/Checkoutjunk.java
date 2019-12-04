package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automationpractice.utilities.Utils;

public class Checkoutjunk {
	
	
	@FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[2]")
	public WebElement dressesBtn;
	
	@FindBy(xpath="//*[@id=\'center_column\']/ul/li[5]/div/div[1]/div/a[1]/img")
	public WebElement printedDress;
	
	
	@FindBy(xpath="//*[@id=\'add_to_cart\']/button")
	public WebElement addToCart;
	
	
	
	@FindBy(xpath="//*[@id=\'center_column\']/ul/li[5]/div/div[2]/div[2]/a[2]/span")
	public WebElement more;
	
	@FindBy(className="product product-7 product-printed-chiffon-dress category-8 category-dresses hide-left-column hide-right-column lang_en")
	public WebElement classname;
	
	@FindBy(xpath="//span[contains(text(), \"Proceed to checkout\")]")
	public WebElement ProceedToCheckout;
	
	
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li//span[contains(text(), \"Add to cart\")]")
	public WebElement Addtocart ;
	
	
	
	@FindBy(id="layer_cart")
	public WebElement layer_cart;
	
	@FindBy(className="//span[@title=\"Continue shopping\"]")
	public WebElement ContinueShopping;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
	public WebElement AddedMessage;

	

	

	
	
}
