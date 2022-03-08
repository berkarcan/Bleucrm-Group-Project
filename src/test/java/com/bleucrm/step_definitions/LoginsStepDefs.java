package com.bleucrm.step_definitions;

import com.bleucrm.pages.DashBoardPage;
import com.bleucrm.pages.LoginPage;
import com.bleucrm.utilities.ConfigurationReader;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import static com.bleucrm.utilities.BrowserUtils.waitForVisibility;

public class LoginsStepDefs {
    LoginPage loginPage=new LoginPage();
    DashBoardPage dashBoardPage=new DashBoardPage();

    @When("the user logins with a valid username and password")
    public void theUserLoginsWithAValidUsernameAndPassword() {

        loginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
    }

    @Then("the user should be able to reach the dashboard page: {string}")
    public void theUserShouldBeAbleToReachTheDashboardPage(String urlLogin) {
        Assert.assertEquals(urlLogin, Driver.get().getCurrentUrl());
    }


}
