package com.bezkoder.spring.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.login.models.NewsArticle;
import com.bezkoder.spring.login.services.NewsService;

import java.util.List;

@RestController
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("/news")
    public List<NewsArticle> getNews() {
        return newsService.getNews();
    }
}


