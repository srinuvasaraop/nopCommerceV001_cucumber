Feature: Customers

  Background: Below are the common steps for every scenario
    Given User Launch Chrome browser
    When User Opens URL "https://admin-demo.nopcommerce.com/login"
    And User Enters Email as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then User can view Dashboard
    When User click on customers menu
    And User click on customers Menu Item

  Scenario: Add a new Customer
    And click on Add new button
    Then User can view Add new customer page
    When User enter customer info
    And click on Save button
    Then User can view confirmation message
    Then close browser

  Scenario: Search Customer By EmailID

    Then User can view Customers dashboard
    When User Enter Customer  EmailID "kiyjcycyhjc676008@gmail.com"
    And User Click on search button
    Then User Should found Email id in the search table "kiyjcycyhjc676008@gmail.com"
    Then close browser
