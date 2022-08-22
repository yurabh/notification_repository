package com.config;

import com.service.EmailSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class InputBinder {
    @Bean
    public Consumer<String> notificationEventSupplier() {
        return message -> new EmailSender().sendEmail(message);
    }
}
