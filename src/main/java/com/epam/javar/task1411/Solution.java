package com.epam.javar.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        Boolean key = true;


        while( key )
        {
            String line = reader.readLine();
            if (line.equals("user") || line.equals("loser")  || line.equals("coder")  || line.equals("proger") ){
                doWork(personBuilder(line));
            }
            else key = false;
        }

    }

    public static void doWork(Person person) {
        switch(person.getClass().getSimpleName()){
            case "User": ((Person.User) person).live(); break;
            case "Loser": ((Person.Loser) person).doNothing(); break;
            case "Coder":  ((Person.Coder) person).writeCode(); break;
            default:((Person.Proger) person).enjoy(); break;
        }
    }

    private static Person personBuilder(String line){
        switch(line){
            case "user": return  new Person.User();
            case "loser":  return  new Person.Loser();
            case "coder":  return  new Person.Coder();
            default: return  new Person.Proger();
        }
    }
}
