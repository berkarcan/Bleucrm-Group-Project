package com.bleucrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage{

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement poll_tab;

    @FindBy (id = "user-name")
    public WebElement usernameText;



}
