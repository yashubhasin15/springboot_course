package com.yashu.springboot.intro2.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    // FIELD-BASED AUTOWIRING (no contructor needed to initialise this bean)
    @Autowired @Qualifier("PacmanQualifier") //If we don't write Qualifier then it will autowire with MarioGame because it is @Primary
    GamingConsole game;

    // SETTER-BASED AUTOWIRING
//    @Autowired
//    public void setGame(GamingConsole game){
//        this.game= game;
//    } // Here game will be autowired with MarioGame because it is @Primary

    // CONSTRUCTOR-BASED AUTOWIRING
//    @Autowired // Autowire annotation is optional in constructor-based autowiring
//    public GameRunner(@Qualifier("SuperContraQualifier") GamingConsole game) {
//        this.game = game;
//    } // If we don't write Qualifier then it will autowire with MarioGame because it is @Primary



    public void run() {
        System.out.println("Running Game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
