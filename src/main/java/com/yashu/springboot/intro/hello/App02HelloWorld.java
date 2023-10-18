package com.yashu.springboot.intro.hello;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorld {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class)) {
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address"));
            System.out.println(context.getBean("person2"));
            System.out.println(context.getBean("person3"));
            System.out.println(context.getBean("person4"));
            System.out.println(context.getBean(Person.class)); // primary is considered
        }
    }

}
