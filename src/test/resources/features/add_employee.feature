Feature: Creacion de empleado en modulo de pim

  Como usuario
  quieor crear un empleado en modulo de pim
  para tener un nuevo empleado

  Background:
    Given el usuario se necuentra en la pagina login de Orange HRM
    When ingresa sus credenciales validas

    @wik
    Scenario: Creacion exitosa de empleado
      When el usario se encuentra en pagina Home de Orange HRM
      And accede al modulo de Pim
      And presiona el boton add
      And completa el formulario
      And busca al empleado en modulo de pim
      Then deberia ver al nuevo empleado creado
