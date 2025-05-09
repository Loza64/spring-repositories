package com.pnc.loza.labo.config;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.stereotype.Component;

@Component
public class Initializer implements ApplicationListener<ApplicationStartingEvent> {

    private final Dotenv dotenv;

    @Autowired
    public Initializer(Dotenv dotenv) {
        this.dotenv = dotenv;
    }


    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        String url = dotenv.get("SPRING_DATASOURCE_URL");
        String user = dotenv.get("SPRING_DATASOURCE_USER");
        String password = dotenv.get("SPRING_DATASOURCE_PASSWORD");

        if (url != null) {
            System.setProperty("spring.datasource.url", url);
        }
        if (user != null) {
            System.setProperty("spring.datasource.username", user);
        }
        if (password != null) {
            System.setProperty("spring.datasource.password", password);
        }

        System.out.println("Database URL: " + url);
        System.out.println("Database User: " + user);
        System.out.println("Database Password: " + password);
    }
}
