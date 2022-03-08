package com.bleucrm.step_definitions;

import com.bleucrm.pages.DashBoardPage;
import com.bleucrm.pages.PollPage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PollStepDefs {
    PollPage pollPage = new PollPage();


    @When("user clicks on poll tab")
    public void userClicksOnPollTab() {
        new DashBoardPage().poll_tab.click();
    }

    @When("user click on destination input box and clicks Employees and Departments")
    public void userClickOnDestinationInputBoxAndClicksEmployeesAndDepartments() {
        pollPage.destinationInputBox.click();


    }

    @When("user clicks {string} and clicks Employees and Departments")
    public void userClicksAddMoreAndClicksEmployeesAndDepartments(String Addmore) {
        Driver.get().findElement(By.linkText(Addmore)).click();
        pollPage.EmployeesDepartmentsTab.click();

    }


    @And("user can click to add {int} departments and {int} employees randomly")
    public void userCanClickToAddDepartmentsAndEmployeesRandomly(int dep_num, int employee_num) {
        List<WebElement> dep_list = new ArrayList<>();

        for (WebElement webElement : pollPage.departments) {
            if (!webElement.getText().contains("Cyber Vet")) {
                dep_list.add(webElement);
            }
        }
        System.out.println(BrowserUtils.getElementsText(dep_list));

        for (int i = 0; i < dep_num; i++) {
            int RandomIndex = new Random().nextInt(dep_list.size());
            dep_list.get(RandomIndex).click();
            BrowserUtils.waitForClickablility(pollPage.department_check.get(RandomIndex), 5);
            pollPage.department_check.get(RandomIndex).click();
        }
        for (int i = 0; i < employee_num; i++) {
            int RandomIndex = new Random().nextInt(pollPage.employees.size());
            pollPage.employees.get(RandomIndex).click();
        }

    }

    @When("user clicks on link icon")
    public void userClicksOnLinkIcon() {
        pollPage.linkIcon.click();
    }


    @Then("user can save text {string} or link {string}")
    public void userCanSaveTextAndorLink(String text, String link) {
        if (!text.isEmpty()) {
            pollPage.textBox.sendKeys(text);
        }
        if(!link.isEmpty()){
            pollPage.linkBox.sendKeys(link);
        }
        pollPage.saveButton.click();
    }
}
