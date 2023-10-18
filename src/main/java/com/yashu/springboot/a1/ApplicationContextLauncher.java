package com.yashu.springboot.a1;

import com.yashu.springboot.a1.a0.BusinessCalculationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan //if we dont specify package path, then spring will try to find bean in the current package and since a0 is a subpackage, it will be able to find the beans we require
public class ApplicationContextLauncher {
    public static void main(String[] args){
        try(var context= new AnnotationConfigApplicationContext(ApplicationContextLauncher.class)){
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
