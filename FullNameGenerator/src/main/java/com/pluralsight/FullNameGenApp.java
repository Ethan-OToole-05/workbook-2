package com.pluralsight;

import java.util.Scanner;

public class FullNameGenApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Initialize our variables, accept inputs, and remove spacing.
        String firstName, lastName, middleName, suffix;
        System.out.print("Please enter your first name: ");
        firstName = input.nextLine().trim();

        System.out.print("Please enter your middle name: ");
        middleName = input.nextLine().trim();

        System.out.print("Please enter your last name: ");
        lastName = input.nextLine().trim();

        System.out.print("Please enter your suffix (if applicable)");
        suffix = input.nextLine().trim();

        //Different checks to print out the user's name differently.
        //Else we just print out the full name with suffix.
        if (suffix.isEmpty() && middleName.isEmpty()) {
            System.out.println(firstName + " " + lastName);
        } else if (suffix.isEmpty() && !middleName.isEmpty()) {
            System.out.println(firstName + " " + middleName + " " + lastName);
        } else if (middleName.isEmpty() && !suffix.isEmpty()) {
            System.out.println(firstName + " " + lastName + ", " + suffix);
        } else {
            System.out.println(firstName + " " + middleName + " " + lastName + ", " + suffix);
        }


    }
}
