package com.newtours.pagepom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageNewtours {
	
	//Inicialización de variables
	WebDriver driver;
	By username = By.name("userName");
	By password = By.xpath("//input[@type='password']");
	By loginButton = By.xpath("//input[@type='image']");
	
	

	//Constructor
	public LoginPageNewtours(WebDriver driver) {

		this.driver = driver;
	}

	//Método para ingresar datos en el login 
	public void loginToNewtours(String userid, String pass) {
		typeUserName(userid);
		typePassword(pass);
		clickOnLoginButton();
	}

	//Método para ingresar campos del username
	public void typeUserName(String uid) {
		driver.findElement(username).sendKeys(uid);
	}
	//Método para ingresar campos del password
	public void typePassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	//Método para dar click en el botón 
	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
}
