## Métricas de acoplamiento

**Ubicación:**
org.example.metricasdeacoplamiento

Tenemos 3 módulos: USuarioModulo - GrupoContactoModulo - ContactoOperacionesModulo

### Acoplamiento eferente(Ce)

- Módulo UsuarioModulo: el módulo USuarioModulo, depende de los módulos Usuario y GrupoContactoModulo

        Ce de UsuarioModulo = 2
- Módulo GrupoContactoModulo: el módulo GrupoContactoModulo, depende unicamente del módulo Usuario

        Ce de GrupoContactoModulo = 1
- Módulo ContactoOperacionesModulo: el módulo ContactoOperacionesModulo, depende unicamente del módulo Usuario
 
        Ce de ContactoOperacionesModulo = 1

### Acoplamiento aferente(Ca)

- Módulo UsuarioModulo: el módulo USuarioModulo, no tiene dependencias aferentes(ningun otro módulo lo usa)

        Ca de UsuarioModulo = 0
- Módulo GrupoContactoModulo: el módulo GrupoContactoModulo, es utilizado por el módulo UsuarioModulo

        Ca de GrupoContactoModulo = 1
- Módulo ContactoOperacionesModulo: el módulo ContactoOperacionesModulo, no tiene dependencias aferentes(ningun otro módulo lo usa)

        Ca de ContactoOperacionesModulo = 0

### Factor de acoplamiento(Cf)

CF = e/a*(n-1)

e = numero de enlaces entre modulos -> e = 4

a = numero de modulos en el sistema -> a = 4

n = numero total de modulos -> n = 4

        CF = 4/4(4-1) = 0.333

## Métricas de cohesión

**Ubicación:**
org.example.metricasdeacoplamiento

* LCOM: mide la cohesión de una clase.

      LCOM = |P| - |Q|


