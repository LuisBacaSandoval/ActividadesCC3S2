package org.example;

public class ClimaService {
    private final IMedicionClimatica temperatura;
    private final IMedicionClimatica lluvia;
    private final IMedicionClimatica viento;

    public ClimaService(IMedicionClimatica temperatura, IMedicionClimatica lluvia, IMedicionClimatica viento) {
        this.temperatura = temperatura;
        this.lluvia = lluvia;
        this.viento = viento;
    }

    public String tipoDeClima(){
        if (temperatura.esBaja() && lluvia.esAlta() && viento.esAlta()){
            return "Tenemos un clima frio, abrigate.";
        }
        if (temperatura.esNormal() && lluvia.esBaja() && viento.esBaja()){
            return "Tenemos un buen clima, disfruta el dia.";
        }
        if (temperatura.esAlta() && lluvia.esBaja() && viento.esBaja()){
            return "Tenemos un clima caluroso, toma una bebida.";
        }
        return "Tenemos un clima distinto, tomar precauciones.";
    }
}
