/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package larinahmadmohamad;

/**
 *
 * @author NANO-TECH
 */
public class FurnishedApartment  extends Property{
   
    private int furnitureQuality;

    public FurnishedApartment(double area, int numberOfRooms, String neighborhood, double price, int furnitureQuality) {
        super(area, numberOfRooms, neighborhood, price);
        this.furnitureQuality = furnitureQuality;
    }

    @Override
    public void display() {
        System.out.println("Type: Furnished Apartment");
        super.display();
        System.out.println("Furniture Quality: " + furnitureQuality + " (1=Best, 5=Worst)");
    }
}

