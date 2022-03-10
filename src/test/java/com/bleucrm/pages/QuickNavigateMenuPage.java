package com.bleucrm.pages;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickNavigateMenuPage extends BasePage{


    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement taskBtn;

    @FindBy(id = "tasks-task-priority-cb")
    public WebElement highPriorityCheckBox;

    @FindBy(id = "lhe_button_editor_task-form-lifefeed_task_form")
    public WebElement visualEditorBtn;

    @FindBy(id = "bx-html-editor-tlbr-lifefeed_task_form")
    public WebElement textEditorBar;

    @FindBy(xpath = "(//*[@id='post-buttons-bottom']/span[5])[2]")
    public WebElement checkListBtn;

    @FindBy(xpath = "(//input[@class='js-id-checklist-is-form-title task-checklist-field-add']")
    public WebElement CheckListInputText;

    @FindBy(xpath = "//div[@class='task-checklist-actions']/span[1]")
    public WebElement CheckListAddBtn;

    @FindBy(xpath = "//span[starts-with(@class, 'js-id-checklist-is-form-submit')]")
    public WebElement CheckListCheckMark;

    @FindBy(xpath = "(//div[starts-with(@class, 'js-id-checklist-is-i-drag-handle')])[2]")
    public WebElement separatorLine;

    @FindBy(xpath = "//div[@class='task-checklist-actions']/span[2]")
    public WebElement CheckListSeparatorBtn;

    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy(xpath = "//*[@id='bx-component-scope-lifefeed_task_form']/div/div[1]/div[1]/div[1]/label")
    public WebElement highPriorityText;

    @FindBy(css = ".task-checklist-title")
    public WebElement checkListText;


    }




