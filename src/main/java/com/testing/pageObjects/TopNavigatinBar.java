package com.testing.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.testing.base.BasePage;
import com.testing.utils.LoblawsConstants;

public class TopNavigatinBar extends BasePage {

	By myShopLink = By.cssSelector(LoblawsConstants.MY_SHOP_LINK);
	By closeButtn = By.className(LoblawsConstants.CLOSE_BUTTON);

	public TopNavigatinBar(WebDriver driver) {
		super(driver);
	}

	public MyShopPage clickMyShopLink() {
		WebElement button = driver.findElement(By.className("sl-frame"));
		driver.switchTo().frame(button);
		driver.findElement(closeButtn).click();
		driver.switchTo().defaultContent();
		driver.findElement(myShopLink).click();
		return new MyShopPage(driver);
	}

}
