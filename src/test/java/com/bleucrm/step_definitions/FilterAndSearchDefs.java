package com.bleucrm.step_definitions;

import com.bleucrm.pages.BasePage;
import com.bleucrm.pages.FilterPage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FilterAndSearchDefs extends BasePage {

    FilterPage filterPage=new FilterPage();

    @And("the user clicks on the filterAndSearch button")
    public void the_user_clicks_on_the_filterAndSearch_button() {

        filterPage.filterAndSearch.click();
    }

    @Then("the user should see defaults filters on the search page")
    public void the_user_should_see_defaults_filters_on_the_search_page(List<String> filters) {

        List<String> actualFilters = BrowserUtils.getElementsText(filterPage.filters);

        Assert.assertEquals(filters,actualFilters);
        System.out.println("expectedFilters = " + filters);
        System.out.println("actualFilters = " + actualFilters);
    }

    @And("the user clicks on the {string} button and remove {string} field")
    public void the_user_clicks_on_the_button_and_remove_field(String addField, List<WebElement> removeFilters) {
        filterPage.addFieldButton.click();
        for (WebElement fields:removeFilters) {
            WebElement button= (WebElement) removeFilters;
            if (button.isSelected()){
                button.click();
            }
            Assert.assertFalse("verify field is not selected", button.isSelected());
        }

    }

    @And("the user clicks on the {string} button and add {string} field")
    public void the_user_clicks_on_the_button_and_add_field(String addField, List<WebElement> addfields) {
        filterPage.addFieldButton.click();

        for (WebElement fields:addfields) {
            WebElement button= (WebElement) addfields;
            if (!button.isSelected()){
                button.click();
            }
            Assert.assertTrue("verify field is selected", button.isSelected());
        }

    }


    @Then("the user should see the fields are selected")
    public void the_user_should_see_the_fields_are_selected(List<WebElement> fields) {

        filterPage.addFieldButton.click();

        for (WebElement field :fields) {
            if (!((WebElement) fields).isSelected()){
                ((WebElement) fields).click();
            }
            Assert.assertTrue("verify field is selected", field.isSelected());
        }

        List<String> actualFields = BrowserUtils.getElementsText(filterPage.selectedFields);
        List<String> expectedFields= BrowserUtils.getElementsText(fields);

        Assert.assertEquals(expectedFields,actualFields);
        System.out.println("expectedFields = " + fields);
        System.out.println("actualFields = " + actualFields);
    }

    @Then("the user click on {string} button and see default {string} on the search page")
    public void the_user_click_on_button_and_see_default_on_the_search_page(String defaultFieldsButton, List<WebElement> defaultFields) {

        filterPage.addFieldButton.click();

        List<WebElement> fields=Driver.get().findElements(By.xpath("//*[@class='main-ui-select-inner-label']"));

        for (WebElement field:fields) {
            if (!(field.isSelected())){
                field.click();
            }
        }
        filterPage.defaultFieldsButton.click();

        Assert.assertEquals(defaultFields,fields);
    }

    @And("the user clicks on {string} button and removes filters")
    public void the_user_clicks_on_button_and_removes_filters(String configureButton) {

        filterPage.configureButton.click();

        for (int i = 0; i < (filterPage.removeFilter.size()-2); i++) {
            WebElement del= (WebElement) filterPage.removeFilter;
             del.click();
        }

    }

    @Then("the user resets buttons and see default {string} on the search page")
    public void the_user_resets_buttons_and_see_default_on_the_search_page(List<String> filters) {
        filterPage.configureButton.click();

        for (int i = 0; i < (filterPage.removeFilter.size()-2); i++) {
            WebElement del= (WebElement) filterPage.removeFilter;
            del.click();
        }

        filterPage.resetToDefault.click();
        BrowserUtils.waitFor(1.0);
        filterPage.continueButton.click();

        List<String> actualFilters = BrowserUtils.getElementsText(filterPage.filters);

        Assert.assertEquals(filters,actualFilters);
        System.out.println("expectedFilters = " + filters);
        System.out.println("actualFilters = " + actualFilters);


    }

}

