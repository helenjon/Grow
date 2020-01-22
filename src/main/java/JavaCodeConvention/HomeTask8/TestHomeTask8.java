package JavaCodeConvention.HomeTask8;

//"Using a HashMap class create an application which allows to find a citizen by a passport serial number and series. "
//"Create two classes – Citizen with name and surname and Passport with series and number.
// Passport class will be uses as a key for HashMap and the Citizen will be used as a value"


import java.util.HashMap;
import java.util.concurrent.Callable;

public class TestHomeTask8 {

    private HashMap<Passport, Citizen> people ;


    public static void main (String [] args){

        HashMap people = new HashMap<Passport, Citizen>();
        people.put(new Passport("Name1", "Surname1"),new Citizen("Series1", 000001));
        people.put(new Passport("Name2", "Surname2"),new Citizen("Series2", 000002));
        people.put(new Passport("Name3", "Surname3"),new Citizen("Series3", 000003));
        people.put(new Passport("Name4", "Surname4"),new Citizen("Series4", 000004));

        


    }






}
