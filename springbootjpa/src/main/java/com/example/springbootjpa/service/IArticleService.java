package com.example.springbootjpa.service;

import java.util.List;

import com.example.springbootjpa.entity.Article;

public interface IArticleService {
	List<com.example.springbootjpa.entity.Article> getAllArticles();
    Article getArticleById(int articleId);
	boolean addArticle(Article article);
	void deleteArticle(int articleId);
	void updateArticle(Article article);

}
