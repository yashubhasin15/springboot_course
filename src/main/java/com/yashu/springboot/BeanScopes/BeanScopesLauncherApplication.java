package com.yashu.springboot.BeanScopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class SingletonClass{ // By default, every bean is singleton i.e only 1 bean will be created (stateless beans)

}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass{ // We have set this bean as prototype i.e a new bean will be created on every request (stateful beans)

}

@ComponentScan
public class BeanScopesLauncherApplication {
    public static void main(String[] args){
        try(var context= new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)){
            // Since SingletonClass is singleton (by default), the same object will be printed
            System.out.println(context.getBean(SingletonClass.class));
            System.out.println(context.getBean(SingletonClass.class));
            System.out.println(context.getBean(SingletonClass.class));

            // Since PrototypeClass is prototype, a new object will be created on every call
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
        }
    }
}
