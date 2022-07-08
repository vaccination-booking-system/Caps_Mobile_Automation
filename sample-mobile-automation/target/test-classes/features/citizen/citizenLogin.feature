Feature: Login
  As a user
  I want to login to my account
  So that I can access all the features

  Scenario Outline: Login
    Given I am on Evizy Login page
    When I enter NIK "<NIK>" for login
    And I enter Password "<Password>" for login
    And I click login button
    Then I get the login result "<result>"

    Examples:
    |NIK|Password|result|
    |5719348816440007|Password321|dashboard_page|
    |7489462587164955|Passwordtest11|NIK atau Password salah|
    |5719348816440007|Ayobermain12  |NIK atau Password salah|
    |                |Password321|Masukkan NIK Anda    |
    |5719348816440007|           |Masukkan Password Anda|
    |                |           |Both alert for empty field show up|
    |716485awf4441689|Password321|NIK atau Password salah           |
    |788943156491    |Passwordtest321|Enter Valid NIK               |
    |788943156491^&13|Passwordtest321|NIK atau Password salah       |
    |5719348816440007|password321     |NIK atau Password salah      |