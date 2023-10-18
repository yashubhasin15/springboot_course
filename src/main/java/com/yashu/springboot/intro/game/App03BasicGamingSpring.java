package com.yashu.springboot.intro.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03BasicGamingSpring {
    public static void main(String[] args){
        try(var context= new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GameRunner.class).run();
        }
    }
}
