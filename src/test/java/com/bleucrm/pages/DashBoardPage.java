package com.bleucrm.pages;

import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {
    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement poll_tab;

    @FindBy(id = "user-name")
    public WebElement usernameText;

    @FindBy(xpath = "//*[@id=\"bx_left_menu_menu_about_sect\"]/a")
    public WebElement company_tab;


    public void moveToTab(String tabName){

        WebElement tab = Driver.get().findElement(By.xpath("//div[@id='feed-add-post-form-tab']//span[.='"+tabName+"']"));

        tab.click();

        BrowserUtils.waitFor(1);

    }
}

