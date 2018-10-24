package com.newtours.testsuite.testcase.login;



import java.io.IOException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.newtours.pagespom.LoginPageNewtours;
import com.newtours.seleniumdriver.data.DataString;
import com.newtours.seleniumdriver.data.ExcelSQL;
import com.newtours.seleniumdriver.screenshot.Screenshot;


public class TestLoginOnEdge {
	static LoginPageNewtours loginPageNewtours;
	static Screenshot screenshot;
	static List<String> username;
	static List<String> password;
	@Before
	public void setUp() throws Exception {
		loginPageNewtours = new LoginPageNewtours();
		loginPageNewtours.launcheBrowser("edge");
		loginPageNewtours.openBrowserUrl("http://newtours.demoaut.com/");
		screenshot= new Screenshot();
		ExcelSQL excel =new ExcelSQL();
		username=excel.DataExcel("userName", DataString.EXCEL_PATH, DataString.TABLE_NAME_LOGIN, DataString.SELECT_QUERY);
		password=excel.DataExcel("password", DataString.EXCEL_PATH, DataString.TABLE_NAME_LOGIN, DataString.SELECT_QUERY);
	}

	@After
	public void tearDown() throws Exception {
		loginPageNewtours.closeLogin();
	}

	@Test
	public void test() throws IOException {
	
		loginPageNewtours.loginToNewtours(username.get(0), password.get(0));
		screenshot.TakeScreenshot(loginPageNewtours.getNavegadorDriver(), "testEdge");
		loginPageNewtours.clickOnLoginButton();
		screenshot.TakeScreenshot(loginPageNewtours.getNavegadorDriver(), "testEdgeResult");
	}

}
