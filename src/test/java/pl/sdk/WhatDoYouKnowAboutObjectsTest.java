package pl.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WhatDoYouKnowAboutObjectsTest {

@Test
    void testInt(){
    //given
    int x1 = 1;
    int x2 = 1;

    Integer o1 = 1;
    Integer o2 = 1;

    //then
    assertTrue(x1==x2);
    assertTrue(x1==o1);
    assertTrue(o1.equals(o2));


}

}
