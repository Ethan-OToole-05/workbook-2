package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CellPhone phone = new CellPhone();
        String phoneModel, phoneCarrier, phoneNumber, phoneOwner, clear;
        int serialNumber;

        System.out.print("What is the serial number? ");
        serialNumber = input.nextInt();
        phone.setSerialNumber(serialNumber);

        clear = input.nextLine();

        System.out.print("What model is the phone? ");
        phoneModel = input.nextLine();
        phone.setModel(phoneModel);

        System.out.print("Who is the carrier? ");
        phoneCarrier = input.nextLine();
        phone.setCarrier(phoneCarrier);

        System.out.print("What is the phone number? ");
        phoneNumber = input.nextLine();
        phone.setPhoneNumber(phoneNumber);
        
        System.out.print("Who is the owner of the phone?");
        phoneOwner = input.nextLine();
        phone.setOwner(phoneOwner);

        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());
    }
}
