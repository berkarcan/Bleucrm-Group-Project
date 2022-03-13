package com.bleucrm.pages;

import com.bleucrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickNavigateMenuPage extends BasePage{


    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement taskBtn;

    @FindBy(id = "tasks-task-priority-cb")
    public WebElement highPriorityCheckBox;

    @FindBy(id = "lhe_button_editor_task-form-lifefeed_task_form")
    public WebElement visualEditorBtn;

    @FindBy(xpath = "(//div[@class='feed-add-post-text'])[3]")
    public WebElement textEditorBarOnTop;//bx-html-editor-tlbr-lifefeed_task_form

    @FindBy(xpath = "(//*[@id='post-buttons-bottom']/span[5])[2]")
    public WebElement checkListBtn;

    @FindBy(xpath = "//*[@id='bx-component-scope-lifefeed_task_form-checklist']/div[3]/span/span/input")
    public WebElement CheckListInputText;

    @FindBy(xpath = "//div[@class='task-checklist-actions']/span[1]")
    public WebElement CheckListAddBtn;

    @FindBy(xpath = "//span[starts-with(@class, 'js-id-checklist-is-form-submit')]")
    public WebElement CheckListCheckMark;

    @FindBy(xpath = "(//div[starts-with(@class, 'js-id-checklist-is-i-drag-handle')])[4]")
    public WebElement separatorLine;

    @FindBy(xpath = "//div[@class='task-checklist-actions']/span[2]")
    public WebElement CheckListSeparatorBtn;

    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy(xpath = "//*[@id='bx-component-scope-lifefeed_task_form']/div/div[1]/div[1]/div[1]/label")
    public WebElement highPriorityText;

    @FindBy(css = ".task-checklist-title")
    public WebElement checkListText;

    @FindBy(css = "(//input[starts-with(@id, 'chl_item_')])[1]")
    public WebElement verifyAddCheckList;

    public WebElement setVerifyAddCheckList(WebElement verifyAddCheckList) {
        for (int i = 1; i <= 3; i++) {

            String rowChechBoxLocator = "(//input[starts-with(@id, 'chl_item_')])["+i+"]";
            verifyAddCheckList = Driver.get().findElement(By.xpath(rowChechBoxLocator));
        }
        return verifyAddCheckList;
    }
}




