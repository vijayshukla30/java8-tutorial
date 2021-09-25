package com.codedexterous.wildcards;

import java.util.ArrayList;
import java.util.List;

class Building2 {
    public int numberOfRooms = 7;
    @Override
    public String toString(){
        return "Building";
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms){
        this.numberOfRooms = numberOfRooms;
    }
}


class Office2 extends Building2 {
    @Override
    public String toString() {
        return "Office";
    }
}

class House extends Building2 {
    public int numberOfRooms = 10;
    @Override
    public String toString(){
        return "House";
    }

    public int getNumberOfRooms(){
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms){
        this.numberOfRooms = numberOfRooms;
    }
}



public class SubstitutionExample2 {

    public static void main(String[] args) {
        System.out.println("---------- Buildings -------------");
        List<Building2> buildings = new ArrayList<>();
        buildings.add(new Building2());
        buildings.add(new Building2());
        printBuildings(buildings);

        System.out.println("---------- Officies -------------");
        List<Office2> officies = new ArrayList<>();
        officies.add(new Office2());
        officies.add(new Office2());
        printBuildings(officies);

        System.out.println("---------- Houses -------------");
        List<House> houses = new ArrayList<>();
        houses.add(new House());
        houses.add(new House());
        printBuildings(officies);
    }
 
    static void printBuildings(List<? extends Building2> buildings) {
        buildings.forEach(building-> System.out.println(building.toString()));
    }

    static void addHouseToList(List<? super House> houses){
        houses.add(new House());
    }
    
}
