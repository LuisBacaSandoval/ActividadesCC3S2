package org.example.Sprint2;


import java.util.ArrayList;
import java.util.Scanner;

public class Quiz2 {
    ArrayList<Question2> preguntas = new ArrayList<>();//atributo para almacenar las preguntas que se mostraran en el juego
    ArrayList<Integer>respuestas = new ArrayList<Integer>();//atributo para almacenar las respuestas del usuario

    public static void main(String[] args) {
        org.example.Sprint1.Quiz juego = new org.example.Sprint1.Quiz();
        juego.inicialize();
        juego.init();
    }
    public void inicialize(){//metodo para asignar las preguntas que se mostraran en el juego
        String p1 = "¿Cuál es la capital de Francia?";
        String alt1 = "Madrid";
        String alt2 = "Londres";
        String alt3 = "París";
        String alt4 = "Berlín";
        String rspt = "París";
        preguntas.add(new Question2(p1, alt1, alt2, alt3, alt4, rspt));
        String p2 = "¿Cuál es un numero par?";
        String alt21 = "Uno";
        String alt22 = "Dos";
        String alt23 = "Tres";
        String alt24 = "Cinco";
        String rspt2 = "Dos";
        preguntas.add(new Question2(p2, alt21, alt22, alt23, alt24, rspt2));
    }
    public void init(){//metodo para iniciar el juego
        int i = 0;
        Scanner sc = new Scanner(System.in);
        for (Question2 question2 : preguntas){
            if (i==0){
                System.out.println("Bienvenido al Juego de Trivia!");
                System.out.println("Responde las siguientes preguntas seleccionando el número de la opción correcta.");
            }
            System.out.println("Pregunta "+(i+1)+": "+ question2.getPregunta());
            System.out.println("1. "+ question2.getAlternativa1());
            System.out.println("2. "+ question2.getAlternativa2());
            System.out.println("3. "+ question2.getAlternativa3());
            System.out.println("4. "+ question2.getAlternativa4());
            System.out.println("Tu respuesta: ");
            try {
                int userAnswer = verifyAnswerUser(sc.nextLine());
                // Lógica para comparar la respuesta del usuario con la respuesta correcta
                if (verifyAnswer(question2.getRespuesta(), question2.getAlternativa(userAnswer))) {
                    System.out.println("Respuesta correcta!");
                } else {
                    System.out.println("Respuesta incorrecta!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Mostrar el mensaje de la excepción
                // Detener el bucle si la entrada del usuario es inválida
                break;
            }

            i++;
        }
    }
    public int  verifyAnswerUser(String resp)throws IllegalArgumentException {//metodo para verificar que el usuario ingrese un numero entre 1-4
        try {
            int answer = Integer.parseInt(resp);
            if (answer < 1 || answer > 4) {
                throw new IllegalArgumentException("Ingresa un numero entre 1 - 4");
            }
            return answer; // Retorna el valor de la respuesta si es válida
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ingresa un numero");
        }
    }
    public boolean verifyAnswer(String respuesta, String respuestaUser){
        return respuesta.equals(respuestaUser);
    }
}


