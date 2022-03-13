package com.bleucrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {
    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement poll_tab;

    @FindBy(id = "user-name")
    public WebElement usernameText;

    @FindBy(xpath = "//*[@id=\"bx_left_menu_menu_about_sect\"]/a")
    public WebElement company_tab;
}

