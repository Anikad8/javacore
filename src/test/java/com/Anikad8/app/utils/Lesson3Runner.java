package com.Anikad8.app.utils;

import com.Anikad8.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by Anika on 13.03.2017.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor get = new PrimitiveConvertor();
        float floatValue = 1.23f;
        int intValue = 80;
        char charValue = 'A';
        String methodResultString = get.floatToChar(floatValue);
        char methodResultChar = get.intToChar(intValue);
        int methodResultInt = get.charToInt(charValue);
        System.out.println("Input float value is " + floatValue + ". Output char value is " + methodResultString);
        System.out.println("Input float value is " + intValue + ". Output char value is " + methodResultChar);
        System.out.println("Input float value is " + charValue + ". Output char value is " + methodResultInt);

    }
}
