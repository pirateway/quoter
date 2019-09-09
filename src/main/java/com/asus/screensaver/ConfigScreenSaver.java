package com.asus.screensaver;

import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

@Configuration
@ComponentScan("com.asus.screensaver")
public class ConfigScreenSaver {

    @Bean
    @Scope(value = "periodical")
    public Color color(){
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    @Bean
    public ColorFrame colorFrame(){
        return new ColorFrame() {
            @Override
            protected Color getColor() {
                return color();
            }
        };
    }

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigScreenSaver.class);
        while (true){
            Thread.sleep(1000);
            context.getBean(ColorFrame.class).showOnRandomPlace();
        }

    }
}
