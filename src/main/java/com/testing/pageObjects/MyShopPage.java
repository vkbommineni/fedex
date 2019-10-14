package com.testing.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.testing.base.BasePage;
import com.testing.utils.LoblawsConstants;

public class MyShopPage extends BasePage {

	By signInButton = By.cssSelector(LoblawsConstants.SIGNIN_BUTTON);

	public MyShopPage(WebDriver driver) {
		super(driver);
	}

	public SignInPage clickOnSignInButton() {
		driver.findElement(signInButton).click();
		return new SignInPage(driver);
	}

}
