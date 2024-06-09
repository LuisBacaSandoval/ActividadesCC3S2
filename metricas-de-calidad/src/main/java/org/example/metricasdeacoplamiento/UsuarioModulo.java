package org.example.metricasdeacoplamiento;

import java.util.ArrayList;
import java.util.List;

class UsuarioModulo {//modulo de usuarios
    private List<Usuario> usuarios = new ArrayList<>();//primer modulo externo

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        GrupoContactoModulo.agregarUsuarioAGrupo(usuario, "General");//segundo modulo externo
    }
    public void eliminarUsuario(String nombre) {
        usuarios.removeIf(u -> u.getNombre().equals(nombre));
    }
}
