package com.testing.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.testing.base.BasePage;
import com.testing.utils.CommonMethods;
import com.testing.utils.LoblawsConstants;

public class SignInPage extends BasePage {

	By createPCId = By.cssSelector(LoblawsConstants.CREATE_PC_ID);

	public SignInPage(WebDriver driver) {
		super(driver);
	}

	public CreatePcId clickOnCreatePCId() {
		CommonMethods.clickOnWebelement(createPCId, driver);
		return (new CreatePcId(driver));
	}

}
