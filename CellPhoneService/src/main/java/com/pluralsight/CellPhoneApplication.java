package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CellPhone phone = new CellPhone();
        CellPhone phone2 = new CellPhone();
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

        phone2.setSerialNumber(12345678);
        phone2.setModel("iPhone 16");
        phone2.setCarrier("Verizon");
        phone2.setPhoneNumber("987-654-3210");
        phone2.setOwner("Bob");


        phone.dial("855-555-2222");

        display(phone);
        System.out.println("--------------");
        display(phone2);

        phone.dial(phone2.getPhoneNumber());
        phone2.dial(phone.getPhoneNumber());
    }
    public static void display(CellPhone phone){
        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());
    }

}
