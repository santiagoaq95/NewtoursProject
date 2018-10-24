package com.newtours.stepdefinitions;


import com.newtours.seleniumdriver.PageActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefGoogle {
	PageActions pageActions = new PageActions();
	@Given("que lanzo el navegador")
	public void que_lanzo_el_navegador() {
	    pageActions.launcheBrowser("chrome");
	}

	@When("abro la pagina de inicio en Google")
	public void abro_la_pagina_de_inicio_en_Google() {
	   pageActions.openBrowserUrl("https://www.google.com/");
	}
	/*@Then("busco {string} y {int} en Google")
	public void busco_y_en_Google(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		pageActions.typeInTextBox(By.name("q"), string + " "+ int1);
	    pageActions.clickOnButton(By.name("btnK"));
	    pageActions.closeBrowser();
	}
*/

}
