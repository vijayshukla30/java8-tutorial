package com.codedexterous;

public class Program1 {
    int num1 = 0;
    static int num2 = 0;

    Program1() {
        num1++;
        num2++;
        System.out.println("num1 = " + num1 + " ,num2 = " + num2);
    }

    public static void main(String[] args) {
        Program1 program1 = new Program1();
        System.out.println("program1 " + program1.num1 + " " + program1.num2);
        Program1 program2 = new Program1();
        System.out.println("program2 " + program2.num1 + " " + program2.num2);
        Program1 program3 = null;
        System.out.println("Need not to create object to call static variable program3 " + program3.num2);
        Program1 program4;
        program4 = new Program1();
        System.out.println("program4 " + program4.num1 + " " + program4.num2);
    }
}
