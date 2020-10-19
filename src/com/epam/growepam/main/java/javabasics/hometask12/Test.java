package javabasics.hometask12;

import java.util.HashMap;
import java.util.Map;


public class Test {

    static final Map<Integer, String> Maptest = new HashMap<>();

    static {

        Maptest.put(0, "ноль");
        Maptest.put(1, "one");
        Maptest.put(2, "two");
        Maptest.put(3, "tree");
        Maptest.put(4, "ноль");
        Maptest.put(5, "ноль");
        Maptest.put(6, "ноль");
        Maptest.put(7, "ноль");
        Maptest.put(8, "ноль");
        Maptest.put(9, "ноль");
        Maptest.put(10, "ноль");
        Maptest.put(11, "ноль");
        Maptest.put(12, "ноль");
    }


    public static void main(String[] args) {

        String testt = "Это стоит 1 бакс, а вот это - 12 .";
        String[] line = testt.split(" ");

        for (String ll : line) {
            if (ll.matches("\\d+")) {
                System.out.println(ll);
                if (Maptest.containsKey(Integer.valueOf(ll))) ll = Maptest.get(Integer.valueOf(ll));
                System.out.println(ll);
            }

        }


    }

}
