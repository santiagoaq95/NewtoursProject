package com.newtours.testsuite.testcase.login;

import java.io.IOException;
import java.util.Collection;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.codoid.products.exception.FilloException;
import com.newtours.pagespom.LoginPageNewtours;
import com.newtours.seleniumdriver.data.DataString;
import com.newtours.seleniumdriver.data.ExcelSQL;
import com.newtours.seleniumdriver.screenshot.Screenshot;
import com.newtours.seleniumdriver.way.LoginWays;

@RunWith(Parameterized.class)
public class TestLoginOnChrome {

	static LoginPageNewtours loginPageNewtours;
	static Screenshot screenshot;
	@Before
	public void setUp() throws Exception {
		loginPageNewtours = new LoginPageNewtours();
		loginPageNewtours.launcheBrowser("chrome");
		loginPageNewtours.openBrowserUrl("http://newtours.demoaut.com/");
		screenshot=new Screenshot();
	}

	@After
	public void tearDown() throws Exception {
		loginPageNewtours.closeLogin();
	}
	
	@Parameters
	public static Collection<String> listaUsername() throws FilloException{
		ExcelSQL excel =new ExcelSQL();
		Collection<String> lista= excel.DataExcel("userNAme", DataString.EXCEL_PATH, DataString.TABLE_NAME_LOGIN,DataString.SELECT_QUERY);
		return lista;
	}
	
	@Parameter
	public String username;
	
	
	@Test
	public void test() throws IOException {
		
		loginPageNewtours.loginToNewtours(username, "asdee");
		screenshot.TakeScreenshot(loginPageNewtours.getNavegadorDriver(),"antesChrome");
		screenshot.TakeScreenshotForAnItemByName(loginPageNewtours.getNavegadorDriver(), LoginWays.USERNAME_WAY_BY_NAME, "Element");
		loginPageNewtours.clickOnLoginButton();
		screenshot.TakeScreenshot(loginPageNewtours.getNavegadorDriver(),"resultadoChrome");
	}
	

}
