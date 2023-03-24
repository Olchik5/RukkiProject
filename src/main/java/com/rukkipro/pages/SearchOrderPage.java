package com.rukkipro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchOrderPage extends BasePage{

    @FindBy(xpath = "//div[@id='root']/div[1]/nav[1]/div[1]/div[2]/div[3]")   //css .gRyXZD:nth-child(3)
    WebElement messages;

    public SearchOrderPage(WebDriver driver) {
        super(driver);

    }

    public String getText() {
        return messages.getText();

    }
}