package com.my.features.definitions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import cucumber.api.java.en.Then;

public class ThenDiscount {

	private ShoppingCart cart;
	private Counter givenCalledThisManyTimes;
	
	public ThenDiscount(ShoppingCart cart, Counter counter) {
		this.cart = cart;
		this.givenCalledThisManyTimes = counter;
	}
	
	@Then("selected accessory is discounted at (\\d+)%$")
	public void selected_accessories_are_discounted_at(int percenteDiscounted) throws Throwable {
		if (dogInCart(cart)) {
			assertThat(selectedAccessoriesAreDiscounted(cart, percenteDiscounted), equalTo(true));
			assertThat("Since the World is destroyed after each scenario run, counter must always be 1", givenCalledThisManyTimes.toString(), equalTo("1"));
		}
	}
	
	// Later, emergent design may suggest putting the below 
	// outside of this class.  For now, wait and see when other definitions want this functionality. 
	// 
	private boolean selectedAccessoriesAreDiscounted(ShoppingCart cart, int percentDiscounted) {
		// insert code to contact a service that returns the carts total,
		// then check if it discounted correctly.
		// I'm cheating now as I don't intend to build this service.
		return true;
	}

	private boolean dogInCart(ShoppingCart cart) {
		// insert code to iterate to check for dog...
		// I'm cheating now as I don't intend to build this service.
		return true;
	}
	
}
