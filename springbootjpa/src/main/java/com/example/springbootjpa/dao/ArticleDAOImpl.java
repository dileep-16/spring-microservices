package com.example.springbootjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.springbootjpa.entity.Article;
@Transactional
@Repository
public class ArticleDAOImpl implements IArticleDAO {
final static Logger logger = LoggerFactory.getLogger(ArticleDAOImpl.class);
	
   @Autowired
	private EntityManager entityManager;
	@Override
	public List<Article> getAllArticles() {
		// TODO Auto-generated method stub
		String hql = "FROM Article as atcl ORDER BY atcl.articleId";
		return (List<Article>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Article getArticleById(int articleId) {
		// TODO Auto-generated method stub
		logger.info("id is... "+articleId);
		return entityManager.find(Article.class, articleId);
	}
	@Transactional
	@Override
	public void addArticle(Article article) {
		// TODO Auto-generated method stub
		//entityManager.persist(article);
		
		try {
			entityManager.persist(article);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean articleExists(String title, String category) {
		// TODO Auto-generated method stub
		String hql = "FROM Article as atcl WHERE atcl.title = ? and atcl.category = ?";
		int count = entityManager.createQuery(hql).setParameter(1, title)
		              .setParameter(2, category).getResultList().size();
		return count > 0 ? true : false;
	}

}
