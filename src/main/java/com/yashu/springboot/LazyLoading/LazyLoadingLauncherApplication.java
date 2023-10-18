package com.yashu.springboot.LazyLoading;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class EagerClass{
    EagerClass(){
        System.out.println("I am Eager"); // Since beans by eagerly loaded by default, this bean will be initialised as soon as context is created
    }
}
@Component
@Lazy
class LazyClass{
    LazyClass(){
        System.out.println("I am Lazy"); // Since we specified this class to be lazy, it will load only when called
    }
}

@ComponentScan
public class LazyLoadingLauncherApplication {
    public static void main(String[] args){
        try(var context= new AnnotationConfigApplicationContext(LazyLoadingLauncherApplication.class)){
            System.out.println("Initialised"); // All the Eager beans would already be initialised by this point
            System.out.println(context.getBean(LazyClass.class)); // this call will lead to the creation of lazy bean LazyClass
        }
    }
}
