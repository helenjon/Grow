package com.epam.javar;

//Критерии валидности:
//        1) если номер начинается с '+', то он содержит 12 цифр
//        2) если номер начинается с цифры или открывающей скобки, то он содержит 10 цифр
//        3) может содержать 0-2 знаков '-', которые не могут идти подряд
//        4) может содержать 1 пару скобок '(' и ')' , причем если она есть, то она расположена левее знаков '-'
//        5) скобки внутри содержат четко 3 цифры
//        6) номер не содержит букв
//        7) номер заканчивается на цифру


import java.nio.file.Path;
import java.nio.file.Paths;

public class TestTwo {
    public static void main(String[] args){
        String t = "D:\\Penske\\hos-6321\\test\\Macros\\WheelScreen.rar";

        System.out.println(Paths.get(t).getFileName().toString().contains("test"));
    }


}
