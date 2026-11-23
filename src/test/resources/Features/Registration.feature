Feature: Registration
  Scenario: User registration to Ndosi website
    Given I am on home page
    And I click login button
    And I click on the Sign Up Here hyperlink
    And I enter first Name <firstName>
    And I enter Last Name <lastName>
    And I enter Email <email>
    And I enter password <password>
    And I enter confirm password <confirmPassword>
    And Click on dropdown to select group
    When I click Create Account button
    Then I should see Registration submitted successfully popup screen


#Feature: Login
#  Scenario Outline: Login to Ndosi website
#    Given I am on home page
#    And I click login button
#    And I enter username <username>
#    And I enter password <password>
#    When I click submit button
#    Then I should be logged in successfully
#    Examples:
#      | username | password |
#      | admin@gmail.com | @12345678 |
