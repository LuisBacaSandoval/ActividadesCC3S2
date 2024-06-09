package org.example.ejerciciotres;

public class DataBaseManager implements ArticleRepository{//clase que gestiona la persistencia de datos

    @Override
    public void saveArticle(String article) {
// Simulación de guardar en la base de datos
        System.out.println("Guardando en la base de datos: " + article);
    }

}
