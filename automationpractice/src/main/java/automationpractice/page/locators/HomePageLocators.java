package automationpractice.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


	public class HomePageLocators {
		
		@FindBy(xpath="//*[@id=\'header\']/div[2]/div/div/nav/div[1]/a")
		public WebElement signInBtn;
		
		

}
