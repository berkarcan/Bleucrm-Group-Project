package com.bleucrm.pages;

import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CompanyPage extends BasePage {
    public CompanyPage(){
        PageFactory.initElements(Driver.get(), this);}

    @FindBy(className = "webform-small-button-text")
   public  WebElement addNewsButton;

    @FindBy(xpath = "//*[@id=\"tr_PROPERTY_3\"]/td[2]/select")
   public WebElement selectDropdown;

    @FindBy(id = "tab_cont_cedit2")
   public WebElement detailsTab;

    @FindBy(xpath = "//*[@id=\"tr_PREVIEW_TEXT_EDITOR\"]/td/div[1]/span[1]")
    public WebElement txtRadiobtn;
    @FindBy(xpath = "//*[@id=\"tr_PREVIEW_TEXT_EDITOR\"]/td/div[1]/span[2]")
    public WebElement htmlRadiobtn;
    @FindBy(xpath = "//*[@id=\"tr_PREVIEW_TEXT_EDITOR\"]/td/div[1]/span[3]")
    public WebElement visualEditorRadiobtn;

    @FindBy(name = "NAME")
    public WebElement nameInput;

    @FindBy(xpath = "//*[@id=\"save_and_add\"]")
    public WebElement saveAndAdd;
    @FindBy(id = "bxed_PREVIEW_TEXT")
    public WebElement txtBox;


    public void addNews(){
        addNewsButton.click();

    }
    public void selectOption(String option) {

        Select optionDropdown = new Select(selectDropdown);
        optionDropdown.selectByVisibleText(option);
        String expectedOption = option;
        String actualOption = optionDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption);
    }

    public void AddNews(){
        BrowserUtils.waitFor(2.0);
        nameInput.sendKeys("Title");
        BrowserUtils.waitFor(2.0);
        txtBox.sendKeys("Text to add");
        BrowserUtils.waitFor(2.0);
        saveAndAdd.click();
        BrowserUtils.waitFor(2.0);
        BrowserUtils.waitFor(2.0);
        Assert.assertEquals("","");

    }







}




