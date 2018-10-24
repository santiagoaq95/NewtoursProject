package com.newtours.seleniumdriver.screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	// Pantallazo pantalla completa
	public void TakeScreenshot(WebDriver driver, String nombre) throws IOException {
		File foto1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(foto1, new File("C:\\Fotos_prueba\\" + nombre + ".png"));
	}

	// Pantallazo a elemento específico By name 
	public void TakeScreenshotForAnItemByName(WebDriver driver, String nombreElemento, String nombreFoto) throws IOException {
		File pantallazo = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		BufferedImage fullImg = ImageIO.read(pantallazo);
		Point point = driver.findElement(By.name(nombreElemento)).getLocation();
		int anchoElemento = driver.findElement(By.name(nombreElemento)).getSize().getWidth();
		int alturaElemento = driver.findElement(By.name(nombreElemento)).getSize().getHeight();

		BufferedImage pantallazoElemento = fullImg.getSubimage(point.getX(), point.getY(), anchoElemento,
				alturaElemento);
		ImageIO.write(pantallazoElemento, "png", pantallazo);
		File localizacionElemento = new File("C:\\Fotos_prueba\\" + nombreElemento +nombreFoto+ ".png");
		FileUtils.copyFile(pantallazo, localizacionElemento);
	}

}
