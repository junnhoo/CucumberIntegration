package com.jango.stepdef;

import com.jango.BaseTest;
import org.junit.After;
import org.junit.Before;


public class CucumberHooks extends BaseTest {

    @Before
    public void beforeTest() {
        getDriver();
    }

    @After
    public void afterTest() {
        driver.close();
    }
}
