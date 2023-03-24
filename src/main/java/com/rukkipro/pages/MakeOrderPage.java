package com.rukkipro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakeOrderPage extends BasePage{

    @FindBy(css = ".sc-kprGbJ.kgGjZN:nth-child(1)")
    WebElement myOrders;

    @FindBy(xpath = "//span[text()='Какая техника нужна?']")
    WebElement whatEquipmentNeeded;

    @FindBy(xpath = "//input[@xpath='1']")
    WebElement whatEquipmentNeeded1;

    @FindBy(xpath = "//span[text()='Адрес выполнения работы']")
    WebElement address;

    @FindBy(css = "input[value]:nth-child(2)")
    WebElement address1;

    @FindBy(css = ".sc-cQIpJi.dBxVXY")     // .sc-gmSHEY.kZVmvt -->was
    WebElement cityField;

    @FindBy(xpath = "//img[@src='https://dev.rukki.pro/assets/images/tipper.png']") //css .sc-eirfIE.ggcpXg:nth-child(4) -> samosval //
    WebElement samosval;

    @FindBy(xpath = "//span[text()='Указать дату и время']")
    WebElement timeAndDate;

    @FindBy(xpath = "//*[text()='Завтра']") //  css = ".pill.active"
    WebElement tomorrow;

    @FindBy(css = ".time.input-box") //[placeholder='Выберите время']
    WebElement time;

    @FindBy(xpath = "//div[contains(text(),'10')]")
    WebElement hour;

    @FindBy(css = ".ant-btn-primary.ant-btn-sm")
    WebElement okButton;

    @FindBy(css = ".bGTuPI.button")
    WebElement continueButton;

    public MakeOrderPage(WebDriver driver) {
        super(driver);

    }

    public MakeOrderPage clickOnNewOrderButton() {
        click(myOrders);
        return new MakeOrderPage(driver);
    }

    public MakeOrderPage fillWhatEquipmentNeededField() {
        click(whatEquipmentNeeded);
        pause(5000);
        click(samosval);
        //type(whatEquipmentNeeded1,"Самосвал");
        return this;
    }

    public MakeOrderPage fillAddressOfWorkExecution(String address2) {
        pause(2000);
        click(address);
        pause(2000);
        type(address1, address2);
        click(cityField);
        return this;
    }

    public MakeOrderPage fillTimeAndDate() {
        click(timeAndDate);
        pause(2000);
        click(tomorrow);
        pause(1000);
        click(time);
        click(hour);
        click(okButton);
        click(continueButton);
        return this;
    }
}
