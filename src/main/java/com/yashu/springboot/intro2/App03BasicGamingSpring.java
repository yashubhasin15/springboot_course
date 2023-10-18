package com.yashu.springboot.intro2;

import com.yashu.springboot.intro2.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.yashu.springboot.intro2.game")
public class App03BasicGamingSpring {
    public static void main(String[] args){
        try(var context= new AnnotationConfigApplicationContext(App03BasicGamingSpring.class)){
            context.getBean(GameRunner.class).run();
        }
    }
}
