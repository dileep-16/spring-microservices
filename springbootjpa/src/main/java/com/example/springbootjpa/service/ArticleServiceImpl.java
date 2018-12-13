package com.example.springbootjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springbootjpa.dao.IArticleDAO;
import com.example.springbootjpa.entity.Article;
@Service
public class ArticleServiceImpl implements IArticleService {
	@Autowired
	private IArticleDAO articleDAO;
	@Override
	public List<Article> getAllArticles() {
		// TODO Auto-generated method stub
		return articleDAO.getAllArticles();
	}

	@Override
	public Article getArticleById(int articleId) {
		// TODO Auto-generated method stub
		Article obj = articleDAO.getArticleById(articleId);
		return obj;
	}
	@Transactional
	@Override
	public  boolean addArticle(Article article) {
		// TODO Auto-generated method stub
		 
	            articleDAO.addArticle(article);
	            return true;
	           
	}
	

}
