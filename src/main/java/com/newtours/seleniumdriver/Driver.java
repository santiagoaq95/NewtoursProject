package com.newtours.seleniumdriver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	// Metodo para crear el driver segun el navegador
	public WebDriver getDriver(String nombreNavegador) {

		switch (nombreNavegador.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			return this.driver = new ChromeDriver();

		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
			return this.driver = new FirefoxDriver();

		case "ie":
			System.setProperty("webdriver.ie.driver", "C:\\driver\\IEDriverServer.exe");
			return this.driver = new InternetExplorerDriver();

		case "internetexplorer":
			System.setProperty("webdriver.ie.driver", "C:\\driver\\IEDriverServer.exe");
			return this.driver = new InternetExplorerDriver();

		case "edge":
			System.setProperty("webdriver.edge.driver", "C:\\driver\\MicrosoftWebDriver.exe");
			return this.driver = new EdgeDriver();

		default:
			try {
				if ("".equals(nombreNavegador)) {
					throw new IOException("Error: El campo del nombre de navegador está vacio");
				} else {
					throw new IOException("Error: No existe el driver para: " + nombreNavegador);
				}
			} catch (IOException excepcion) {
				excepcion.printStackTrace();

			}

		}
		return driver;

	}

}
