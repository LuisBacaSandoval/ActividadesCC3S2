package org.example.Sprint1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Word1 word1 = new Word1("Hola");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra de 4 letras: ");
        String respuesta = scanner.nextLine();
        Score1 score = word1.guess(respuesta);
        System.out.println("Resultados: "+ score.getResults());
    }
}
