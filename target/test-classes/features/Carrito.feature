#06/10/2022
#Jhonatan Medina Blanco
Feature: carrito

  Scenario Outline: eliminar producto
    Given abrir el navegador
    And Diligencie el usuario <user> y contraseña <password>
    When busque el producto <products>
    Then se elimina el producto <deleteProducts>


    Examples:
      | user          | password     | products                 | deleteProducts           |
      | standard_user | secret_sauce | Sauce Labs Fleece Jacket | Sauce Labs Fleece Jacket |



