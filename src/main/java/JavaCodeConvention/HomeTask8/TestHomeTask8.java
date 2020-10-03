package JavaCodeConvention.HomeTask8;

//"Using a HashMap class create an application which allows to find a citizen by a passport serial number and series. "
//"Create two classes – Citizen with name and surname and Passport with series and number.
// Passport class will be uses as a key for HashMap and the Citizen will be used as a value"


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;


public class TestHomeTask8 {

    private HashMap<Passport, Citizen> people ;

    private static String fromReader = null;


    public static void main (String [] args){

        HashMap<Citizen, Passport> people = new HashMap<>();
        people.put(new Citizen("Series1", "000001"), new Passport("Name1", "Surname1"));
        people.put(new Citizen("Series2", "000002"), new Passport("Name2", "Surname2"));
        people.put(new Citizen("Series3", "000003"), new Passport("Name3", "Surname3"));
        people.put(new Citizen("Series4", "000004"), new Passport("Name4", "Surname4"));

        System.out.println("please enter series and number of password");
        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            fromReader = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String finalFromReaded = fromReader;
        people.forEach((k, v) -> {
            if ((k.series + k.number).equals(finalFromReaded))
                System.out.println(v.name + " " + v.surname);
        });
    }
}
