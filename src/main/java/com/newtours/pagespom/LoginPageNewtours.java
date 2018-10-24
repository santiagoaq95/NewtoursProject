package com.newtours.pagespom;

import com.newtours.pagespom.byforpage.ByForLoginPage;
import com.newtours.seleniumdriver.PageActions;

/**
 * @author SANTIAGO
 *
 */
public class LoginPageNewtours extends PageActions {

	// Constructor
	public LoginPageNewtours() {

	}

	// M�todo para ingresar datos en el login
	public void loginToNewtours(String userid, String pass) {
		typeUserName(userid);
		typePassword(pass);
	}

	// M�todo para ingresar campos del username
	public void typeUserName(String uid) {
		typeInTextBox(ByForLoginPage.USERNAME_BY_NAME, uid);
	}

	// M�todo para ingresar campos del password
	public void typePassword(String pass) {
		typeInTextBox(ByForLoginPage.PASSWORD_BY_XPATH, pass);
	}

	// M�todo para dar click en el bot�n
	public void clickOnLoginButton() {
		clickOnButton(ByForLoginPage.LOGINBUTTOM_BY_XPATH);
	}

	// M�todo para cerrar el navegador
	public void closeLogin() {
		closeBrowser();
	}
}
