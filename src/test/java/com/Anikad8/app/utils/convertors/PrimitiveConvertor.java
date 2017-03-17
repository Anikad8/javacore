package com.Anikad8.app.utils.convertors;

/**
 * Created by Anika on 14.03.2017.
 */
public class PrimitiveConvertor {
    public String floatToChar(float value){
        String line = Float.toString(value);
        return line;
    }
    public char intToChar(int value){
        char number = (char) value;
        return number;

    }
    public int charToInt(char value){
        int sign = (int)value;
        return sign;
    }

}
