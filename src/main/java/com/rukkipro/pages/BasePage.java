package com.rukkipro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver;

    public BasePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void click(WebElement element) {
        element.click();
    }

    public void type(WebElement element, String text) {
        if (text != null) {
            element.click();
            element.clear();
            element.sendKeys(text);
        }
    }

    public void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
