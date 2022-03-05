package com.bleucrm.step_definitions;

import com.bleucrm.pages.LoginPage;
import com.bleucrm.utilities.ConfigurationReader;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginStepDefs {
    @Given("HR User is on the login page")
    public void hr_User_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Then("Hr enters the login credentials correctly")
    public void hr_enters_the_login_credentials_correctly() {
        String username=ConfigurationReader.get("username");
        String password=ConfigurationReader.get("password");

        LoginPage loginPage=new LoginPage();
        loginPage.userloginBox.sendKeys(username);
        loginPage.passwordBox.sendKeys(password);
        loginPage.submit.click();
    }

    @Then("HR is logged in succesfully")
    public void hr_is_logged_in_succesfully() {
        Assert.assertTrue(Driver.get().getTitle().contains("Portal"));


    }

    @When("HR clicks {string} functionality")
    public void hr_clicks_functionality(String string) throws InterruptedException {
        LoginPage loginPage=new LoginPage();
        loginPage.filterSearch.click();


    }
    @Given("user is able to enter {string} functionality")
    public void user_is_able_to_enter_functionality(String string) {
        LoginPage loginPage=new LoginPage();
        loginPage.filterSearch.click();
Assert.assertTrue(loginPage.filterSearch.isDisplayed());
    }
    @Given("User clicks {string} button")
    public void user_clicks_button(String addField) {
        LoginPage loginPage=new LoginPage();
        loginPage.addField.click();

    }

    @Given("new fields are displayed with checkboxes")
    public void new_fields_are_displayed_with_checkboxes() {
        LoginPage loginPage=new LoginPage();
        System.out.println(loginPage.fields.getText());
    }

    @Then("user selects fields")
    public void user_selects_fields() throws InterruptedException {
        LoginPage loginPage=new LoginPage();
        List<WebElement> checkboxes=Driver.get().findElements(By.cssSelector("div[class='main-ui-select-inner-label']"));
        for (WebElement checkboox: checkboxes){
            Thread.sleep(3000);
            if (!checkboox.isSelected()){
              checkboox.click();
            }
        }

    }

    @When("fields are added to the page")
    public void fields_are_added_to_the_page() {
       WebElement filterPage=Driver.get().findElement(By.cssSelector("div[class='main-ui-select-inner-label']"));
        System.out.println(filterPage.getText());
    }

    @Then("user should be able to remove fields")
    public void user_should_be_able_to_remove_fields() throws InterruptedException {
        LoginPage loginPage=new LoginPage();
        List<WebElement> checkboxes=Driver.get().findElements(By.cssSelector("div[class='main-ui-select-inner-label']"));
        for (WebElement checkboox: checkboxes){
            Thread.sleep(2000);
            if (checkboox.isSelected()){
                checkboox.click();
            }
        }

    }
    @When("user clicks save filter")
    public void user_clicks_save_filter() {
        Driver.get().findElement(By.cssSelector("span[class='main-ui-filter-add-item']")).click();

    }

    @When("enters filter name on the box")
    public void enters_filter_name_on_the_box() {
      WebElement filterBox= Driver.get().findElement(By.cssSelector("input[class='main-ui-filter-sidebar-edit-control']"));
        System.out.println(filterBox.getText());
       filterBox.sendKeys("NewFilter");
    }

    @Then("clicks to {string} button")
    public void clicks_to_button(String saveBtn) {
        Driver.get().findElement(By.cssSelector("span[class='ui-btn ui-btn-success main-ui-filter-field-button main-ui-filter-save']")).click();
    }

    @When("{string} are visible on the left side")
    public void are_visible_on_the_left_side(String string) {
        System.out.println(Driver.get().findElement(By.cssSelector("div[class='main-ui-filter-sidebar']")).getText());

    }

    @When("new filter is added")
    public void new_filter_is_added() {
        System.out.println(Driver.get().findElement(By.cssSelector("div[class='main-ui-filter-sidebar']")).getText());

    }
    //
   @When("button is clickible and user clicks {string} button")
public void button_is_clickible_and_user_clicks_button(String string) {

        Driver.get().findElement(By.cssSelector("span[class='main-ui-filter-field-restore-items']")).click();
   }


    @Then("fields are restored on the page")
    public void fields_are_restored_on_the_page() {
        System.out.println(Driver.get().findElement(By.cssSelector("div[class='main-ui-filter-field-container']")).getText());

    }




}
