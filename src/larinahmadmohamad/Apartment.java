/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package larinahmadmohamad;

/**
 *
 * @author NANO-TECH
 */
public class Apartment extends Property{
  
    private int floorNumber;
    private boolean hasParkingLot;

    public Apartment(double area, int numberOfRooms, String neighborhood, double price, int floorNumber, boolean hasParkingLot) {
        super(area, numberOfRooms, neighborhood, price);
        this.floorNumber = floorNumber;
        this.hasParkingLot = hasParkingLot;
    }

    @Override
    public void display() {
        System.out.println("Type: Apartment");
        super.display();
        System.out.println("Floor Number: " + floorNumber);
        System.out.println("Has Parking Lot: " + (hasParkingLot ? "Yes" : "No"));
    }
}

