package ru.job4j.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;
import ru.job4j.BotCommandHandler;
import ru.job4j.content.Content;

@Service
public class TelegramBotService implements BeanNameAware {
    private final BotCommandHandler handler;

    public TelegramBotService(BotCommandHandler handler) {
        this.handler = handler;
    }

    @PostConstruct
    public void init() {
        System.out.println("Init TelegramBotService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy TelegramBotService");
    }

    public void receive(Content content) {
        handler.receive(content);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("TelegramBotService bean name: " + name);
    }
}
