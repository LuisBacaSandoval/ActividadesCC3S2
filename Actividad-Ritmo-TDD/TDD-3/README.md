# Actividad Ritmo-TDD

## Preguntas

1. Esta prueba verifica que cuando el usuario adivina una letra correcta, el método `guess` devuelve un resultado que 
indica que la primera letra es correcta.

```
@Test
public void oneCorrectLetter(){
var word = new Word("A");
var score = word.guess("A");
assertThat(score.letter(0)).isEqualTo(Letter.CORRECT);
}
```

2. Cuando agregamos los cambios al código de producción, la prueba pasa de manera satisfactoria, esto nos indica que el 
método `guess` de la clase `Word` está funcionando como se espera cuando se adivina una letra correcta.

![Test1](/img/test1.PNG)

3. Tras ejecutar la suite de pruebas, observamos que todos los tests han sido compilados con éxito y han superado las 
validaciones con arreglo al proceso RGR (Red-Green-Refactor). Este enfoque iterativo asegura que el código cumpla con 
las expectativas definidas en los casos de prueba, manteniendo la integridad del sistema y permitiendo su evolución continua.

![Test2](/img/test2.PNG)