package com.bleucrm.step_definitions;

import com.bleucrm.pages.DashBoardPage;
import com.bleucrm.pages.EventsPage;
import com.bleucrm.pages.LoginPage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.ConfigurationReader;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateEvent {

    LoginPage loginPage = new LoginPage();
    DashBoardPage dashBoardPage = new DashBoardPage();
    EventsPage eventsPage = new EventsPage();

    @Given("the user is on the events page")
    public void the_user_is_on_the_events_page() {


        loginPage.login(ConfigurationReader.get("username"),ConfigurationReader.get("password"));

        dashBoardPage.moveToTab("Event");


    }

    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String eventName, String message) {


        eventsPage.eventNameBox.sendKeys(eventName);

        Driver.get().switchTo().frame(eventsPage.frame);

        eventsPage.messageBox.sendKeys(message);

        Driver.get().switchTo().defaultContent();


    }

    @When("the user enters {string}, {string} and {string}, {string}")
    public void the_user_enters_and(String startDate, String startTime, String endDate, String endTime) {

        eventsPage.startDateBox.clear();
        eventsPage.startDateBox.sendKeys(startDate);

        eventsPage.startTimeBox.clear();
        eventsPage.startTimeBox.sendKeys(startTime);

        eventsPage.endDateBox.clear();
        eventsPage.endDateBox.sendKeys(endDate);

        eventsPage.endTimeBox.clear();
        eventsPage.endTimeBox.sendKeys(endTime);



    }

    @When("the user sets a reminder")
    public void the_user_sets_a_reminder() {

        eventsPage.reminderCheckBox.click();
        eventsPage.reminderCheckBox.click();

    }

    @When("the user should be able to select {string}")
    public void the_user_should_be_able_to_select(String eventLocation) {

        eventsPage.selectLocation(eventLocation);



    }

    @When("the user specifies {string} for start and end date")
    public void the_user_specifies_for_start_and_end_date(String timeZone) {

        eventsPage.selectTimeZone(timeZone);



    }

    @When("the user adds {string}")
    public void the_user_adds(String attendee) {

        eventsPage.memberLink.click();

        eventsPage.attendeesBox.sendKeys(attendee);

    }

    @When("the user clicks on More dropdown")
    public void the_user_clicks_on_dropdown() {

        eventsPage.moreDropDown.click();


    }

    @Then("the parameters {string}, {string}, {string} and {string} should be displayed")
    public void the_parameters_and_should_be_displayed(String p1, String p2, String p3, String p4) {

        Assert.assertTrue(eventsPage.getParameter(p1).isDisplayed());
        Assert.assertTrue(eventsPage.getParameter(p2).isDisplayed());
        Assert.assertTrue(eventsPage.getParameter(p3).isDisplayed());
        Assert.assertTrue(eventsPage.getParameter(p4).isDisplayed());



    }

    @Then("the user should be able to create event send a message")
    public void the_user_should_be_able_to_create_event_send_a_message() {

        eventsPage.sendButton.click();

        Assert.assertEquals("https://qa.bleucrm.com/stream/",Driver.get().getCurrentUrl());



    }
}
