package org.example.ejerciciotres;

import java.util.*;

public class BlogManager {//clase que gestiona la lista de articulos
    private List<String> articles = new ArrayList<>();
    private ArticleRepository articleRepository;

    public BlogManager(ArticleRepository articleRepository) {//constructor que inyecta la dependencia
        this.articleRepository = articleRepository;
    }

    public void addArticle(String article) {//agrega un articulo a la lista
        if (article != null && !article.isEmpty()) {
            articles.add(article);
            System.out.println("Artículo añadido: " + article);
            articleRepository.saveArticle(article);
        }
    }

    public void printAllArticles() {//muestra todos los articulos de la lista
        for (String article : articles) {
            System.out.println("Artículo: " + article);
        }
    }
}