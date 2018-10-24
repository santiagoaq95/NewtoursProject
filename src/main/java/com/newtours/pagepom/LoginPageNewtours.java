package com.newtours.pagepom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageNewtours {
	
	//Inicializaci�n de variables
	WebDriver driver;
	By username = By.name("userName");
	By password = By.xpath("//input[@type='password']");
	By loginButton = By.xpath("//input[@type='image']");
	
	

	//Constructor
	public LoginPageNewtours(WebDriver driver) {

		this.driver = driver;
	}

	//M�todo para ingresar datos en el login 
	public void loginToNewtours(String userid, String pass) {
		typeUserName(userid);
		typePassword(pass);
		clickOnLoginButton();
	}

	//M�todo para ingresar campos del username
	public void typeUserName(String uid) {
		driver.findElement(username).sendKeys(uid);
	}
	//M�todo para ingresar campos del password
	public void typePassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	//M�todo para dar click en el bot�n 
	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
}
