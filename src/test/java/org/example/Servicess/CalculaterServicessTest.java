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

}
