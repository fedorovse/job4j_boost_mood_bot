package ru.job4j.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

@Service
public class MoodService implements BeanNameAware {

    @PostConstruct
    public void init() {
        System.out.println("Init RecommendationEngine");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy RecommendationEngine");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("MoodService bean name: " + name);
    }
}
