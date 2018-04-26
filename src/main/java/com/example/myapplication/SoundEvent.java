package com.example.myapplication;

import org.springframework.context.ApplicationEvent;

public class SoundEvent extends ApplicationEvent {
    private String message;

    public SoundEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
