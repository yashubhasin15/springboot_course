package com.yashu.springboot.intro.game;

public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("Jump High");
    }

    public void down() {
        System.out.println("Bend Down");
    }

    public void right() {
        System.out.println("Shoot a bullet");
    }

    public void left() {
        System.out.println("Defend a bullet");
    }
}
