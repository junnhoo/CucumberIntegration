package com.jango.stepdef;

import com.jango.BaseTest;
import com.jango.page.HomePage;
import io.cucumber.java.en.Then;

public class HomeStepdef extends BaseTest {

    HomePage homePage;
    @Then("user is on homepage")
    public void userIsOnHomePage() {
        HomePage homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }
}
