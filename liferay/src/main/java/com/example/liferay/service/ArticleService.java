package com.example.liferay.service;

import com.example.liferay.model.Article;
import com.example.liferay.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    /**
     * Fetch all articles.
     *
     * @return List of all articles.
     */
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    /**
     * Fetch an article by its ID.
     *
     * @param id The ID of the article.
     * @return The article, or null if not found.
     */
    public Article getArticleById(Long id) {
        Optional<Article> article = articleRepository.findById(id);
        return article.orElse(null);
    }

    /**
     * Create a new article.
     *
     * @param article The article to create.
     * @return The created article.
     */
    public Article createArticle(Article article) {
        return articleRepository.save(article);
    }

    /**
     * Update an existing article.
     *
     * @param id The ID of the article to update.
     * @param article The updated article details.
     * @return The updated article.
     */
    public Article updateArticle(Long id, Article article) {
        article.setId(id); // Ensure the ID is set for update
        return articleRepository.save(article);
    }

    /**
     * Delete an article by its ID.
     *
     * @param id The ID of the article to delete.
     */
    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);
    }
}
