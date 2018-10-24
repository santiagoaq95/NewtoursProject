package com.newtours.stepdefinitions;

import com.newtours.seleniumdriver.PageActions;

import cucumber.api.java.en.When;

public class StepDefNavegador {
	
	public PageActions pageActinos= new PageActions();
	@When("^abro la aplicacion en el navegador (Chrome|Firefox|edge)$")
	public void abro_la_aplicacion_en_el_navegador_Chrome(String navegador) {
	    pageActinos.launcheBrowser(navegador);
	}


}
