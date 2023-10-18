package com.yashu.springboot.intro.game;

public class App01GamingBasicJava {
    public static void main(String[] args) {
//        var game= new PacmanGame();
//        var game= new MarioGame();
        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);

        gameRunner.run();
    }
}
