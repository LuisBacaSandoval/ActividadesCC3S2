package org.example.Sprint2;


import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Word2 word2 = new Word2("Hola");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra de 4 letras: ");
        String respuesta = scanner.nextLine();
        Score2 score = word2.guess(respuesta);
        while (verify(score)){//si todas las letras no son correctas, se seguir ejecutando el bucle while
            System.out.println("Resultados: "+ score.getResults());
            System.out.print("Ingresa de nuevo una palabra: ");
            respuesta = scanner.nextLine();
            score = word2.guess(respuesta);
        }
        System.out.println("Felicidades, acertaste!");
    }
    public static boolean verify(Score2 score2){//metodo para dar retroalimentacion al usuario
        for (Letter2 letter2 : score2.getResults() ){
            if (letter2 != Letter2.CORRECT){//si la letra no es correcta se retorna true
                return true;
            }
        }
        return false;
    }
}
