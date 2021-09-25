
package com.codedexterous;

import java.util.ArrayList;
import java.util.List;

public class GenericTestOne {
    static Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
    static Integer[] intArray = {10, 30, 23, 83, 85, 17};
    static Boolean[] boolArray = {true, false, true,true,false};


    public static List arrayToListWithoutGeneric(Object[] array, List<Object> list){
        for(Object obj: array){
            list.add(obj);
        }
        return list;
    }

    public static <T> List<T> arrayToListWithGeneric(T[] array, List<T> list){
        for(T obj: array){
            list.add(obj);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println("Implementation without using Generics");
        List<Character> characters = arrayToListWithoutGeneric(charArray, new ArrayList<>());
        List<Integer> intList = arrayToListWithoutGeneric(intArray, new ArrayList<>());
        List<Boolean> boolList = arrayToListWithoutGeneric(boolArray, new ArrayList<>());
        
        // Below line will not throw Compile Time Error but will throw Run Time Error
        // This can be fixed with Generics
        // If we use wrong input aaray then it will throw Compile Time Error
        List<Boolean> boolListWrongInputArr = arrayToListWithoutGeneric(intArray, new ArrayList<>());

        characters.forEach(System.out::println);
        intList.forEach(System.out::println);
        boolList.forEach(System.out::println);

        System.out.println("Implementation with Generics");
        List<Character> characters1 = arrayToListWithGeneric(charArray, new ArrayList<>());
        List<Integer> intList1 = arrayToListWithGeneric(intArray, new ArrayList<>());
        List<Boolean> boolList1 = arrayToListWithGeneric(boolArray, new ArrayList<>());

        characters1.forEach(System.out::println);
        intList1.forEach(System.out::println);
        boolList1.forEach(System.out::println);

    }

}
