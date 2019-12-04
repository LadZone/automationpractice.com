package automationpractice.page.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automationpractice.utilities.Utils;

public class PayPageLocators {
private WebDriver driver;
	
	public PayPageLocators(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	
	public WebElement getPayByBankWire() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"), 30);
	}
	
	public WebElement getPayByCheck() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a"), 30);
	}
	public WebElement getIConfirmMyOrder() {
		return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"cart_navigation\"]/button"), 30);
	}
}
