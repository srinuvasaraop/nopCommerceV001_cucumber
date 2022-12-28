#Feature: Login
#
#  Scenario: Successfull login with valid credentials
#    Given User Launch Chrome browser
#    When User Opens URL "https://admin-demo.nopcommerce.com/login"
#    And User Enters Email as "admin@yourstore.com" and password as "admin"
#    And Click on Login
#    Then Page Title should be "Dashboard / nopCommerce administration"
#    When user click on Logout link
#    Then Page Title should be "Your store. Login"
#    And Close browser
#
#  Scenario Outline:Login data Driven
#    Given User Launch Chrome browser
#    When User Opens URL "https://admin-demo.nopcommerce.com/login"
#    And User Enters Email as "<email>" and password as "<password>"
#    And Click on Login
#    Then Page Title should be "Dashboard / nopCommerce administration"
#    When user click on Logout link
#    Then Page Title should be "Your store. Login"
#    And Close browser
#    Examples:
#      | email                 | password |
#      | admin@yourstore.com   | admin    |
#      | invalid@yourstore.com | admin    |