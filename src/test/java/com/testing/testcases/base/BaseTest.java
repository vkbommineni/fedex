package com.testing.testcases.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.testing.utils.LoblawsConstants;

public class BaseTest {

	public WebDriver driver;

	public void init(String browserType) {
		if (browserType.equals("Mozilla"))
			driver = new FirefoxDriver();
		else if (browserType.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+LoblawsConstants.CHROME_DRIVER_EXE);
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
}
