package com.bleucrm.step_definitions;

import com.bleucrm.pages.LoginPage;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MessageFunctionality {
    LoginPage login=new LoginPage();

    @When("User navigates to Message Tag")
    public void user_navigates_to_Message_Tag() {

      login.messageBut.click();
    }

    @When("User clicks on the To box")
    public void user_clicks_on_the_To_box() throws InterruptedException {
        Thread.sleep(2000);

         login.addMore.click();
    }

    @When("User selects Employees and Departments")
    public void user_selects_Employees_and_Departments() throws InterruptedException {
        Thread.sleep(2000);
       login.empDep.click();
    }

    @Then("User should see the selected users on TO box")
    public void user_should_see_the_selected_users_on_TO_box() {
        login.hr.click();
       WebElement newField= Driver.get().findElement(By.cssSelector("span[data-id='DR263']")) ;

            login.checkBox.click();
            Assert.assertTrue(login.checkBox.isSelected());
            Assert.assertTrue(newField.isDisplayed());

        }



    @When("User clicks on the {string} icon")
    public void user_clicks_on_the_icon(String str) {
        Assert.assertTrue(login.comma.isDisplayed());
        login.comma.click();

    }

    @When("User enters a quote")
    public void user_enters_a_quote() {
        Assert.assertTrue(login.quote.isDisplayed());

    }

    @Then("User should see the quote on the writting pad")
    public void user_should_see_the_quote_on_the_writting_pad() {
Assert.assertTrue(login.quote.isDisplayed());

    }
    @When("User is able to click  on the {string} icon")
    public void user_is_able_to_click_on_the_icon(String string) {
        login.addMention.click();
    }

        @When("User enters a mention")
    public void user_enters_a_mention() {
login.Mention.click();

    }

    @Then("User should see the mention on the writting pad")
    public void user_should_see_the_mention_on_the_writting_pad() {
Assert.assertTrue(login.addedMention.isDisplayed());

    }

    @When("user enters a message")
    public void user_enters_a_message() {

    login.messageBox.sendKeys("Peace for Ukraina!!!");



    }

    @When("User clicks on the send button")
    public void user_clicks_on_the_send_button() {

login.sendBtn.click();
    }

    @Then("User should see the message on Activity Stream page")
    public void user_should_see_the_message_on_Activity_Stream_page() {

        Assert.assertTrue(login.messageDsp.isDisplayed());

    }


}
