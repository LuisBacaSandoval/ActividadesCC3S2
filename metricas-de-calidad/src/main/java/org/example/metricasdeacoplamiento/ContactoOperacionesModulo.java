package org.example.metricasdeacoplamiento;

class ContactoOperacionesModulo {//modulo de operaciones de contacto
    public void enviarMensaje(String mensaje, Usuario usuario) {//primer modulo externo
        System.out.println("Enviando mensaje a " + usuario.getNombre() + ": " + mensaje);
    }
}
