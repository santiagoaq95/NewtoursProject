package com.newtours.pagespom.byforpage;

import org.openqa.selenium.By;

import com.newtours.seleniumdriver.way.LoginWays;

/**
 * @author SANTIAGO
 *
 */
public final class ByForLoginPage {

	// Formas de encontrar elementos web usando BY
	public final static By USERNAME_BY_NAME = By.name(LoginWays.USERNAME_WAY_BY_NAME);
	public final static By PASSWORD_BY_XPATH = By.xpath(LoginWays.PASSWORD_WAY_BY_XPATH);
	public final static By LOGINBUTTOM_BY_XPATH = By.xpath(LoginWays.LOGIN_BUTTON_WAY_BY_XPATH);

}
