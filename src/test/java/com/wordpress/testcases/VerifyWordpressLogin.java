package com.wordpress.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.wordpress.pages.LoginPage;

public class VerifyWordpressLogin {
	
	static WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	@Test
	public void verifyValidLogin()
	{
		
		driver.manage().window().maximize();
		LoginPage login = new LoginPage(driver);
		login.clickOnLoginButton();
		
	}

}
