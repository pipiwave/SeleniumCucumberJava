@Test

Feature: Probar la busqueda en Google

Background: Navegar a la web de google
    Given navego a google
    
Scenario: Busco algo en Google
    
    When escribo la busqueda
    And hago click
    Then obtengo resultado
