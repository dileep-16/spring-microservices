package com.example.springbootjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.springbootjpa.entity.Article;
import com.example.springbootjpa.service.IArticleService;



@RestController
@RequestMapping("/user")
public class ArticleController 
{
	@Autowired
	private IArticleService articleService;
	@GetMapping("/article/{id}")
    public ResponseEntity<Article> getArticleById(@PathVariable("id") Integer id) 
	{
		Article article = articleService.getArticleById(id);
		return new ResponseEntity<Article>(article, HttpStatus.OK);
	}
	@GetMapping("/articles")
	public ResponseEntity<List<Article>> getAllArticles() {
	List<Article> list = articleService.getAllArticles();
	return new ResponseEntity<List<Article>>(list, HttpStatus.OK);
}
	@PostMapping("/article")
	public ResponseEntity<Article> addArticle(@RequestBody Article article) {
    boolean flag = articleService.addArticle(article);
    return new ResponseEntity<Article>(article, HttpStatus.CREATED);
	}
  @DeleteMapping("/article/{id}")	 
  public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id)
  { 
	  articleService.deleteArticle(id);
	  return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	
	  
  }
	
}	