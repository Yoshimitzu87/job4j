package ru.job4j.collecion;


import java.util.HashSet;


public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<String>();
        autos.add("LADA");
        autos.add("BMW");
        autos.add("VOLVO");
        autos.add("TOYOTA");
        autos.add("RENO");
        autos.add("VOLVO");
        for (String auto : autos){
            System.out.println(auto);
        }
    }
}
