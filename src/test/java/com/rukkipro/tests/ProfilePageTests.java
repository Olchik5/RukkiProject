package com.rukkipro.tests;

import com.rukkipro.data.UserData;
import com.rukkipro.pages.LoginPage;
import com.rukkipro.pages.ProfilePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePageTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        new LoginPage(driver).login(UserData.USER_PHONE).checkThePhoneNumber();
    }

    @Test
    public void becomeCustomerTest() {
    new ProfilePage(driver).clickOnProfile().clickOnIAmCustomer();
    }
}


