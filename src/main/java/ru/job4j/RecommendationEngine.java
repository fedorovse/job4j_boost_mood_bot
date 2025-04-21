package ru.job4j;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class RecommendationEngine {

    @PostConstruct
    public void init() {
        System.out.println("Init RecommendationEngine");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy RecommendationEngine");
    }
}
