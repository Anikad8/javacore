package com.Anikad8.app.utils.convertors;

/**
 * Created by Anika on 14.03.2017.
 */
public class PrimitiveConvertor {
    public String floatToChar(float value){
        String line = Float.toString(value);
        //System.out.println("Input float value is " + value + ". Output char value is " + line);
        return line;
    }
    public char intToChar(int value){
        char number = (char) value;
        //System.out.println("Input float value is " + value + ". Output char value is " + number);
        return number;

    }
    public int charToInt(char value){
        int sign = (int)value;
        System.out.println("Input float value is " + value + ". Output char value is " + sign);
        return sign;
    }

}
