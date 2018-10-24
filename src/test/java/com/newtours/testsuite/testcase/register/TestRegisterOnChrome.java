package com.newtours.testsuite.testcase.register;

import java.io.IOException;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import com.newtours.pagespom.RegisterPageNewtours;

import com.newtours.seleniumdriver.screenshot.Screenshot;


public class TestRegisterOnChrome {
	static RegisterPageNewtours registerPageNewtours;
	static Screenshot screenshot;

	@Before
	public void setUp() throws Exception {
		registerPageNewtours = new RegisterPageNewtours();
		registerPageNewtours.launcheBrowser("chrome");
		registerPageNewtours.openBrowserUrl("http://newtours.demoaut.com/mercuryregister.php");
		screenshot = new Screenshot();
	}

	@After
	public void tearDown() throws Exception {
		registerPageNewtours.closeBrowser();
	}
	


	@Test
	public void test() throws IOException {
		registerPageNewtours.RegisterContactInformation("Mario", "Hernandez", "321122122", "mahe12@gmail.com");
		screenshot.TakeScreenshot(registerPageNewtours.getNavegadorDriver(), "Foto1");
		registerPageNewtours.RegisterMaillingInformation("calle 22#122-11", "apto 202", "La Ceja", "Antioquia","123521","Colombia");
		screenshot.TakeScreenshot(registerPageNewtours.getNavegadorDriver(), "Foto2");
		registerPageNewtours.RegisterUserInformation("Mahe", "mahesito", "mahesito");
		screenshot.TakeScreenshot(registerPageNewtours.getNavegadorDriver(), "Foto3");
		registerPageNewtours.clickOnSubmit();
		screenshot.TakeScreenshot(registerPageNewtours.getNavegadorDriver(), "Foto4");

	}
}
