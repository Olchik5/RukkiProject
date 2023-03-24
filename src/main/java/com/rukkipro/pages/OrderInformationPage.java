package com.rukkipro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderInformationPage extends BasePage{

    @FindBy(xpath = "//button[text()='Сделать заказ']")
    WebElement makeOrderButton;

    @FindBy(css = ".cxYkjw:nth-child(2)")
    WebElement orderInformation;

    public OrderInformationPage(WebDriver driver) {
        super(driver);
    }

    public MakeOrderPage clickOnMakeOrderButton() {
        click(makeOrderButton);
        return new MakeOrderPage(driver);
    }

    public String getOrderInformationText() {
        return orderInformation.getText();
    }
}


// css .kRBfAw:nth-child(1) for Back Button