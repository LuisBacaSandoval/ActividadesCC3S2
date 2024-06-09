package org.example.metricasdeacoplamiento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GrupoContactoModulo {//modulo de grupos de contacto
    static Map<String, List<Usuario>> grupos = new HashMap<>();//primer modulo externo
    static {
        grupos.put("General", new ArrayList<>());
    }
    public static void agregarUsuarioAGrupo(Usuario usuario, String grupoNombre) {
        grupos.get(grupoNombre).add(usuario);
    }
    public static void crearGrupo(String nombre) {
        if (!grupos.containsKey(nombre)) {
            grupos.put(nombre, new ArrayList<>());
        }
    }
}
