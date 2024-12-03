/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package larinahmadmohamad;

/**
 *
 * @author NANO-TECH
 */
public class Villa extends Property{
  
    private boolean hasSwimmingPool;
    private int numberOfAdjacentStreets;

    public Villa(double area, int numberOfRooms, String neighborhood, double price, boolean hasSwimmingPool, int numberOfAdjacentStreets) {
        super(area, numberOfRooms, neighborhood, price);
        this.hasSwimmingPool = hasSwimmingPool;
        this.numberOfAdjacentStreets = numberOfAdjacentStreets;
    }

    @Override
    public void display() {
        System.out.println("Type: Villa");
        super.display();
        System.out.println("Has Swimming Pool: " + (hasSwimmingPool ? "Yes" : "No"));
        System.out.println("Number of Adjacent Streets: " + numberOfAdjacentStreets);
    }
}

