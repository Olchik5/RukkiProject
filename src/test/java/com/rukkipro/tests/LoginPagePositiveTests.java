package com.rukkipro.tests;

import com.rukkipro.data.ConfirmationData;
import com.rukkipro.data.UserData;
import com.rukkipro.pages.LoginPage;
import com.rukkipro.pages.SearchOrderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPagePositiveTests extends TestBase {

    @Test
    public void openLoginPageTest() {
    }

    @Test
    public void loginPositiveTest(){
    new LoginPage(driver).login(UserData.USER_PHONE).checkThePhoneNumber();
    Assert.assertTrue(new SearchOrderPage(driver).getText().contains(ConfirmationData.MESSAGE_LINK));

    }
}


