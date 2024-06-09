package org.example.ejerciciodos;

public class NotificationManager {//clase que maneja notificaciones
    private String user;//usuario a quien se notificara
    private String message;//mensaje que debemos enviar
    public NotificationManager(String user, String message) {//constructor para inyectar dependencias
        this.user = user;//asigna el usuario
        this.message = message;//asigna el mensaje
    }
    public void sendNotification(String type) {//metodo que notificara teniendo en cuenta el tipo de mensaje
        if ("email".equals(type)) {//notificacion para emils
            System.out.println("Enviando email a " + user + " con mensaje: " + message);
        } else if ("sms".equals(type)) {//notificacion para sms
            System.out.println("Enviando sms a " + user + " con mensaje: " + message);
        } else if ("app".equals(type)) {//notificacion para app
            System.out.println("Enviando notificación de app a " + user + " con mensaje: " + message);
        }
    }
}
