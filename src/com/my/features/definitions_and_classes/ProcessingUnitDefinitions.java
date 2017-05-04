package com.my.features.definitions_and_classes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProcessingUnitDefinitions {
	ProcessingUnit leastBusy;
	
	public ProcessingUnitDefinitions(ProcessingUnit leastBusy)
	{
		this.leastBusy = leastBusy;
	}
	
	@Given("^there are processing units with (\\d+)% capacity$")
	public void there_are_processing_units_with_capacity(int arg1) throws Throwable {
		leastBusy.unitId = 5;
	}

	@When("^\"([^\"]*)\" is available for processing$")
	public void is_available_for_processing(String arg1) throws Throwable {
	}

	@Then("^select least busy processing unit$")
	public void select_least_busy_processing_unit() throws Throwable {
		assertThat(leastBusy.unitId, equalTo(5));
	}

	@Then("^add to its work queue  # need to share information between Then and And$")
	public void add_to_its_work_queue_need_to_share_information_between_Then_and_And() throws Throwable {
	}

	@Given("^no processing unit has capacity$")
	public void no_processing_unit_has_capacity() throws Throwable {
	}

	@Given("^user \"([^\"]*)\" already has a job running$")
	public void user_already_has_a_job_running(String arg1) throws Throwable {
	}

	@When("^another job is added by user \"([^\"]*)\"$")
	public void another_job_is_added_by_user(String arg1) throws Throwable {
	}

	@Then("^block user \"([^\"]*)\"  # need to share information between Then and And\\. Could reword this to use \"([^\"]*)\" variable but lets see what happens$")
	public void block_user_need_to_share_information_between_Then_and_And_Could_reword_this_to_use_variable_but_lets_see_what_happens(String arg1, String arg2) throws Throwable {
		fail();
	}

	@Then("^signoff user$")
	public void signoff_user() throws Throwable {
		fail();
	}
}