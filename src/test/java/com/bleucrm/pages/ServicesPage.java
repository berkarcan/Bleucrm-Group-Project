package com.bleucrm.pages;

import com.bleucrm.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage {

    public ServicesPage(){
        PageFactory.initElements(Driver.get(), this);}

    @FindBy (xpath = "//*[@id=\"bx_left_menu_menu_services_sect\"]/a/span")
    public WebElement Services;
    @FindBy(xpath = "//*[@id=\"top_menu_id_services_311090337\"]/a/span[2]/span[2]")
    public WebElement Ideas;
    @FindBy(className = "bx-context-button-text")
    public WebElement newIdea;
    @FindBy(xpath = "//*[@id=\"workarea-content\"]/div/div/div[2]/div[4]/div/div/div[1]/a")
    public WebElement dateAdded;
    @FindBy(xpath = "//*[@id=\"workarea-content\"]/div/div/div[2]/div[4]/div/div/div[2]/a")
    public WebElement rating;
    @FindBy(id = "POST_TITLE")
    public WebElement writeIdea;
    @FindBy(className = "idea-add-button")
    public WebElement submitNewIdea;

    @FindBy (id = "bx-ilike-button-BLOG_POST_423-1646842378")
    public WebElement visible;
    @FindBy (xpath= "//*[@data-reaction='like']")
    public WebElement like;
    @FindBy (xpath = "//*[@id=\"workarea-content\"]/div/div/div[1]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[3]/a/span[3]")
    public WebElement newCategory;
    public WebElement NAME;
    public WebElement savebtn;
    @FindBy (xpath = "//*[@id=\"top_menu_id_services_165471732\"]/a/span[2]/span[2]")
    public WebElement Lists;
    @FindBy (xpath = "//*[@id=\"copyright\"]/span[2]")
    public WebElement print;
    @FindBy (className = "bx-editor-iframe")
    public WebElement description;
    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement ideaTextBox;






}
