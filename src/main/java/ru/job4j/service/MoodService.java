package ru.job4j.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class MoodService {

    @PostConstruct
    public void init() {
        System.out.println("Init RecommendationEngine");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy RecommendationEngine");
    }
}
