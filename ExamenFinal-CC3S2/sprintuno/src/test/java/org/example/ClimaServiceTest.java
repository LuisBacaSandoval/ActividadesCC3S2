package org.example;

import org.example.ClimaService;
import org.example.IMedicionClimatica;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ClimaServiceTest {
    @Mock
    IMedicionClimatica temperatura;
    @Mock
    IMedicionClimatica lluvia;
    @Mock
    IMedicionClimatica viento;
    @InjectMocks
    ClimaService climaService;

    @Test
    public void testClimaFrio() {
        when(temperatura.esBaja()).thenReturn(true);
        when(lluvia.esAlta()).thenReturn(true);
        when(viento.esAlta()).thenReturn(true);

        climaService = new ClimaService(temperatura, lluvia, viento);

        assertEquals("Tenemos un clima frio, abrigate.", climaService.tipoDeClima());

        //verificamos si los metodos se estan llamando correctamente
        verify(temperatura).esBaja();
        verify(lluvia).esAlta();
        verify(viento).esAlta();
    }

    @Test
    public void testClimaAgradable() {
        when(temperatura.esNormal()).thenReturn(true);
        when(lluvia.esBaja()).thenReturn(true);
        when(viento.esBaja()).thenReturn(true);

        climaService = new ClimaService(temperatura, lluvia, viento);

        assertEquals("Tenemos un buen clima, disfruta el dia.", climaService.tipoDeClima());

        //verificamos si los metodos se estan llamando correctamente
        verify(temperatura).esNormal();
        verify(lluvia).esBaja();
        verify(viento).esBaja();
    }

    @Test
    public void testClimaCaluroso() {
        when(temperatura.esAlta()).thenReturn(true);
        when(lluvia.esBaja()).thenReturn(true);
        when(viento.esBaja()).thenReturn(true);

        climaService = new ClimaService(temperatura, lluvia, viento);

        assertEquals("Tenemos un clima caluroso, toma una bebida.", climaService.tipoDeClima());

        //verificamos si los metodos se estan llamando correctamente
        verify(temperatura).esAlta();
        verify(lluvia).esBaja();
        verify(viento).esBaja();
    }

    @Test
    public void testClimaNormal() {
        climaService = new ClimaService(temperatura, lluvia, viento);

        assertEquals("Tenemos un clima distinto, tomar precauciones.", climaService.tipoDeClima());
    }
}