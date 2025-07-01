package org.example.Servicess;

public class CalculaterServicess {

    public static int addTwoNumber(int a, int b){
        return a + b;

    }
    public static int productTwoNumber(int a , int b){
        return a * b;

    }
    public static double dividTwoNumber(int a, int b){
        return a / b;
    }
    public static int sumAnyNumber(int ...numbers){
        int s=0;
        for(int n: numbers){
            s += n;
        }
        return s;

    }
    public static float AddFlotValue(float a, float b){
        return a + b;
    }

}
