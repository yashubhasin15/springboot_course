package com.yashu.springboot.JakartaCDI;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@Named // @Named is same as @Component
class BusinessService{
    private DataService dataService;

    @Inject // @Inject is same as @Autowired
    public void setDataService(DataService dataService) {
        System.out.println("Inject annotation autowired DataService");
        this.dataService = dataService;
    }
}

@Named // @Named is same as @Component
class DataService{

}

@ComponentScan
public class JakartaCdiLauncherApplication {
    public static void main(String[] args){
        var context= new AnnotationConfigApplicationContext(JakartaCdiLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
