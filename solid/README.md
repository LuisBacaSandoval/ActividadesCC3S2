# Actividad SOLID

Ubicación: El código se encuentra dentro de org.example siendo Main la clase principal.

1. Principio de responsabilidad única(*SRP*)

   La clase Shapes no cumple con SRP, esta tiene
   multiples responsabilidades como:

    * Administrar la lista de formas con el método add()
    * Dibujar todas las formas en la lista con el método draw()
    * Conocer cada tipo de forma en la declaracion switch
    * Tiene detalles de como dibujar cada forma

   esto hace que la clase Shapes sea demasiado acoplata.

   *APLICANDO SRP*

   Para reducir las responsabilidades de la clase Shapes vamos a refactorizar el código  
   de tal manera que la responsabilidad de dibujar cada forma se traslade al método draw(),  
   el cual se implementará en las clases Rectrangle y TextBox.

2. Princio de inversión de dependencias(*DIP*)

   La clase Shapes no cumple con DIP, esta depende directamente del detalle de las clases Rectangle y TextBox  
   y hace que trabajar con ella sea más dificil por las siguientes razones:

    * Tenemos que cambiar la clase Shapes para agregar un nuevo tipo de forma.
    * Cualquier cambio en las clases concretas como Rectangle hará que este código cambie.
    * La clase Shapes será más larga y menos fácil de leer.
    * Terminaremos con más casos de prueba.
    * Cada caso de prueba se acoplará a clases concretas como Rectangle.

   *Aplicando DIP*

   Creamos una interfaz Shape la cual definirá el método draw, esta interfaz es la abstracción de la única responsabilidad  
   que tiene cada forma. Luego hacemos que las clases Rectangle y TextBox implementen esta interfaz para que cada una sepa como dibujarse a si misma cuando llamamos al metodo draw().

3. Princio de sustitución de liskov - LSP
   Todas las clases que implementan Shape cumplen con el LSP porque no ofrece "sorpresas" en la implementación del método draw().
4. Principio de abierto y cerrado(*OCP*)

   OCP fluye naturalmente con DIP, es por eso que como ya aplicamos DIP en ejercicios anteriores, el código ya está abierto
   para nuevos comportamientos pero cerrado al cambio por ende se cumple OCP.
   Esto se ve reflejado al agregar la clase RightArrow

5. Principio de abierto y cerrado(*OCP*)