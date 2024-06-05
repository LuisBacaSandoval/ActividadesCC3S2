package org.example;

import java.util.Scanner;

public class Game {//Metodo principal, en él se podrá jugar
    private IWordSelector wordSelector;
    private IHintGenerator hintGenerator;
    private Word hiddenWord;//atributo que almacena la palabra aleatoria
    private int attemptsLeft;//atributo que almacena el numero de intentos

    public Game(IWordSelector wordSelector, IHintGenerator hintGenerator) {
        this.wordSelector = wordSelector;
        this.hintGenerator = hintGenerator;
        this.attemptsLeft = 5; // Numero de intentos
    }

    public void start() {//metodo para comenzar el juego
        this.hiddenWord = wordSelector.selectWord();
        System.out.println("¡Bienvenido al juego de adivinanza de palabras!");
        System.out.println("Pista inicial: " + hintGenerator.generateInitialHint(hiddenWord));

        //lógica del juego
        while (attemptsLeft > 0) {//itera mientras queden intentos, si no quedan intentos sale del bucle
            System.out.println();
            System.out.println("Número de intentos: " + attemptsLeft);
            System.out.print("Ingresa tu adivinanza: ");
            Scanner scanner = new Scanner(System.in);
            String guess = scanner.nextLine();

            if (guess.equalsIgnoreCase(hiddenWord.getWord())) {//si adivina la palabra se muestra un mensaje
                System.out.println("¡Felicidades! Adivinaste la palabra correcta.");
                return;
            } else {//si no adivina la palabra se da una pista
                System.out.println(hintGenerator.generateHint(hiddenWord.getWord(), guess));
                attemptsLeft--;
            }
        }

        System.out.println("No te quedan intentos. La palabra correcta era: " + hiddenWord);
    }

    public static void main(String[] args) {
        IWordSelector wordSelector = new WordSelector();
        IHintGenerator hintGenerator = new HintGenerator();
        Game game = new Game(wordSelector, hintGenerator);
        game.start();
    }
}
