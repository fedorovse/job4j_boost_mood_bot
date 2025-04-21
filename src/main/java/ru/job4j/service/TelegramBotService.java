package ru.job4j.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;
import ru.job4j.BotCommandHandler;
import ru.job4j.content.Content;

@Service
public class TelegramBotService {
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
}
