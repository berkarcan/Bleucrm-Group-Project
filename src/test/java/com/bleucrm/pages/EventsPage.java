package com.bleucrm.pages;

import com.bleucrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EventsPage extends BasePage{

    @FindBy(css = "#feed-cal-event-namecal_3Jcl")

    public WebElement eventNameBox;


    @FindBy(css = "html body[style='min-height: 104px;']")

    public WebElement messageBox;

    @FindBy(xpath = "(//iframe)[2]")

    public WebElement frame;

    @FindBy(id = "feed-cal-event-fromcal_3Jcl")

    public WebElement startDateBox;

    @FindBy(id = "feed_cal_event_from_timecal_3Jcl")

    public WebElement startTimeBox;

    @FindBy(id = "feed-cal-event-tocal_3Jcl")

    public WebElement endDateBox;

    @FindBy(id = "feed_cal_event_to_timecal_3Jcl")

    public WebElement endTimeBox;

    @FindBy(id = "event-remindercal_3Jcl")

    public WebElement reminderCheckBox;

    @FindBy(id = "event-locationcal_3Jcl")

    public WebElement locationDropDown;

    @FindBy(xpath = "//span[.='Specify time zone']")

    public WebElement timeZoneLink;

    @FindBy(id = "feed-event-dest-input")

    public WebElement attendeesBox;

    @FindBy(xpath = "//span[@id='feed-cal-additional-show']/span[.='More']")

    public WebElement moreDropDown;

    @FindBy(id = "blog-submit-button-save")

    public WebElement sendButton;

    @FindBy(id = "feed-event-dest-add-link")

    public WebElement memberLink;

    public void selectLocation(String location){

        locationDropDown.click();
        WebElement locationOption = Driver.get().findElement(By.xpath("//div[@id='popup-window-content-cal_3Jcl_loc_mr']/div/div[.='"+location+"']"));

        locationOption.click();
    }

    public void selectTimeZone(String tz){

        timeZoneLink.click();

        Select timeZone = new Select(Driver.get().findElement(By.id("feed-cal-tz-fromcal_3Jcl")));

        timeZone.selectByValue(tz);


    }

    public WebElement getParameter(String p1){

        WebElement parameter = Driver.get().findElement(By.xpath("//tbody//tr/td//label[.='"+p1+"']//..//..//td[2]"));

        return parameter;

    }















}
