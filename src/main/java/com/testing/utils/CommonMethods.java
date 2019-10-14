package com.testing.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonMethods {

	public static void clickOnWebelement(By by, WebDriver driver) {
		try {
			driver.findElement(by).click();
		} catch (Exception e) {
			driver.findElement(by).click();
		}

	}

}
