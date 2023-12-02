Feature: feature to test demoblaze page

  @readSheetDocument
  Scenario Outline: Validate demoblaze page is working
    Given browser is open2
    And user is on demoblaze page
    When click on login
    And user enter username "<row>"
    And user enter password "<row>"
    And click on login2
    And click on section "<row>"
    And click on "<row>"
    And add product at the cart
    And click cart to show product
    And click on place order
    And user enters name "<row>"
    And user enters country "<row>"
    And user enters city "<row>"
    And user enters card "<row>"
    And user enters month "<row>"
    And user enters year "<row>"
    And click on purchase
    Then verify message success

    Examples:
      | row |
      | 1   |
      | 2   |
      | 3   |
      | 4   |
#      | termino           | name                   | country    | city     | card           | month | year | username   | password | section  |
#      | Samsung galaxy s6 | Juan Esteban Barrero   | Colombia   | Armenia  | 7309-2020-1234 | 11    | 25   | juanesbc07 | 1234     | Phones   |
#      | Sony vaio i5      | Diana Valentina Burgos | Afganistan | Kandahar | 1990-9087-2378 | 12    | 27   | valenbg07  | 1234     | Laptops  |
#      | Apple monitor 24  | Felipe Arias Mosquera  | Turquia    | Bursa    | 1098-5647-4839 | 10    | 28   | felipe07   | 1234     | Monitors |
#      | ASUS Full HD      | Yulissa Cardona Burgos | España     | Madrid   | 5987-7898-7979 | 11    | 30   | yulicb07   | 1234     | Monitors |