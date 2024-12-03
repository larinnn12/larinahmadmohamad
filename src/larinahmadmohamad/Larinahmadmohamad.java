/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package larinahmadmohamad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NANO-TECH
 */
public class Larinahmadmohamad {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        RealEstateAgency agency = new RealEstateAgency();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" welcome to Real Estate Agency System \n please enter the following numbers correctly");
            System.out.println("1. Add Property");
            System.out.println("2. Remove Property");
            System.out.println("3. Display All Properties");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Select Property Type: 1. Villa  2. Apartment  3. Furnished Apartment");
                    int type = scanner.nextInt();

                    System.out.print("Enter area (m2): ");
                    double area = scanner.nextDouble();
                    System.out.print("Enter number of rooms: ");
                    int rooms = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter neighborhood name: ");
                    String neighborhood = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();

                    if (type == 1) {
                        System.out.print("Has swimming pool (true/false): ");
                        boolean hasPool = scanner.nextBoolean();
                        System.out.print("Enter number of adjacent streets: ");
                        int streets = scanner.nextInt();
                        agency.addProperty(new Villa(area, rooms, neighborhood, price, hasPool, streets));
                    } else if (type == 2) {
                        System.out.print("Enter floor number: ");
                        int floor = scanner.nextInt();
                        System.out.print("Has parking lot (true/false): ");
                        boolean hasParking = scanner.nextBoolean();
                        agency.addProperty(new Apartment(area, rooms, neighborhood, price, floor, hasParking));
                    } else if (type == 3) {
                        System.out.print("Enter furniture quality (1-5): ");
                        int quality = scanner.nextInt();
                        agency.addProperty(new FurnishedApartment(area, rooms, neighborhood, price, quality));
                    } else {
                        System.out.println("Invalid type");
                    }
                    break;

                case 2:
                    System.out.print("Enter the property index that you want to remove: ");
                    int index = scanner.nextInt() - 1; 
                    agency.removeProperty(index);
                    break;

                case 3:
                    agency.displayAllProperties();
                    break;

                case 4:
                    System.out.println("thanks for using our system ");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

  