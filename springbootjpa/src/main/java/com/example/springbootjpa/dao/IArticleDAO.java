package com.example.springbootjpa.dao;

import java.util.List;

import com.example.springbootjpa.entity.Article;

public interface IArticleDAO {
	List<com.example.springbootjpa.entity.Article> getAllArticles();
    Article getArticleById(int articleId);
    void addArticle(Article article);
	boolean articleExists(String title, String category);

}
