package com.testing.pageObjects;

import org.openqa.selenium.WebDriver;
import com.testing.base.BasePage;
import com.testing.utils.LoblawsConstants;

public class LaunchPage extends BasePage {

	public LaunchPage(WebDriver driver) {
		super(driver);
	}

	public TopNavigatinBar gotoLoginPage() {
		driver.get(LoblawsConstants.HOMEPAGE_URL);
		return new TopNavigatinBar(driver);
	}

}
