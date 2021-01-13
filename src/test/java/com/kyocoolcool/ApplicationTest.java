package com.kyocoolcool;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApplicationTest {
    @Test
     void test() {
        Assertions.assertEquals( 2 + 3 , 5);
    }
}
