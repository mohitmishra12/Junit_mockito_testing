package org.example.Servicess;

import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculaterServicessTest {

    @Test
    public void addTwoNumberTest(){
        int result = CalculaterServicess.addTwoNumber(12,34);
        int expected = 46;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void productTwoNumberTest(){
        int result = CalculaterServicess.productTwoNumber(12,12);
        int expected = 144;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void sumAnyNumberTest(){
        int result = CalculaterServicess.sumAnyNumber(1,2,3,5,6);
        int expected = 17;
        Assertions.assertEquals(expected,result);
    }

    public void AddFlotValueTest(){
        float result = CalculaterServicess.AddFlotValue(12.50F, 12.50F);
        int expected = 50;
        Assertions.assertEquals(expected,result);
    }

}
