package com.my.features.definitions.shopping;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class GivenBuysDog {
	
	private ShoppingCart cart;
	private Counter countGivenCalls;
	public GivenBuysDog(ShoppingCart cart, Counter counter) {
		this.cart = cart;
		this.countGivenCalls = counter;
	}
	
	@Given("^first-time owner buys a dog they love$")
	public void first_time_owner_buys_a_dog_they_love() throws Throwable {
		cart.add("poodle");
		countGivenCalls.increment();
	}
}
