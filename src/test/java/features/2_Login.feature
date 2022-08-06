Feature:Advantage Online shopping Login page functionality

  @smoke
  Scenario:  Login scenario
    Given user on homePage

    When user Login as follows
      | userName | adanali |
      | password | Ksa12345.|
    Then  User should be able to login successfully


