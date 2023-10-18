package com.yashu.springboot.a1.a0;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {

    DataService dataService;

    //Constructor based autowiring (no need for annotation)
    public BusinessCalculationService(@Qualifier("sql") DataService dataService){ // if we dont write qualifier, bean of mongoDB will be autowired
        this.dataService= dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
