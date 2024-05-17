package com.bezkoder.spring.login.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.bezkoder.spring.login.models.NewsArticle;
import com.bezkoder.spring.login.models.NewsResponse;
import java.util.List;

@Service
public class NewsService {

    @Value("${news.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    @Autowired
    public NewsService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<NewsArticle> getNews() {
        String url = "https://newsapi.org/v2/everything?q=cybersecurity&pageSize=8&language=en&apiKey=" + apiKey;
        ResponseEntity<NewsResponse> response = restTemplate.getForEntity(url, NewsResponse.class);
        return response.getBody().getArticles();
    }
}

