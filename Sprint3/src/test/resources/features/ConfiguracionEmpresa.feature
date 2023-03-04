Feature: The user can create a new operator company

  Background:
    Given The user enters to Neat administration page
    When He puts the superAdmin and the 1234567
    And He goes to the Company management module



  @CrearMarca
  Scenario Outline: The actor can create a new brand
    Given He goes to the create new brand module
    When He clomplete the first Step
    And He complete the second Step
    And  He complete the Third Step
    And He complete the fourth Step
    And He complete the fiveth Step
    Then He sees the succes message 2 5

    Examples:



  @CancelarCrearMarca
  Scenario: Actor can cancel thecreate new brand operation
    Given He goes to the create new brand module
    When He slect the Cancel Button
    Then He sees the management company moedule



  @FiltrarMarca
  Scenario: Actor can filter a brand
    Given He filter the information 2
    Then He sees the regiter whit 2 information


  @LimpiarFiltros
  Scenario: Actor can clean the filters
    Given He filter the information 2
    When he select the clean filters button
    Then He sees all the registers information


   @VerMasFiltros
   Scenario: Actor can see more options of filter
     Given He select more filters button 2
     Then He sees all the filter options


