package com.Anikad8.app.classwork.lesson3;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Anika on 15.03.2017.
 */
public class MathFuncTest {
    @Test
    public void multiplyTest(){
        int a = 1;
        int b = 2;
        MathFunc mathFunc = new MathFunc();
        int actualResult = mathFunc.multiply(a, b);
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void addTest(){
        int c = 10;
        int d = 20;
        MathFunc mathFunc = new MathFunc();
        int actualResult = mathFunc.add(c, d);
        int expectedResult = 30;
        Assert.assertEquals(expectedResult, actualResult);
    }
}
