package com.rukkipro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {

    @FindBy(css = ".ant-dropdown-trigger.name")
    WebElement name;

    @FindBy(xpath = "//span[text()='Мой профиль']")
    WebElement myProfile;

    @FindBy(css = ".btn.active")
    WebElement customer;

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public ProfilePage clickOnProfile() {
        click(name);
        click(myProfile);
        return new ProfilePage(driver);
    }

    public ProfilePage clickOnIAmCustomer() {
        click(customer);
        return this;
    }
}
