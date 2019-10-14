package com.testing.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.testing.base.BasePage;
import com.testing.utils.LoblawsConstants;

public class CompleteProfile extends BasePage {

	static Logger logger = Logger.getLogger(CompleteProfile.class.getName());

	By completeProfileVerificatinText = By
			.cssSelector(LoblawsConstants.COMPLETE_PROFILE_VERIFICATIN_TEXT);

	public CompleteProfile(WebDriver driver) {
		super(driver);
	}

	public void verifyCompleteProfiletext() {
		String actualResult = driver.findElement(completeProfileVerificatinText).getText();
		Assert.assertEquals(actualResult.trim(), "Complete Your Profile");
	}

}
