package com.testing.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.testing.pageObjects.CompleteProfile;
import com.testing.pageObjects.CreatePcId;
import com.testing.pageObjects.LaunchPage;
import com.testing.pageObjects.MyShopPage;
import com.testing.pageObjects.SignInPage;
import com.testing.pageObjects.TopNavigatinBar;
import com.testing.testcases.base.BaseTest;
import com.testing.utils.LoblawsConstants;

public class UITestCases extends BaseTest {
	
	static Logger logger = Logger.getLogger(UITestCases.class.getName());

private LaunchPage launchPage;
private TopNavigatinBar topNavigationBar;
private MyShopPage myShopPage;
private SignInPage signInPage;
private CreatePcId createPcId;
private CompleteProfile completeProfile;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		try {
		init(LoblawsConstants.BROWSER_TYPE);
		launchPage = new LaunchPage(driver);
		topNavigationBar = launchPage.gotoLoginPage();
		myShopPage = topNavigationBar.clickMyShopLink();
		signInPage = myShopPage.clickOnSignInButton();
		createPcId = signInPage.clickOnCreatePCId();
		Thread.sleep(2000);
		completeProfile = createPcId.clickOnCreatePCId();
		}catch(Exception e) {
			logger.debug("Setup failed "+e.getMessage());
		}
	}

	/* Test case to verify Complete Profile text*/
	@Test
	public void completeProfileTest() {
		completeProfile.verifyCompleteProfiletext();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
