# language: es

  Característica: nuevo usuario en plataforma Utest


    Escenario: realize el registro en plataforma Utest
      Dado nuevo usuario desea registrarse
      Cuando nuevo usuario ingresa a la plataforma Utest
        | usuario | contraseña |
      Entonces el registro se completa a dar click en boton configuracion completa

      Ejemplos:
        | usuario | contraseña |
        | ana     | 1234        |






