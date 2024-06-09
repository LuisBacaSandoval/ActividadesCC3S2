# Actividad Refactorización

1. Refactorización para mejorar la cohesión y reducir el acoplamiento

    **Ubicación**: org.example.ejeciciouno

   La clase EmployeeManager tiene baja cohesión y alto acoplamiento debido a que tiene multiples responsabilidades  
   y todos los métodos se encuentran dentro de la misma.

   Para aumentar la cohesion y bajar el acoplamiento se creó la clase:
   
   - DepartmentManager: Gestiona todos los métodos relacionados con los departamentos.
   
   - Employee: Representa al empleado.

   - Department: Representa al departamento.
2. Aplicación de patrones de diseño para refactorización

3. Refactorización para introducir principios SOLID

   **Ubicación**: org.example.ejercicio3

   La clase BlogManager no cumple con SRP, tiene multiples responsabilidades y tampoco cumple con DIP:
   
   * Maneja la lista de artículos: métodos addArticle() y printAllArticles()
   * Maneja la persistencia de datos: método saveArticleToDatabase()

   Aplicando SRP:

   * Separamos la lógica de gestión de artículos en la clase BlogManager
   * Separamos la lógica de persistencia de datos en la clase DataBaseManager

   Aplicando DIP:

   * Creamos la interfaz ArticleRepository, ahora BlogManager depende de la abstracción de ArticleRepository en lugar de DataBaseManager

   Aplicando OCP:

   * Usamos la interefaz ArticleRepository, ahora BlogManager puede extenderse facilmente para utilizar distintos tipos de almacenamiento sin modificar el código existente.

   Los principios ISP y LSP se cumplen.