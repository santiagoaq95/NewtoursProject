package com.newtours.stepdefinitions;

import java.util.List;
import java.util.Map;


import cucumber.api.java.en.Given;

public class StepDefTableWithHeader {
	@Given("i login with following credentials with header")
	public void i_login_with_following_credentials_with_header(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>> params = dataTable.asMaps(String.class, String.class);
		
		
		for (int i=0; i<params.size();i++) {
			System.out.println("Username: "+params.get(i).get("username"));
			System.out.println("Password "+params.get(i).get("password"));
		}
	}
}
