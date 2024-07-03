package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IMedicionClimatica temperatura;
        IMedicionClimatica lluvia;
        IMedicionClimatica viento;
        ClimaService climaService;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura: ");
        int temp = scanner.nextInt();
        System.out.print("Ingrese la lluvia: ");
        int luv = scanner.nextInt();
        System.out.print("Ingrese la viento: ");
        int vien = scanner.nextInt();

        //Dependencias
        temperatura = new Temperatura(temp);
        lluvia = new Lluvia(luv);
        viento = new Viento(vien);

        climaService = new ClimaService(temperatura, lluvia, viento);

        System.out.println(climaService.tipoDeClima());
    }
}