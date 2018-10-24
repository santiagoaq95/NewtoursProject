package com.newtours.stepdefinitions;

import java.util.Map;


import cucumber.api.java.en.Given;
import io.cucumber.datatable.DataTable;
public class StepDefLogin {
	@Given("I open mi application")
	public void i_open_mi_application() {
	    System.out.println("entro");
	}

	@Given("i login with following credentials")
	public void i_login_with_following_credentials(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		Map<String, String> params = dataTable.asMap(String.class, String.class);
		
		for (Map.Entry<String, String> entry : params.entrySet()) {
			System.out.println("Key "+ entry.getKey()+" Value " + entry.getValue());
		}
		
		
	}
}
