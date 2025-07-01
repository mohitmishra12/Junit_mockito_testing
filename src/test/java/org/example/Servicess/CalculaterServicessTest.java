package org.example.Servicess;

import junit.framework.Assert;
import org.junit.jupiter.api.*;

public class CalculaterServicessTest {

    @BeforeAll
    public static void init(){
        System.out.println("welcome to Unit Testing Screen");
    }
//    @AfterEach
//    public void Afterachh(){
//        System.out.println("After test case");
//    }
//
//    @BeforeEach
//    public void BeforeEcahh(){
//        System.out.println("Before test case");
//    }

    @Test
    @DisplayName("this is our add method")
    public void addTwoNumberTest(){
        System.out.println("this is my add two number testing");
        int result = CalculaterServicess.addTwoNumber(12,34);
        int expected = 46;
        Assertions.assertEquals(expected,result,"test case fail");
    }

    @Test
    public void productTwoNumberTest(){
        System.out.println("this is my multi two number testing");
        int result = CalculaterServicess.productTwoNumber(12,12);
        int expected = 144;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void sumAnyNumberTest(){
        System.out.println("this is my Sum any number testing");
        int result = CalculaterServicess.sumAnyNumber(1,2,3,5,6);
        int expected = 17;
        Assertions.assertEquals(expected,result);
    }

    public void AddFlotValueTest(){
        System.out.println("this is my Float value test two number testing");
        float result = CalculaterServicess.AddFlotValue(12.50F, 12.50F);
        int expected = 50;
        Assertions.assertEquals(expected,result);
    }


    @AfterAll
    public static void Cleanup(){
        System.out.println("Our all test case are logic");
    }



}
