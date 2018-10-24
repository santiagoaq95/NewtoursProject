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

	// Método para ingresar datos en el login
	public void loginToNewtours(String userid, String pass) {
		typeUserName(userid);
		typePassword(pass);
	}

	// Método para ingresar campos del username
	public void typeUserName(String uid) {
		typeInTextBox(ByForLoginPage.USERNAME_BY_NAME, uid);
	}

	// Método para ingresar campos del password
	public void typePassword(String pass) {
		typeInTextBox(ByForLoginPage.PASSWORD_BY_XPATH, pass);
	}

	// Método para dar click en el botón
	public void clickOnLoginButton() {
		clickOnButton(ByForLoginPage.LOGINBUTTOM_BY_XPATH);
	}

	// Método para cerrar el navegador
	public void closeLogin() {
		closeBrowser();
	}
}
