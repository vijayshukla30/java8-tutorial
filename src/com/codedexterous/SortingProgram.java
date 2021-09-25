package com.codedexterous;

import java.util.*;
import java.util.stream.Collectors;

class Emp implements Comparable<Emp>{
    public String firstName;
    public String lastName;
    public long age;
    public long salary;

    public Emp(String firstName, String lastName, long age, long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public int compareTo(Emp o) {
        return age > o.age ? 1 : (age == o.age ? 0 : -1);
    }

    public String toString() {
        return firstName + " " + lastName + " age: " + age + " salary: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("1");
        if (o == this) {
            System.out.println("2");
            return true;
        }

        System.out.println("3");
        if (!(o instanceof Emp)) {
            System.out.println("4");
            return false;
        }
        System.out.println("5");

        Emp em = (Emp) o;
        System.out.println("6");

        return salary == em.salary
                && age == em.age
                && firstName.equals(em.firstName)
                && lastName.equals(em.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, salary);
    }
}

class EmpSorting implements Comparator<Emp> {
    @Override
    public int compare(Emp o1, Emp o2) {
        int compareSalary = Long.compare(o1.salary, o2.salary);
        int compareAge = Long.compare(o1.age, o2.age);
        int compareFirstName = o1.firstName.compareTo(o2.firstName);
        int compareLastName = o1.lastName.compareTo(o2.lastName);

        if (compareSalary == 0) {
            if (compareAge == 0) {
                if (compareFirstName == 0) {
                    return compareLastName;
                }
                return compareFirstName;
            }
            return compareAge;
        }
        return compareSalary;

    }
}

public class SortingProgram {

    public static void main(String[] args) {
        List<Emp> emps = new ArrayList<Emp>();
        emps.add(new Emp("Vijay", "Shukla", 33, 10000));
        emps.add(new Emp("Ali", "Tanwir", 30, 10000));
        emps.add(new Emp("Gaurav", "Gupta", 34, 110000));
        emps.add(new Emp("Surabhi", "Dikshit", 26, 5000));
        emps.add(new Emp("Surabhi", "Dikshit", 26, 5000));
        emps.add(new Emp("Saurabh", "Dikshit", 43, 1000));


        //Sorting on the basis of age
        Collections.sort(emps);
        emps.forEach(System.out::println);


        System.out.println("____________________________");
        //Sorting on multiple fields
        Collections.sort(emps, new EmpSorting());
        emps.forEach(System.out::println);


        System.out.println("Sorting");
        Comparator<Emp> comparing = Comparator.comparing(Emp::getSalary)
                .thenComparing(Emp::getAge)
                .thenComparing(Emp::getFirstName)
                .thenComparing(Emp::getLastName);


        List<Emp> empSet = emps.stream().distinct().sorted(comparing).collect(Collectors.toList());
        empSet.forEach(emp -> System.out.println(emp.getFirstName()));
    }
}
