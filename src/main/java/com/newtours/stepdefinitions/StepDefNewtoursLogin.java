package com.newtours.stepdefinitions;


import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.newtours.pagespom.LoginPageNewtours;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepDefNewtoursLogin {
	LoginPageNewtours loginPage = new LoginPageNewtours();

	@Given("^I launch (Chrome|Firefox|Edge) browser$")
	public void i_launch_Chrome_browser(String navegador) {
		loginPage.launcheBrowser(navegador);
	}

	@When("I open Login Newtours")
	public void i_open_Login_Newtours() {

		loginPage.openBrowserUrl("http://newtours.demoaut.com/");
	}

	@When("Enter username and password")
	public void enter_username_and_password(DataTable dataTable) {
		List<Map<String, String>> params = dataTable.asMaps(String.class, String.class);
		loginPage.loginToNewtours(params.get(0).get("username"), params.get(0).get("password"));

	}

	@When("I do click on button sign in")
	public void i_do_click_ton_button_sign_in() {

		loginPage.clickOnLoginButton();
	}

	@Then("I validate tag SING-OFF")
	public void i_validate_tag_SING_OFF()  {
		loginPage.getNavegadorDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Boolean condition = loginPage.getNavegadorDriver().findElement(By.xpath("//a[.='SIGN-OFF']")).isDisplayed();
		loginPage.closeLogin();
		assertTrue(condition);

	}

	@Then("Close browser")
	public void close_browser() {

		loginPage.closeLogin();
	}
	
	
}
