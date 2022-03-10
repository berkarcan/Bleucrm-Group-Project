package com.bleucrm.step_definitions;

import com.bleucrm.pages.QuickNavigateMenuPage;
import com.bleucrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BLEU_750Defs {

    QuickNavigateMenuPage quickNavigateMenuPage = new QuickNavigateMenuPage();
    //Test case 1
    @When("user click task {string} button")
    public void user_click_task_button(String str) {
        quickNavigateMenuPage.taskBtn.click();
        BrowserUtils.waitFor(2.0);

    }

    @Then("Verify that the high priority is visible")
    public void verify_that_the_high_priority_is_visible() {
        String str = quickNavigateMenuPage.highPriorityText.getText();
        System.out.println("str = " + str);
        Assert.assertEquals("High Priority",str);
    }

    @When("user click the high priority checkbox")
    public void user_click_the_high_priority_checkbox() {
       quickNavigateMenuPage.highPriorityCheckBox.click();
       BrowserUtils.waitForClickablility(quickNavigateMenuPage.highPriorityCheckBox,10);

    }

    @Then("Verify that the checkbox is clickable")
    public void verify_that_the_checkbox_is_clickable() {
        Assert.assertTrue("checkBox is not selected",quickNavigateMenuPage.highPriorityCheckBox.isSelected());

    }

    //Test Case 2
    @When("user clicks visual editor")
    public void user_clicks_visual_editor() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that the editor text bar is displayed above the message box")
    public void verify_that_the_editor_text_bar_is_displayed_above_the_message_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //Test Case 3
    @When("user clicks checklist")
    public void user_clicks_checklist() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify that the checklist text is displayed on the top")
    public void verify_that_the_checklist_text_is_displayed_on_the_top() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user enter some words or sentences in the input box")
    public void user_enter_some_words_or_sentences_in_the_input_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user click the add button or checkmark")
    public void user_click_the_add_button_or_checkmark() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    //Test Case 4

    @When("user clicks separator")
    public void user_clicks_separator() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("user can see the separator lines between checklist items.")
    public void user_can_see_the_separator_lines_between_checklist_items() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
