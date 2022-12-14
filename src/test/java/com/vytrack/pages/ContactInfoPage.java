package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInfoPage extends BasePage {

    @FindBy(className = "user-name")
    public WebElement contactFullName;

    @FindBy(css="a.phone")
    public WebElement phone;

    @FindBy(css="a.email")
    public WebElement email;

    @FindBy(css="a.name")
    public WebElement name;

    @FindBy(css="a.name")
    public WebElement newLocator;

    @FindBy(css="a.name")
    public WebElement newLocator1;

    @FindBy(css="a.name")
    public WebElement newLocator2;
    @FindBy(css="a.name")
    public WebElement newLocator3;


}
