package com.yashu.springboot.intro.game;

public class PacmanGame implements GamingConsole {
    public void up() {
        System.out.println("Up");
    }

    public void down() {
        System.out.println("Down");
    }

    public void right() {
        System.out.println("Right");
    }

    public void left() {
        System.out.println("Left");
    }
}
