package com.bleucrm.step_definitions;

import com.bleucrm.pages.ServicesPage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class ServicesStepDefs {

    ServicesPage servicesPage=new ServicesPage();

    @Given("user can see {string} under Activity stream")
    public void user_can_see_under_Activity_stream(String services) {
        servicesPage.Services.click();
        BrowserUtils.waitFor(1);

    }


    @When("user enters {string} page")
    public void user_enters_page(String string) {
        servicesPage.Ideas.click();
        BrowserUtils.waitFor(1);


    }
    @Then("user can suggest new idea")
    public void user_can_suggest_new_idea() {
        servicesPage.newIdea.click();
        servicesPage.writeIdea.sendKeys("my Idea");
       // servicesPage.writeIdea.sendKeys(Keys.TAB);
        BrowserUtils.waitFor(1);
        servicesPage.description.click();
        BrowserUtils.waitFor(1);
        Driver.get().switchTo().frame(servicesPage.description);
        servicesPage.ideaTextBox.sendKeys("sth");
        Driver.get().switchTo().parentFrame();

      //  servicesPage.z.sendKeys("being thankful");
       // servicesPage.description.sendKeys(Keys.ENTER);

        BrowserUtils.waitFor(2);
        servicesPage.submitNewIdea.click();
    }
    @Given("User clicks on Ideas page")
    public void user_clicks_on_Ideas_page() {
        servicesPage.Services.click();
        servicesPage.Ideas.click();
        //Driver.get().navigate().back();

    }
    @When("User can sort the ideas by date added")
    public void user_can_sort_the_ideas_by_date_added() {
        BrowserUtils.waitFor(1);
        servicesPage.dateAdded.click();

    }
    @Then("User can sort the ideas by rating")
    public void user_can_sort_the_ideas_by_rating() {
        servicesPage.rating.click();

    }
    @Given("User likes {string} idea")
    public void user_likes_idea(String string) {
        //servicesPage.visible.click();
        servicesPage.like.click();
        BrowserUtils.waitFor(5);

    }
    @Then("User dislikes {string} idea")
    public void user_dislikes_idea(String string) {

    }
    @Given("User clicks on new category")
    public void user_clicks_on_new_category() {
        servicesPage.Services.click();
        BrowserUtils.waitFor(1);
        servicesPage.Ideas.click();
        servicesPage.newCategory.click();
        BrowserUtils.waitFor(1);
    }
    @When("User enters name of category")
    public void user_enters_name_of_category() {
        servicesPage.NAME.sendKeys("A Category");
        BrowserUtils.waitFor(1);


    }
    @Then("User saves it")
    public void user_saves_it() {
        servicesPage.savebtn.click();
        BrowserUtils.waitFor(1);
    }

    @Given("User enter to Lists page")
    public void user_enter_to_Lists_page() {
        servicesPage.Services.click();
        BrowserUtils.waitFor(1);
        servicesPage.Lists.click();

    }
    @Then("User clicks print button")
    public void user_clicks_print_button() {

        BrowserUtils.waitFor(1);
        servicesPage.print.click();
    }
}
