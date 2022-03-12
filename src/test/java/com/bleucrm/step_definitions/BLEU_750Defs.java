package com.bleucrm.step_definitions;

import com.bleucrm.pages.QuickNavigateMenuPage;
import com.bleucrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

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

        BrowserUtils.waitForClickablility(quickNavigateMenuPage.highPriorityCheckBox,10);
       quickNavigateMenuPage.highPriorityCheckBox.click();


    }

    @Then("Verify that the checkbox is clickable")
    public void verify_that_the_checkbox_is_clickable() {
        Assert.assertTrue("checkBox is not selected",quickNavigateMenuPage.highPriorityCheckBox.isSelected());

    }

    //Test Case 2
    @When("user clicks visual editor")
    public void user_clicks_visual_editor() {
        BrowserUtils.waitFor(2);
     quickNavigateMenuPage.visualEditorBtn.click();
    }

    @Then("verify that the visual editor messagebox is displayed")
    public void verify_that_the_visual_editor_messagebox_is_displayed() {

        Assert.assertTrue(quickNavigateMenuPage.textEditorBarOnTop.isDisplayed());

       // Assert.assertTrue("text bar is not displayed",quickNavigateMenuPage.textEditorBarOnTop.isDisplayed());
    }

    //Test Case 3
    @When("user clicks checklist")
    public void user_clicks_checklist() {
        BrowserUtils.waitFor(2);
        quickNavigateMenuPage.checkListBtn.click();
    }

    @Then("verify that the checklist text is displayed on the top")
    public void verify_that_the_checklist_text_is_displayed_on_the_top() {
        String textCheckList = quickNavigateMenuPage.checkListText.getText();
        System.out.println("textCheckList = " + textCheckList);
        Assert.assertEquals("Checklist",textCheckList);
    }

    @When("user enter some words or sentences in the input box")
    public void user_enter_some_words_or_sentences_in_the_input_box() {
        quickNavigateMenuPage.CheckListInputText.sendKeys("ali" + Keys.ENTER);
        quickNavigateMenuPage.CheckListInputText.sendKeys("veli"+ Keys.ENTER);
        quickNavigateMenuPage.CheckListInputText.sendKeys("deli :D"+ Keys.ENTER);
    }

    @Then("user click the add button or checkmark")
    public void user_click_the_add_button_or_checkmark() {
     BrowserUtils.selectCheckBox(quickNavigateMenuPage.setVerifyAddCheckList(quickNavigateMenuPage.verifyAddCheckList),false);

    }

    //Test Case 4

    @When("user clicks separator")
    public void user_clicks_separator() {
       quickNavigateMenuPage.CheckListSeparatorBtn.click();

    }

    @Then("user can see the separator lines between checklist items.")
    public void user_can_see_the_separator_lines_between_checklist_items() {

        Assert.assertTrue("sdaffwef",quickNavigateMenuPage.separatorLine.isEnabled());
    }


}
