package com.codedexterous.wildcards;

import java.util.ArrayList;
import java.util.List;

class Building {
    @Override
    public String toString() {
        return "Building";
    }
}

class Office extends Building {
    @Override
    public String toString(){
        return "Office";
    }
}

public class SubstitutionExample {

    public static void main(String[] args) {
        Building building = new Building();
        printing(building);

        // Substitution is applied here
        Office office = new Office();
        printing(office);

        List<Building> buildings = new ArrayList<>();
        buildings.add(new Building());
        buildings.add(new Office());
        listPrinting(buildings);

        // But this is not a valid
        List<Office> officies = new ArrayList<>();
        officies.add(new Office());
        officies.add(new Office());
        // listPrinting(officies); // Failed

    }

    static void printing(Building building) {
        System.out.println("I am a "+ building.toString());
    }

    static void listPrinting(List<Building> buildings) {
        buildings.forEach(System.out::println);
    }
    
}
