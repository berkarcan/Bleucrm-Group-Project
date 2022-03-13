package com.bleucrm.step_definitions;

import com.bleucrm.pages.CompanyPage;
import com.bleucrm.pages.DashBoardPage;
import com.bleucrm.pages.LoginPage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.ConfigurationReader;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AddNewsStepDefs {
    LoginPage LoginPage = new LoginPage();
    CompanyPage CompanyPage = new CompanyPage();
    DashBoardPage DashBoardPage = new DashBoardPage();

    @Given("the user is on the company page")
    public void the_user_is_on_the_company_page() {
        LoginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));

         DashBoardPage.company_tab.click();

    }

    @When("the user enters the add news page")
    public void the_user_enters_the_add_news_page() {
        CompanyPage.addNews();
        BrowserUtils.waitFor(2.0);

    }

    @Then("User should be able to select the type of information under preview text")
    public void user_should_be_able_to_select_the_type_of_information_under_preview_text() {
        CompanyPage.selectOption("General info");
    }

    @When("select Details tab")
    public void select_Details_tab() {
        CompanyPage.detailsTab.click();
        BrowserUtils.waitFor(2.0);

    }

        @Then("User should be able to select Text, HTML, and Visual Editor")
        public void user_should_be_able_to_select_Text_HTML_and_Visual_Editor () {
            BrowserUtils.waitFor(2.0);
        CompanyPage.visualEditorRadiobtn.click();
        BrowserUtils.waitFor(2.0);
            Assert.assertFalse(CompanyPage.txtRadiobtn.isSelected());
            Assert.assertFalse(CompanyPage.htmlRadiobtn.isSelected());


        }

    @Then("User should be able to send news")
    public void userShouldBeAbleToSendNews() {
        CompanyPage.AddNews();



    }
}

