package com.yashu.springboot.a1.a0;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sql")
public class MySqlService implements DataService{
    public int[] retrieveData() {
        return new int[]{1,2,3,4,5};
    }
}
