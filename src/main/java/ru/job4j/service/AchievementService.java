package ru.job4j.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

@Service
public class AchievementService implements BeanNameAware {

    @PostConstruct
    public void init() {
        System.out.println("Init AchievementService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy AchievementService");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("AchievementService bean name: " + name);
    }
}
