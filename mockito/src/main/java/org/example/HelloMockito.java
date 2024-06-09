package org.example;

import java.util.Optional;

/*
* Primer paso:
* Creamos la clase HelloWorld
* En primera instancia HelloWorld contiene un metodo void
* y los metodos que devuelven void son dificiles de probar
*
* */
/*public class HelloMockito {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public String greet(String world) {
        return "Hello, " + world + ", from Mockito!";
    }
}*/
//Inyectamos dependencias a la clase HelloMockito
public class HelloMockito {
    private String greeting = "Hello, %s, from Mockito!";
    // Dependencies
    private final PersonRepository personRepository;
    private final TranslationService translationService;
    // Constructor to inject the dependencies
    public HelloMockito(PersonRepository personRepository,
                        TranslationService translationService) {
        this.personRepository = personRepository;
        this.translationService = translationService;
    }
    // Method we want to test
    public String greet(int id, String sourceLang, String targetLang) {
        Optional<Person> person = personRepository.findById(id);
        String name = person.map(Person::getFirst).orElse("World");

        /*if ("World".equals(name)) {
            throw new RuntimeException("Data base error");
        }*/

        return translationService.translate(
                String.format(greeting, name), sourceLang, targetLang);
    }
}