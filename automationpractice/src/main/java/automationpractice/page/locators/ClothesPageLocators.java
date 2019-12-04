package automationpractice.page.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automationpractice.utilities.Utils;



public class ClothesPageLocators {
	
	private WebDriver driver;
	
	public ClothesPageLocators(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getWomenBtn() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]"), 30);
	}
	
	public WebElement getDressesBtn() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]"), 30);
	}
	
	public WebElement getTShirtsBtn() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]"), 30);
	}
	
	public WebElement getDressesDropDown() {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul"), 30);
	}
	
	public WebElement getCasualDressesBtn() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]//a[contains(text(), \"Casual Dresses\")]"), 30);
	}
	
	public WebElement getEveningDressesBtn() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"subcategories\"]/ul/li[2]/div[1]/a"), 30);
	}
	
	public WebElement getSummerDressesBtn() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]//a[contains(text(), \"Summer Dresses\")]"), 30);
	}
	
	/**@param dressNum (value 1) */
	public WebElement getCasualDressProduct(int dressNum) {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"center_column\"]/ul/li[" + dressNum + "]"), 30);	
	}
	
	/**@param dressNum (value 1) */
	public WebElement getEveningDressProduct(int dressNum) {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"center_column\"]/ul/li[" + dressNum + "]"), 30);	
	}
	
	/**@param dressNum (values from 1 to 3) */
	public WebElement getSummerDressProduct(int dressNum) {
		return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"center_column\"]/ul/li[" + dressNum + "]"), 30);	
	}
	
	public List<WebElement> getDressesCount() {
		return driver.findElements(By.xpath("//*[@id=\"center_column\"]/ul/li"));	
	}
	public WebElement TShirts() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"), 30);
	}
	public WebElement DRESSES() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"), 30);
	}
	
}
