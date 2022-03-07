package com.bleucrm.pages;

import com.bleucrm.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }
}
