package com.testing.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.testing.base.BasePage;
import com.testing.utils.CommonMethods;
import com.testing.utils.LoblawsConstants;

public class CreatePcId extends BasePage {

	By email = By.cssSelector(LoblawsConstants.EMAIL);
	By password = By.cssSelector(LoblawsConstants.PASSWORD);
	By checkBox = By.cssSelector(LoblawsConstants.CHECK_BOX);
	By submitButton = By.xpath(LoblawsConstants.SUBMIT_BUTTON);

	public CreatePcId(WebDriver driver) {
		super(driver);
	}

	public CompleteProfile clickOnCreatePCId() {
		driver.findElement(email).sendKeys(LoblawsConstants.TEST_EMAIL);
		driver.findElement(password).sendKeys(LoblawsConstants.TEST_PASSWORD);
		CommonMethods.clickOnWebelement(checkBox, driver);
		driver.findElement(submitButton).click();
		return new CompleteProfile(driver);
	}

}
