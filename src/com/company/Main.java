package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    /**
     * City деген класс тузунуз. (code, name, ...)
     * Эгерде code так сан болсо TreeSetke салыныз.
     * Аларды чонунан кичинесине караган тартипте чыгарыныз.
     */
    public static void main(String[] args) {

        Set<City>city = new HashSet<>();
        city.add(new City(1,"Cалам"));
        city.add(new City(2,"Привет"));
        city.add(new City(3,"Hello"));
        city.add(new City(4,"你好"));
        city.add(new City(5,"Hallo"));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
        city.forEach(System.out::println);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");

        Set<City>set = new TreeSet<>();
        for(City c: city){
            if(c.getCode()%2==1){
                set.add(c);
            }
        }
        set.forEach(System.out::println);
    }
}
