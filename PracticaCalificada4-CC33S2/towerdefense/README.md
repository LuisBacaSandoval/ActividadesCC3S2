# Tower Defense

## Explicacion de interfaces

La interfaz `EnemyFactory` define un contrato para la creacion de objetos de tipo Enemy.
```java
public interface EnemyFactory {
    Enemy createEnemy();
}
```
Uso: Se implementa la interfaz `EnemyFactory` para la creación del enemigo `BossEnemyFactory`,
este tiene las caracteristicas: lento, mucha vida, mayor recompensa.
```java
//Jefe: Lento, mucha vida, mayor recompensa.
public class BossEnemyFactory implements EnemyFactory{
    @Override
    public Enemy createEnemy() {
        return new Enemy(1, 500, 50);
    }
}
```

La interfaz `TowerFactory` define un contrato para la creacion de objetos de tipo Tower.
```java
public interface TowerFactory {
    Tower createTower();
}
```
Uso: Se implementa la interfaz `TowerFactory` para la creación de la torre `CannonTowerFactory`,
este tiene las caracteristicas: alto daño, corto alcance.
```java
//Cañón: Alto daño, corto alcance.
public class CannonTowerFactory implements TowerFactory{
    @Override
    public Tower createTower() {
        return new Tower(50, 2, 3);
    }
}
```

## Implementación de pruebas

```java
    @Test
    public void testPlaceTowerCallsAddTowerOnMap() {
        //se definen las coordenadas (x, y) donde la torre sera colocada.
        int x = 5;
        int y = 5;
        //se le dice al mock que cuando se llame al metodo isValidPosition con los argumentos x y y, debe devolver true.
        when(mapMock.isValidPosition(x, y)).thenReturn(true);

        //se llama al metodo a probar
        game.placeTower(towerMock, x, y);

        //esto asegura que el método addTower efectivamente intentó añadir la torre al mapa en la posición especificada.
        verify(mapMock).addTower(towerMock, x, y);
    }
```
* Mocks: Se utilizan para simular mapMock y towerMock. 
Estos mocks se utilizan para verificar que el método placeTower del objeto Game interactúa correctamente con el objeto Map al intentar añadir una torre.

* Stubs: Se utilizan para proporcionar respuestas predefinidas a llamadas de métodos específicos, el stub se implementa cuando se configura mapMock 
para que devuelva true al llamar al método isValidPosition con los argumentos x y y.