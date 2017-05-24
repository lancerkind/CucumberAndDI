package com.my.features.definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;

public class WhenBoughtSelectedAccessory {
	private ShoppingCart cart;
	
	public WhenBoughtSelectedAccessory(ShoppingCart cart)
	{
		this.cart = cart;
	}
	
	@When("^purchasing a \"([^\"]*)\"$")
	public void purchasing(String item) throws Throwable {
	    cart.add("dog dish");
	}
}
