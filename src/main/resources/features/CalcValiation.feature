@Regression
  Feature:  Validate all Function
#    All number should use the step  - user the step User click on 4 number button
#    All operations  should use the step  - User click on "+" operation  button
#

  Background: Every test run independenty Open the brow
    Given  For Test Open "chrome" browser
#    And User enter url "https://nuix.github.io/SDET/senior-sdet/productionCalc/index.html"
    And User enter url "https://nuix.github.io/SDET/senior-sdet/stagingCalc/index.html"
    Scenario:  Validate if use click on Cancle button
      Given User click on 2 number button
      And User click on "/" operation button
      And User click on 0 number button
      And User click on "=" operation button
#      Then User click on "c" operation button
#      And Verify text should "1"
      And Verify text should "Error"
#      And Verify text should "0.987"
