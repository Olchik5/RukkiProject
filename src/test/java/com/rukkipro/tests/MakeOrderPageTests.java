package com.rukkipro.tests;

import com.rukkipro.data.OrderData;
import com.rukkipro.data.UserData;
import com.rukkipro.pages.LoginPage;
import com.rukkipro.pages.MakeOrderPage;
import com.rukkipro.pages.OrderInformationPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class MakeOrderPageTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        new LoginPage(driver).login(UserData.USER_PHONE).checkThePhoneNumber();
    }

    @Test
    public void makeOrderTest() {
        new MakeOrderPage(driver)
                 .fillWhatEquipmentNeededField()
                .fillAddressOfWorkExecution(OrderData.ADDRESS)
                .fillTimeAndDate();
        new OrderInformationPage(driver).clickOnMakeOrderButton();
        Assert.assertTrue(new OrderInformationPage(driver).getOrderInformationText().contains(OrderData.ORDER_INFORMATION));

    }
}


//clickOnNewOrderButton()