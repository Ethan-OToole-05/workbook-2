package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservationsApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Initialize variables, and accept user inputs.
        String inputName, firstName, lastName, inputDate, clear;
        int tickets;
        DateTimeFormatter formatter;

        System.out.println("Welcome to The Theater!");
        System.out.print("Please enter your name for reservation: ");
        inputName = input.nextLine();
        System.out.print("Please enter the date you will be coming (MM/dd/yyyy)");
        inputDate = input.nextLine().trim();
        System.out.print("How many tickets would you like? ");
        tickets = input.nextInt();

        clear = input.nextLine();

        //Accept full name and break it down to first and last name.
        String[] names = inputName.split(" ");
        firstName = names[0];
        lastName = names[1];

        //formatter to accept how the date and time should be formatted.
        formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
        LocalDate reservationDate = LocalDate.parse(inputDate, formatter);

        //Print out the result to the console.
        if(tickets == 1) {
            System.out.println("1 ticket reserved for " + reservationDate + " under " + lastName + ", " + firstName);
        }
        else {
            System.out.println(tickets + " tickets reserved for " + reservationDate + " under " + lastName + ", " + firstName);
        }



    }
}
