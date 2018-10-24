package com.newtours.seleniumdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PageActions {

	// Creación del driver
	private WebDriver navegadorDriver;

	// Obtener el driver
	public WebDriver getNavegadorDriver() {
		return navegadorDriver;
	}

	// Set del driver
	public void setNavegadorDriver(WebDriver navegadorDriver) {
		this.navegadorDriver = navegadorDriver;
	}

	// Constructor en el cual se inicializa el webdriver
	public PageActions() {
		
	}

	public void launcheBrowser(String navegador) {
		Driver driver = new Driver();
		navegadorDriver = driver.getDriver(navegador);
	}

	// Método para maximizar la ventana del navegador
	public void openWindowMaximized() {
		navegadorDriver.manage().window().maximize();
	}

	// Método para abrir el navegador en una url específica
	public void openBrowserUrl(String url) {
		openWindowMaximized();
		navegadorDriver.get(url);

	}

	// Método para agregar un texto a un textbox
	public void typeInTextBox(By findBy, String str) {
		navegadorDriver.findElement(findBy).sendKeys(str);
	}

	// Método para dar click sobre un botón
	public void clickOnButton(By findBy) {
		navegadorDriver.findElement(findBy).click();
	}

	// Método para seleccionar un dato de un ComboBox
	public void selectOptionOnComboBox(By findBy, String option) {
		Select select = new Select(navegadorDriver.findElement(findBy));
		select.selectByVisibleText(option);
	}

	// Método para cerrar el navegador
	public void closeBrowser() {
		navegadorDriver.quit();
	}

}
