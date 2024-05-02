# Actividad 1 - Testing

## Preguntas

1. Pregunta 1

En el siguiente gráfico, el SUT (Sistema Bajo Prueba) se representa en el centro, y los DOC (Depended On Components) son 
los componentes que lo rodean y son necesarios para que el SUT cumpla con sus funciones. En el contexto de pruebas unitarias, 
el SUT generalmente es una sola unidad, como un método, y los DOC son las entidades que utiliza el SUT para funcionar correctamente.

2. Pregunta 2

El SUT (System Under Test) en este caso es la clase FinancialService, que es la clase que estamos probando. Sus 
colaboradores (DOC - Dependencies of the Class) son:

- clientDAO: Una dependencia que proporciona acceso a la base de datos o algún otro sistema de almacenamiento para 
recuperar información sobre el cliente, como su tipo.
- calculator: Una dependencia que se encarga de calcular el bono en función del tipo de cliente y el pago realizado.

Las interacciones importantes que ocurren dentro del método calculateBonus() para la prueba son:

Obtener el tipo de cliente llamando a clientDAO.getClientType(clientId).
Calcular el bono llamando a calculator.calculateBonus(clientType, payment).
Guardar el historial de bonos llamando a clientDAO.saveBonusHistory(clientId, bonus).

3. Pregunta 3

Las pruebas para los trabajadores y gerentes serían diferentes, ya que cada uno tiene sus propios atributos y métodos únicos. 
Por ejemplo, las pruebas para los trabajadores podrían verificar los métodos y atributos relacionados con su salario, 
mientras que las pruebas para los gerentes podrían verificar los métodos y atributos relacionados con la asignación de tareas o el seguimiento del progreso de los proyectos.

Es importante preocuparse por las interacciones indirectas, ya que el comportamiento de los objetos
puede afectar a otros objetos relacionados. 

5. Pregunta 5

La diferencia entre una prueba unitaria y otros tipos de pruebas es la siguiente:

Pruebas unitarias: Se centran en probar unidades individuales de código, como métodos o funciones, de manera aislada del resto del sistema. 
Las pruebas unitarias suelen ser rápidas, sencillas y fáciles de mantener.

Pruebas de integración: Verifican la correcta comunicación y cooperación entre diferentes módulos del sistema. 
Las pruebas de integración pueden ser más complejas y lentas que las pruebas unitarias, ya que involucran a varios componentes y pueden requerir infraestructura adicional, 
como bases de datos o servicios web.

Pruebas de aceptación: Son pruebas funcionales que se realizan desde la perspectiva del usuario final para verificar que el 
sistema se comporte como se espera.