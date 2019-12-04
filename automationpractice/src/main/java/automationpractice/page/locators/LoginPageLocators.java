package automationpractice.page.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
		
		@FindBy(xpath="//*[@id=\'email\']")
		public WebElement username;
		
		@FindBy(xpath="//*[@id=\'passwd\']")
		public WebElement password;		
		
		@FindBy(id="SubmitLogin")
		public WebElement submitBtn;

	}

