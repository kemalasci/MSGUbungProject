Feature: Registration functionality

  @smoke
  Scenario: Create User
    Given user on homePage
    When  navigate to Registration page
    Then Create a new account

      | email           | adanaliburjuva01@gmail.com |
      | password        | Ksa12345678.               |
      | confirmPassword | Ksa12345678.               |
      | firstName       | Tester                     |
      | lastName        | Sdet                       |
      | phoneNummer     | 012345678                  |
      | city            | Siegen                     |
      | addres          | TesterSdet TesterSdet      |
      | state           | NRW                        |
      | postCode        | 012345                     |
    And tick  to Confim box and click to registiration
    Then Registration Success message should be displayed





