Feature: Login en Orange HRM

  Como usuario de Orange HRM
  quiero loguearme en el aplicativo
  para acceder a sus funcionalidades

  @wik
  Scenario: Login en Orange HRM con credenciales validas

    Given el usuario se necuentra en la pagina login de Orange HRM
    When ingresa sus credenciales validas
    Then deberia ver la pagina Home de Orange HRM