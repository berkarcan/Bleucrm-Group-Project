package com.bleucrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PollPage extends BasePage {

    @FindBy(id="feed-add-post-destination-input-box")
    public WebElement destinationInputBox;

    @FindBy(css="a[id^='destDepartmentTab_destination']")  //xpath = "//*[starts-with(@id,'destDepartmentTab_destination')]"
    public WebElement EmployeesDepartmentsTab;

    @FindBy(className = "bx-finder-company-department-inner")
    public List<WebElement> departments;
    @FindBy(className = "bx-finder-company-department-check-arrow")
    public List<WebElement> department_check;
    @FindBy(className = "bx-finder-company-department-employee-name")
    public List<WebElement> employees;

    @FindBy (xpath= "//*[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement linkIcon;
    @FindBy(id="linkidPostFormLHE_blogPostForm-text")
     public WebElement textBox;
    @FindBy (id="linkidPostFormLHE_blogPostForm-href")
    public  WebElement linkBox;
    @FindBy(css="input#undefined")
    public WebElement saveButton;




}

