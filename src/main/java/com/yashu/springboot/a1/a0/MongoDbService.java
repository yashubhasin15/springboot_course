package com.yashu.springboot.a1.a0;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbService implements DataService {
    public int[] retrieveData() {
        return new int[]{6,7,8,9,0};
    }
}
