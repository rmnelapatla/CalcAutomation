package com.discover.stepdef;

import com.discover.Page.CalcPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class CalculatorStep {

    public static WebDriver driver;
    WebDriverWait webDriverWait;
    CalcPage calcPage;

    @Given("For Test Open {string} browser")
    public void forTestOpenBrowser(String BrowserName) {
        if (BrowserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            calcPage = new CalcPage(driver);

        }
    }

    @And("User enter url {string}")
    public void userEnterUrl(String url) {
        driver.get(url);
        webDriverWait = new WebDriverWait(driver, Duration.ofMinutes(30));
    }

    @Given("User click on {int} number button")
    public void userClickOnButton(int value) {
        calcPage.getNumberElement(value).click();

    }

    @And("User click on {string} operation button")
    public void userClickOnOperationButton(String operator) {
        calcPage.getOpertorElement(operator).click();
    }

//    @And("Verify text should {int}")
//    public void verifyTextShould(int Expected ) {
//        boolean valuematch =calcPage.validateOutPut(Expected);
//        Assert.assertTrue(calcPage.validateOutPut(Expected), "Expect value not matched");
//
//    }


    @And("Verify text should {string}")
    public void verifyTextShould( String Expected ) {

        if (Expected.contains(".")) {
            double actualvalue = Double.parseDouble(calcPage.validateOutPut().getText());
            Assert.assertEquals(actualvalue, Double.parseDouble(Expected), Double.parseDouble(Expected) + " Expected value not matched with Actual value" + actualvalue);
        }else if (Expected.contains("Error")){
            String actualvalue = calcPage.validateOutPut().getText();
            Assert.assertTrue(Expected.equalsIgnoreCase(actualvalue), Expected + " Expected value not matched with Actual value" + actualvalue);
        }else{
            int actualvalue =Integer.parseInt(calcPage.validateOutPut().getText());
            Assert.assertEquals(actualvalue, Integer.parseInt(Expected), Integer.parseInt(Expected) + " Expected value not matched with Actual value " + actualvalue);

        }
    }



    @And("User Close the Session")
    public void userCloseTheSession() {
        driver.close();
        driver.quit();
    }
}
