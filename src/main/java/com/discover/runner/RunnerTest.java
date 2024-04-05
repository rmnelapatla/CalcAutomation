package com.discover.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/main/resources/features/"},
        glue = {"com.discover.stepdef"},
        plugin = {})

public class RunnerTest extends AbstractTestNGCucumberTests {

}