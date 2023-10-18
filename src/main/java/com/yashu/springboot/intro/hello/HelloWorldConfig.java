package com.yashu.springboot.intro.hello;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){};

record Address(String firstLine, String city){};
@Configuration
public class HelloWorldConfig {

    @Bean
    public String name(){
        return "Yashu";
    }

    @Bean
    public int age(){
        return 21;
    }

    @Bean
    @Primary
    public Person person(){
        return new Person("Ravi",20,new Address("#1165, Fountain Chowk","Rajpura"));
    }

    @Bean (name= "person2")
    public Person personByMethodCall(){
        return new Person(name(),age(),address());
    }

    @Bean(name= "person3")
    public Person personByParameters(String name,int age, Address address2) { // these params are name of beans (sensitive). incase name doesn't match, the bean with Primary Annotation is autowired
        return new Person(name,age,address2);
    }

    @Bean(name= "person4")
    public Person personByParameterQualifier(String name,int age,@Qualifier("address1") Address add) { // here since there is no bean named add, address2 would have been autowired, but since we used Qualifier to identify address1, it will be autowired
        return new Person(name,age,add);
    }

    @Bean
    @Qualifier("address1")
    public Address address(){
        return new Address("#300-R, Model Town","Yamunanagar");
    }

    @Bean
    @Primary
    public Address address2(){
        return new Address("#1165, Fountain Chowk","Rajpura");
    }
}
