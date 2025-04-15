package com.pluralsight;

import java.util.Scanner;

public class FullNameParserApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inputName, clear;
        int option;

        System.out.println("Welcome to the full name parser!");
        System.out.println("Did you want to do (1)First Last Name? Or (2)First Middle Last?");
        System.out.print("Please enter your choice: ");
        option = input.nextInt();

        clear = input.nextLine();

        if(option == 1){
            System.out.print("Please enter your name: ");
            inputName = input.nextLine();
            String[] names = inputName.split(" ");
            if(names.length >= 3) {
                System.out.println("Please only first and last name in this format. Please try again.");
            }
            else {
                System.out.println("First name: " + names[0]);
                System.out.println("Last name: " + names[1]);
            }

        } else if (option == 2) {
            System.out.print("Please enter your name: ");
            inputName = input.nextLine();
            String[] names = inputName.split(" ");
            System.out.println("First name: " + names[0]);
            System.out.println("Middle name: " + names[1]);
            System.out.println("Last name: " + names[2]);

        }
    }
}
