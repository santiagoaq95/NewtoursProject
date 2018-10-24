package com.newtours.pagespom.byforpage;

import org.openqa.selenium.By;

import com.newtours.seleniumdriver.way.RegisterWay;

public class ByForRegisterPage {


	// Formas de encontrar elementos web usando By
	public final static By FIRSTNAME_BY_NAME = By.name(RegisterWay.FIRSTNAME_WAY_BY_NAME);
	public final static By LASTNAME_BY_NAME = By.name(RegisterWay.LASTNAME_WAY_BY_NAME);
	public final static By PHONE_BY_XPATH = By.xpath(RegisterWay.PHONE_WAY_BY_XPATH);
	public final static By EMAIL_BY_ID = By.id(RegisterWay.EMAIL_WAY_BY_ID);
	public final static By ADDRESS1_BY_XPATH = By.xpath(RegisterWay.ADDRESS1_WAY_BY_XPATH);
	public final static By ADDRESS2_BY_NAME = By.name(RegisterWay.ADDRESS2_WAY_BY_NAME);
	public final static By CITY_BY_NAME = By.name(RegisterWay.CITY_WAY_BY_NAME);
	public final static By STATE_BY_NAME = By.name(RegisterWay.STATE_WAY_NAME);
	public final static By POSTALCODE_BY_NAME = By.name(RegisterWay.POSTALCODE_WAY_BY_NAME);
	public final static By USERNAME_BY_ID = By.id(RegisterWay.USERNAME_WAY_BY_NAME);
	public final static By PASSWORD_BY_NAME = By.name(RegisterWay.PASSWORD_WAY_BY_NAME);
	public final static By CONFIRMPASSWORD_BY_XPATH = By.xpath(RegisterWay.CONFIRMPASSWORD_WAY_BY_XPATH);
	public final static By SUBMITBUTTON_BY_XPATH = By.xpath(RegisterWay.SUBMITBUTTON_WAY_BY_XPATH);
	public final static By COUNTRY_BY_NAME= By.name(RegisterWay.COUNTRY_WAY_BY_NAME);
}
