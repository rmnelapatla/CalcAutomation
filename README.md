# CalcAutomation
A sample project 

All options coverd  with  standard template implementation

-> All number should use the step  - User click on 4 number button
 
 -> All operations should use the step  - User click on "+" operation  button
  
  -> Ouput Validation done automatically with wrapper class.  Value should send in string format

 Feature:  Validate all Function
    Background: Every test run independenty Open the brow
    Given  For Test Open "chrome" browser
  And User enter url "https://nuix.github.io/SDET/senior-sdet/productionCalc/index.html"
  
  And User enter url "https://nuix.github.io/SDET/senior-sdet/stagingCalc/index.html"
  
  Scenario:  Validate if use click on Cancle button
   
   	Given User click on 4 number button
	
	And User click on "/" operation button
 
    And User click on 2 number button
	
    And User click on "=" operation button
	
    Then User click on "c" operation button
	
    And Verify text should "2"
	
    And Verify text should "0.987"


# Find the bug in staging with below combination data

Background: Every test run independenty Open the brow
    Given  For Test Open "chrome" browser

    And User enter url "https://nuix.github.io/SDET/senior-sdet/stagingCalc/index.html"
    Scenario:  Validate if use click on Cancle button
    
      Given User click on 9 number button
      
      And User click on "*" operation button
      
      And User click on 3 number button
      
      And User click on "." operation button
      
      And User click on 0 number button
      
      And User click on "=" operation button

      And Verify text should "27"

