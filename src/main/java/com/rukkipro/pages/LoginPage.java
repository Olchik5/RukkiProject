package com.rukkipro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy (xpath = "//input[@autocomplete=\"tel\"]")
    WebElement phone1;

    @FindBy(id = "recaptcha-container")
    WebElement enter;

    @FindBy(css = "input:nth-child(1)")
    WebElement codeFromSMS1;

    @FindBy(css = "input:nth-child(2)")
    WebElement codeFromSMS2;

    @FindBy(css = "input:nth-child(3)")
    WebElement codeFromSMS3;

    @FindBy(css = "input:nth-child(4)")
    WebElement codeFromSMS4;

    @FindBy(css = "input:nth-child(5)")
    WebElement codeFromSMS5;

    @FindBy(css = "input:nth-child(6)")
    WebElement codeFromSMS6;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage login(String phone) {
        type(phone1, phone);
        click(enter);
        pause(5000);
       return this;
    }

    public LoginPage checkThePhoneNumber() {
        type(codeFromSMS1,"1");
        type(codeFromSMS2,"2");
        type(codeFromSMS3,"3");
        type(codeFromSMS4,"1");
        type(codeFromSMS5,"2");
        type(codeFromSMS6,"3");
        return this;
    }
}
