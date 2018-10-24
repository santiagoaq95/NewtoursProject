package com.newtours.pagespom;

import com.newtours.pagespom.byforpage.ByForRegisterPage;
import com.newtours.seleniumdriver.PageActions;

public class RegisterPageNewtours extends PageActions {

	// Constructor
	public RegisterPageNewtours() {
	

	}

	// Método para ingresar información parcial en el registro, enfocado a la
	// información de contacto
	public void RegisterContactInformation(String first, String last, String number, String email) {
		typeFirstName(first);
		typeLastName(last);
		typePhoneNum(number);
		typeEmail(email);
	}

	// Método para ingresar información de correo
	public void RegisterMaillingInformation(String address1, String address2, String city, String state,
			String postalCode, String country) {
		typeAddress1(address1);
		typeAddress2(address2);
		typeCity(city);
		typeState(state);
		typePostalCode(postalCode);
		selectCountry(country);
	}

	// Método para ingresar información de usuario
	public void RegisterUserInformation(String uid, String pass, String confirm) {
		typeUserName(uid);
		typePassword(pass);
		typeConfirmPassword(confirm);
	}

	// Método para ingresar campo del Firstname
	public void typeFirstName(String first) {
		typeInTextBox(ByForRegisterPage.FIRSTNAME_BY_NAME, first);
	}

	// Método para ingresar campo del Lasttname
	public void typeLastName(String last) {
		typeInTextBox(ByForRegisterPage.LASTNAME_BY_NAME, last);
	}

	// Método para ingresar campo del numero de Telefono
	public void typePhoneNum(String number) {
		typeInTextBox(ByForRegisterPage.PHONE_BY_XPATH, number);
	}

	// Método para ingresar campo del email
	public void typeEmail(String email) {
		typeInTextBox(ByForRegisterPage.EMAIL_BY_ID, email);
	}

	// Método para ingresar campo de direcciòn 1
	public void typeAddress1(String address) {
		typeInTextBox(ByForRegisterPage.ADDRESS1_BY_XPATH, address);
	}

	// Método para ingresar campo de direcciòn 2
	public void typeAddress2(String address) {
		typeInTextBox(ByForRegisterPage.ADDRESS2_BY_NAME, address);
	}

	// Método para ingresar campo de la ciudad
	public void typeCity(String city) {
		typeInTextBox(ByForRegisterPage.CITY_BY_NAME, city);
	}

	// Método para ingresar campo del estado
	public void typeState(String state) {
		typeInTextBox(ByForRegisterPage.STATE_BY_NAME, state);
	}

	// Método para ingresar campo del còdigo
	public void typePostalCode(String postalCode) {
		typeInTextBox(ByForRegisterPage.POSTALCODE_BY_NAME, postalCode);
	}

	public void selectCountry(String country) {
		selectOptionOnComboBox(ByForRegisterPage.COUNTRY_BY_NAME, country.toUpperCase());
	}

	// Método para ingresar campo del email
	public void typeUserName(String uid) {
		typeInTextBox(ByForRegisterPage.USERNAME_BY_ID, uid);
	}

	// Método para ingresar campo del password
	public void typePassword(String pass) {
		typeInTextBox(ByForRegisterPage.PASSWORD_BY_NAME, pass);
	}

	// Método para ingresar campo de confirmar password
	public void typeConfirmPassword(String pass) {
		typeInTextBox(ByForRegisterPage.CONFIRMPASSWORD_BY_XPATH, pass);
	}

	// Método para dar click en el botón
	public void clickOnSubmit() {
		clickOnButton(ByForRegisterPage.SUBMITBUTTON_BY_XPATH);
	}

}
