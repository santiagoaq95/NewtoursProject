package com.newtours.testcase;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;




import com.newtours.pagepom.LoginPageNewtours;



public class VerifyNewtoursLogin {
	
	static WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.edge.driver", "C:\\driver\\MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.get("http://newtours.demoaut.com/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	

	@Test
	public void test() {

		LoginPageNewtours login =new LoginPageNewtours(driver);
		login.loginToNewtours("Sophos", "admin");
	}

}
