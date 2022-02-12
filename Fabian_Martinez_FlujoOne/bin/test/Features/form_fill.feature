Feature: Automatizacion Flujo Prueba
  Yo como automatizador
  Necesito adicionar productos al carrito y validarlo
  Para comprobar el valor total del carrito

  Scenario: Validacion Valor Carrito
    Given El cliente ingresa a la pagina de prueba
    When Adiciona productos al carrito
    Then Valido el valor total del carrito

