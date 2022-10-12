package com.epam.rd.at.java_collections.dynamic_array;

import java.util.Scanner;

public class DynamicArrayDemo {

    public static void main(String[] args) {
        int num1 = 0;
        int entree;
        DynamicArray<Integer> array = new DynamicArray<>();
        Scanner reader = new Scanner(System.in);
        char op;
        while (num1 != 99) {
            System.out.println("What would you like to do? Enter 99 to end");
            System.out.println("Press 1 to add an entree to database");
            num1 = reader.nextInt();
            switch(num1) {
                case 1:
                    System.out.println("Please type our your entree");
                    entree = reader.nextInt();
                    array.addElement(entree);
                    System.out.println("Your database:");
                    System.out.println(array);
                    break;
                case 99:
                    break;
                default: System.out.println("Error! Enter correct operator");
                    break;
            }
        }
        System.out.println("Program ended");
        System.out.println("Database: " + array);

    }
}
