Feature: Register
  As a new user
  I should be able to do register
  So that i can login to my account


  Scenario Outline: Register
    Given I am on login page for register
    When I click Daftar disini on login page i directed to register page
    And I input full name "<nama_lengkap>" for register
    And I input NIK "<NIK>" for register
    And I input phone number "<no_telp>" for register
    And I input Password "<password>" for register
    And I click register button
    Then I get the register result "<result>"

    Examples:
    |nama_lengkap|NIK|no_telp|password|result|
    |Alexandra Putri |7789441587641536|088840345931|alExaaa6767|dashboard_page|
    |Angeline  |4879116481234856|0876419845112|Passwordd456|stay on register page|
    |Roseanne  |8947114651234984|0847519843153|Password66  |stay on register page|
    |Johnny Wong    |7748503859928694|081245334981 |JackSparrow |invalid password     |
    |Johnny    |5549781345974415|0813o984315123|Katasandii45|invalid phone number|
    |          |2497881453459416|084612221462  |qwertY09    |input your fullname |
    |John Han      |                |0854531584912 |iLoveCat23  |input your NIK      |
    |John      |2497881453459416|0852879513049216|          |input your password |
    |Alicia    |2497881453459416|                |Twiceee12 |input your phone number|
    |Justin Mahendra|8794311678w9713016|089462164984|Passwordd345|stay on register page|
    | |5549781348974415                |081246511662|SpaceTest16 |stay on register page   |
    |Rioo|6549887132648046             |088841645931|captainAmerica890|dashboard_page  |
    |Awan|2497881453459616             |08534951!16213|Test12123      |invalid phone number|
    |Jade|3152691906967420             |0894721346183 |Password%$001  |dashboard_page      |
    |    |                             |              |               |all error messages show up|
    |Dandi :)|7231454789461145         |081345698713  |KeepSmile76^   |stay on register page        |
    |Faid    |4291931395522993         |081345698713  |passwordd456   |invalid password          |
    |Jane Felicia|4291931396522993     |081345698713  |Pas3451        |password less than 8 chars|