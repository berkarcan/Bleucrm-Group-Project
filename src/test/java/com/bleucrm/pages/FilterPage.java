package com.bleucrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilterPage extends BasePage {

    @FindBy(xpath = "//*[(@id='LIVEFEED_search')]")
    public WebElement filterAndSearch;

    @FindBy(xpath = "//*[@class='main-ui-filter-sidebar-item-text']")
    public List<WebElement> filters;

    //@FindBy(xpath = "//*[.='Favorites']")
    //public WebElement favoritesFilter;

    //@FindBy(xpath = "//*[.='My Activity']")
    //public WebElement myActivityFilter;

    //@FindBy(xpath = "(//*[.='Announcements'])[2]")
    //public WebElement announceFilter;

    //@FindBy(xpath = "(//*[.='Workflows'])[3]")
    //public WebElement workFlowFilter;

    @FindBy(xpath = "//*[text()='Add field']")
    public WebElement addFieldButton;

    @FindBy(xpath = "//*[@class='main-ui-select-inner-label']")
    public List<WebElement> fields;

    @FindBy(xpath = "//*[@class='main-ui-control-field-label']")
    public List<WebElement> selectedFields;

    @FindBy(xpath = "//*[text()='Restore default fields']")
    public WebElement defaultFieldsButton;

    @FindBy(xpath = "//*[@class='main-ui-control-field-label']")
    public List<WebElement> defaultFieldTitle;

    @FindBy(xpath = "//*[@class='main-ui-filter-add-edit']")
    public WebElement configureButton;

    @FindBy(xpath = "//*[@title='Delete filter']")
    public List<WebElement> removeFilter;

    @FindBy(xpath = "//*[text()='Reset to default']")
    public WebElement resetToDefault;

    @FindBy(xpath = "//*[@class='popup-window-button']")
    public WebElement continueButton;



}
