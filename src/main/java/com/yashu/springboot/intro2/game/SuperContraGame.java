package com.yashu.springboot.intro2.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
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
