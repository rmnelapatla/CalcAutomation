@Regression
  Feature:  Validate all Function
#    All number should use the step  - user the step User click on 4 number button
#    All operations  should use the step  - User click on "+" operation  button
#

  Background: Every test run independenty Open the brow
    Given  For Test Open "chrome" browser
#   And User enter url "https://nuix.github.io/SDET/senior-sdet/productionCalc/index.html"
    And User enter url "https://nuix.github.io/SDET/senior-sdet/stagingCalc/index.html"

    Scenario: Verify whe user add 2 number like 6,8 and value should equal 14
      Given User click on 6 number button
      And User click on "+" operation button
      And User click on 8 number button
      And User click on "=" operation button
      And Verify text should "14"
      And User Close the Session

    #Fail scenario  - in staging   user click on 5 the out come 6
      Scenario:  verify user select  number 5 and validate the value text box
        Given User click on 5 number button
        And Verify text should "5"
        And User Close the Session

    Scenario:  Validate if use click on Cancle button
      Given User click on 9 number button
      And User click on "/" operation button
      And User click on 3 number button
      Then User click on "c" operation button
      And Verify text should "0"
      And User Close the Session

    Scenario:  verify error message when user divided a number by zero
      Given User click on 2 number button
      And User click on "/" operation button
      And User click on 0 number button
      And User click on "=" operation button
      And Verify text should "Error"


    Scenario:  verify decimal value

      Given User click on 9 number button

      And User click on "*" operation button

      And User click on 3 number button

      And User click on "." operation button

      And User click on 0 number button

      And User click on "=" operation button

      And Verify text should "27.0"