package JavaBasics.HomeTask8;

//6. Write a Java program to answer about the statistical information such as arithmetic mean, median, mode, and standard
//        deviation of an integer data set. The data set should be defined as an integer array. For example: int[] data =
//        {206,430,73,30,293,322,42,36,447,229}"


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test {
    public static void main(String[] arg) {
        int[] input = {5, 10, 15, 20};
        System.out.println("arithmeticMean  = " + arithmeticMean(input));
        System.out.println("median  = " + median(input));
        System.out.println("mode  = " + mode(input));
        System.out.println("standardDeviation  = " + standardDeviation(input));
    }


    public static double arithmeticMean(int[] input) {
        double sum = 0.0;
        for (int number : input) sum = sum + number;
        return sum / input.length;
    }


    public static double median(int[] input) {
        Arrays.sort(input);
        if (input.length % 2 != 0) return input[input.length / 2];
        else return (input[(input.length / 2) - 1] + input[(input.length / 2)]) / 2.0;
    }

    public static String mode(int[] input) {
        List asList = new ArrayList();
        for (int s : input) asList.add(s);
        //  temp mode number
        int number = (int) asList.get(0);
        // so save just uniqe numbers
        Set<Integer> rezMode = new HashSet<>();
        int count = 1;

        for (int s : input) {
            if (Collections.frequency(asList, s) > count) {
                number = s;
                count = Collections.frequency(asList, s);

            }
        }
        // rezMode set - in case there is more then 1 mode value;
        for (int s : input) {
            if (Collections.frequency(asList, s) == count) {
                rezMode.add(s);
            }
        }
        if (count == 1) return "no mode";
        else return Arrays.toString(rezMode.toArray());
    }


    public static double standardDeviation (int [] input) {
        //calculate mean of array.
        double total = Arrays.stream(input).sum();
        double mean = total /input.length;
        // for check System.out.println(mean);
        double[] output = new double[input.length];
        for (int i=0; i<input.length; i++){
            output[i] = Math.pow((input[i] - mean), 2);
        // for check    System.out.println(output[i]);
        }
        //   calculate sum of the new array
        total = Arrays.stream(output).sum();
        //for check System.out.println(total);
        //divide the sum by the array length > square root it
        double  rezz = Math.sqrt(total/output.length);
        return  rezz;
    }
}



