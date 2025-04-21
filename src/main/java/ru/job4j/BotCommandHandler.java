package ru.job4j;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;
import ru.job4j.content.Content;

@Service
public class BotCommandHandler {

    public void receive(Content content) {
        System.out.println(content);
    }

    @PostConstruct
    public void init() {
        System.out.println("Init BotCommandHandler");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy BotCommandHandler");
    }
}
