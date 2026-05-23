package com.smit.headlineHub.controller;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.client.RestTemplate;

@RestController

@RequestMapping("/api/news")

@CrossOrigin(origins = "*")

public class NewsController {

    @Value("${gnews.api.key}")
    private String apiKey;

    @GetMapping
    public String getNews(
            @RequestParam String query
    ) {

        String url =
                "https://gnews.io/api/v4/search?q="
                        + query
                        + "&lang=en&max=25&apikey="
                        + apiKey;

        RestTemplate restTemplate =
                new RestTemplate();

        return restTemplate.getForObject(
                url,
                String.class
        );
    }
}
