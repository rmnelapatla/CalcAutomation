package com.discover.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

import static com.discover.stepdef.CalculatorStep.driver;

@CucumberOptions(tags = "", features = {"src/main/resources/features/"},
        glue = {"com.discover.stepdef"},
        plugin = {})

public class RunnerTest extends AbstractTestNGCucumberTests {



}