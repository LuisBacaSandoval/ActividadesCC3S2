package org.example.metricasdecohesion;

import java.util.*;

public class LCOMCalculator {
    public static class ClassInfo {
        //Se cambio los atributos a privados
        private final List<String> methods = new ArrayList<>();
        private final Map<String, Set<String>> methodAttributes = new HashMap<>();
        private final Set<String> attributes = new HashSet<>();

        public void addMethod(String methodName, Set<String> attrs) {//se implemento el manejo de errores
            if (methodName == null || attrs == null || attrs.isEmpty()) {//los valores de methodName y attrs no pueden ser nulos ni vacios
                throw new IllegalArgumentException("El nombre del método y los atributos no pueden ser nulos ni estar vacíos.");
            }
            methods.add(methodName);
            methodAttributes.put(methodName, attrs);
            attributes.addAll(attrs);
        }
        // se agregaron los métodos getter para los atributos de la clase ClassInfo
        public List<String> getMethods() {
            return Collections.unmodifiableList(methods);
        }

        public Set<String> getMethodAttributes(String methodName) {
            return Collections.unmodifiableSet(methodAttributes.getOrDefault(methodName, Collections.emptySet()));
        }
    }

    public static int calculateLCOM(ClassInfo classInfo) {//se implementó el metodo calculeLCOM que calcula LCOM de la clase que se le pasa como atributo
        int p = 0, q = 0;
        List<String> methods = classInfo.getMethods();
        for (int i = 0; i < methods.size(); i++) {
            for (int j = i + 1; j < methods.size(); j++) {
                String method1 = methods.get(i);
                String method2 = methods.get(j);
                Set<String> attrs1 = classInfo.getMethodAttributes(method1);
                Set<String> attrs2 = classInfo.getMethodAttributes(method2);

                Set<String> intersection = new HashSet<>(attrs1);
                intersection.retainAll(attrs2);

                if (intersection.isEmpty()) {
                    p++; // No comparten atributos
                } else {
                    q++; // Comparten al menos un atributo
                }
            }
        }
        return p - q;
    }

    public static void main(String[] args) {
        ClassInfo classInfo = new ClassInfo();
        // Simulación de entrada de métodos y sus accesos a atributos
        classInfo.addMethod("method1", new HashSet<>(Arrays.asList("attr1", "attr2")));
        classInfo.addMethod("method2", new HashSet<>(Arrays.asList("attr2")));
        classInfo.addMethod("method3", new HashSet<>(Arrays.asList("attr3")));
        /*
        * Ejercicio1
        * Agregamos 5 metodos adicionales con distintas combinaciones de atributos
        * */
        classInfo.addMethod("method4", new HashSet<>(Arrays.asList("attr1", "attr3")));
        classInfo.addMethod("method5", new HashSet<>(Arrays.asList("attr2", "attr3")));
        classInfo.addMethod("method6", new HashSet<>(Arrays.asList("attr1", "attr2", "attr3")));
        classInfo.addMethod("method7", new HashSet<>(Arrays.asList("attr4")));
        classInfo.addMethod("method8", new HashSet<>(Arrays.asList("attr1", "attr4")));

        int lcom = calculateLCOM(classInfo);
        System.out.println("LCOM = " + lcom);
    }
}
