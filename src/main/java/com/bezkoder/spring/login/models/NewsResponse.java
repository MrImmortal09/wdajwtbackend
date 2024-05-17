package com.bezkoder.spring.login.models;

import java.util.List;

public class NewsResponse {

    private String status;
    private List<NewsArticle> articles;

    // Getters and setters

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<NewsArticle> getArticles() {
        return articles;
    }

    public void setArticles(List<NewsArticle> articles) {
        this.articles = articles;
    }
}

