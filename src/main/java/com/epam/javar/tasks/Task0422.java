package com.epam.javar.tasks;

import java.util.Date;
import java.util.Locale;

public class Task0422 {

    public static void main(String[] args) {
        //formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d")
        //   // -> " d  c  b  a"
        System.out.println(String.format(Locale.FRANCE, getFormattedString(), 20.0 / 7.0, 10.0 / 3.0));
            //должен быть вывод
            //20 / 7 = 2,86
            //Exp = 3,33e+00
        }
      //  %[argument_index$][flags][width][.precision]conversion
        public static String getFormattedString() {
            return "20 / 7 = %,.2f %n Exp = %.2e";
        }

}
