package com.epam.javacodeconvention.hometask6;


import java.util.Collections;

//import com.sun.xml.internal.ws.util.StringUtils;

public class Decoder {

    public static void main(String[] args) {

        //    "2. Create a decoder for a previous task. " +
        //     For example:

        // Input string: 4A3a6B\\\1\2
        // Output string: AAAAaaaBBBBBB\12
        // Make sure to validate an input string and throw an unchecked exception in case of validation failure.
        // For example: 4A3a6B\\1\2 should not pass the validation and throw an exception"

        // \12,A2,\1a,\\1a

        //[0-9].

        String input = "4A\\\\\\\\1a6B\\1\\2";
        String output = "";


        // reverting from number to abc
        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i, i + 1).matches("[0-9]") && input.substring(i + 1, i + 2).matches("[a-z,A-Z]")) {
                output = output + String.join("", Collections.nCopies(Integer.parseInt(input.substring(i, i + 1)), input.substring(i + 1, i + 2)));
            }
            if (input.substring(i, i + 1).matches("\\\\")) {
                int count = 1;
                while (i < input.length() - 1 && input.substring(i, i + 1) == "\\") {
                    count++;
                    i++;
                }
                if (count == 1) {
                    output = output + input.substring(i, i + 1) + input.substring(i + 1, i + 2);
                    i++;
                }
            }
        }
        System.out.println(output);

        for (int i = 0; i < output.length(); i++) {
            if (output.substring(i, i + 1).matches("\\\\")) {
                int count = 1;
                while (i < input.length() - 1 && input.substring(i, i + 1) == "\\") {
                    count++;
                    i++;
                }

            }
        }


        // remove \\
        String rez = "";
        for (int i = 0; i < output.length(); i++) {
            if (output.substring(i, i + 1).matches("[0-9a-zA-Z]")) {
                rez = rez + output.substring(i, i + 1);
            }
            int count = 0;
            if (output.substring(i, i + 1).matches("\\\\") && !output.substring(i + 1, i + 2).matches("[0-9]")) {
                count++;
                i++;
            }
            if (count == 1) rez = rez + "\\";

        }
        System.out.println(rez);


    }

}
