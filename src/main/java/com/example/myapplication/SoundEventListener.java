package com.example.myapplication;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SoundEventListener implements ApplicationListener<SoundEvent> {
    @Override
    public void onApplicationEvent(SoundEvent event) {
        System.out.println("listener-1 get message: " + event.getMessage());
    }
}
