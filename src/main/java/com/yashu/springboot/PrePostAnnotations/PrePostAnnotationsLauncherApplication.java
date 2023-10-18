package com.yashu.springboot.PrePostAnnotations;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{
    SomeDependency someDependency;

    SomeClass(SomeDependency someDependency){
        this.someDependency= someDependency;
        System.out.println("Constructor runs first to autowire beans");
    }

    @PostConstruct
    public void init(){
        System.out.println("the method with @PostConstruct runs just after constructor to initialise the beans");
    }

    @PreDestroy
    public void clean(){
        System.out.println("The method with @PreDestroy runs just before bean is being destroyed i.e removed from ioc container");
    }
}

@Component
class SomeDependency{

}

@ComponentScan
public class PrePostAnnotationsLauncherApplication {
    public static void main(String[] args){
        try(var context= new AnnotationConfigApplicationContext(PrePostAnnotationsLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); //prints name of all beans in ioc container
        }
    }
}
