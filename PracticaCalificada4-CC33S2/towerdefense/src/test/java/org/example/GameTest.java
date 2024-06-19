package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GameTest {

    @Mock
    private Tower towerMock;

    @Mock
    private Enemy enemyMock;

    @Mock
    private Map mapMock;

    @InjectMocks
    private Game game;

    //test para verificar el comportamiento de los metodos placeTower y placeEnemy
    //se agregan torres y enemigos en posiciones validas
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

    @Test
    public void testPlaceEnemyCallsAddEnemyOnMap(){
        //se definen las coordenadas (x, y) donde la torre sera colocada.
        int x = 4;
        int y = 3;
        //se le dice al mock que cuando se llame al metodo isValidPosition con los argumentos x y y, debe devolver true.
        when(mapMock.isValidPosition(x, y)).thenReturn(true);

        //se llama al metodo a probar
        game.placeEnemy(enemyMock, x, y);

        //esto asegura que el método addEnemy efectivamente intentó añadir el enemigo al mapa en la posición especificada.
        verify(mapMock).addEnemy(enemyMock, x, y);
    }
}