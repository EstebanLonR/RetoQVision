Feature:Registro de usuario en uTest

  Scenario:Registro de usuario exitoso
    Given El usuario se encuentra en la pagina principal
    When El se registra
      | firstName  | lastName | email                  | city      | postalCode | password     |
      | Pancracion | Ramirez  | prueba1114@correo.com | Chigorodó | 057410     | 12345678uioP |
    Then Debe de ver el boton de Complete Setup