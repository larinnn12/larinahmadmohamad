/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package larinahmadmohamad;

/**
 *
 * @author NANO-TECH
 */ 
import java.util.ArrayList;
import java.util.Scanner;
public class Property {
  

// Base class for all properties

    private double area;
    private int numberOfRooms;
    private String neighborhood;
    private double price;

    public Property(double area, int numberOfRooms, String neighborhood, double price) {
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.neighborhood = neighborhood;
        this.price = price;
    }

    public void display() {
        System.out.println("Area: " + area + " m2");
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Neighborhood: " + neighborhood);
        System.out.println("Price: $" + price);
    }
}

