package com.pluralsight;

import java.util.Scanner;

public class VehicleApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        Vehicle vehicle3 = new Vehicle();
        Vehicle vehicle4 = new Vehicle();
        Vehicle vehicle5 = new Vehicle();
        Vehicle vehicle6 = new Vehicle();

        vehicle1.setVehicleId(101121);
        vehicle1.setMakeModel("Ford Explorer");
        vehicle1.setColor("Red");
        vehicle1.setOdometerReading(45000);
        vehicle1.setPrice(13500);

        vehicle2.setVehicleId(101122);
        vehicle2.setMakeModel("Toyota Camry");
        vehicle2.setColor("Blue");
        vehicle2.setOdometerReading(60000);
        vehicle2.setPrice(11000);

        vehicle3.setVehicleId(101123);
        vehicle3.setMakeModel("Chevrolet Malibu");
        vehicle3.setColor("Black");
        vehicle3.setOdometerReading(50000);
        vehicle3.setPrice(9700);

        vehicle4.setVehicleId(101124);
        vehicle4.setMakeModel("Honda Civic");
        vehicle4.setColor("White");
        vehicle4.setOdometerReading(70000);
        vehicle4.setPrice(7500);

        vehicle5.setVehicleId(101125);
        vehicle5.setMakeModel("Subaru Outback");
        vehicle5.setColor("Green");
        vehicle5.setOdometerReading(55000);
        vehicle5.setPrice(16000);

        vehicle6.setVehicleId(101126);
        vehicle6.setMakeModel("Jeep Wrangler");
        vehicle6.setColor("Yellow");
        vehicle6.setOdometerReading(30000);
        vehicle6.setPrice(16000);

        System.out.println("What do you want to do? ");
        System.out.println(" 1 - List all vehicles");
        System.out.println(" 2 - Search by make/model ");
        System.out.println(" 3 - Search by price range ");
        System.out.println(" 4 - Search by color ");
        System.out.println(" 5 - Add a vehicle ");
        System.out.println(" 6 - Quit");
        System.out.print("Enter your command please: ");
        int command = input.nextInt();

        //Should be 20 changed to 6 for testing.
        Vehicle[] vehicles = new Vehicle[6];
        vehicles[0] = vehicle1;
        vehicles[1] = vehicle2;
        vehicles[2] = vehicle3;
        vehicles[3] = vehicle4;
        vehicles[4] = vehicle5;
        vehicles[5] = vehicle6;


        switch (command){
            case 1:
                listAllVehicles(vehicles);
            case 2:
                //find vehicles by model method.
            case 3:
                //find vehicles by price.
            case 4:
                //find vehicles by color.
            case 5:
                //add a vehicle method.
            case 6:
                return;


        }

    }
    public static void listAllVehicles(Vehicle[] vehicles) {
        for(Vehicle vehicle: vehicles) {
            vehicle.display(vehicle);
        }
    }
    public static void findVehiclesByPrice(float price) {

    }
}
