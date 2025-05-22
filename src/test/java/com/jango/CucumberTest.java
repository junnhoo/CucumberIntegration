package com.jango;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.jango"},
        features = {"src/test/resources"},
        plugin = {"pretty", "html:reports/cucumber.html", "json:report/cucumber/json"}
)
public class CucumberTest {
}
