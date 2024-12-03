/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package larinahmadmohamad;

import java.util.ArrayList;

/**
 *
 * @author NANO-TECH
 */
public class RealEstateAgency {
    private ArrayList<Property> properties = new ArrayList<>();
    private static final int MAX_PROPERTIES = 100;

    public void addProperty(Property property) {
        if (properties.size() < MAX_PROPERTIES) {
            properties.add(property);
            System.out.println("Property added successfully!");
        } else {
            System.out.println("Cannot add more properties. Maximum limit reached.");
        }
    }

    public void removeProperty(int index) {
        if (index >= 0 && index < properties.size()) {
            properties.remove(index);
            System.out.println("Property removed successfully!");
        } else {
            System.out.println("Invalid index!");
        }
    }

    public void displayAllProperties() {
        if (properties.isEmpty()) {
            System.out.println("No properties available.");
        } else {
            for (int i = 0; i < properties.size(); i++) {
                System.out.println("Property " + (i + 1) + ":");
                properties.get(i).display();
                System.out.println();
            }
        }
    }
}
