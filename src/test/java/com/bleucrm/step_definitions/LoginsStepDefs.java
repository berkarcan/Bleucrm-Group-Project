package com.bleucrm.step_definitions;

import com.bleucrm.pages.DashBoardPage;
import com.bleucrm.pages.LoginPage;
import com.bleucrm.utilities.ConfigurationReader;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import static com.bleucrm.utilities.BrowserUtils.waitForVisibility;

public class LoginsStepDefs {
    LoginPage loginPage=new LoginPage();
    DashBoardPage dashBoardPage=new DashBoardPage();

    @When("the user logins with a valid username and password")
    public void the_User_Logins_With_AValid_Username_And_Password() {

        loginPage.login(ConfigurationReader.get("username"), ConfigurationReader.get("password"));
    }

    @Then("the user should be able to reach the dashboard page: {string}")
    public void the_User_Should_Be_Able_To_Reach_The_Dashboard_Page(String urlLogin) {
        Assert.assertEquals(urlLogin, Driver.get().getCurrentUrl());
    }
}
