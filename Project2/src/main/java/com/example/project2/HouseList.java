package com.example.project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HouseList {
    //  Invariant of the HouseList class:
    //      1. The instance variable houseList is the List with house object
    ArrayList<House> housesList = new ArrayList<>();

    /*********************************************************************
     *
     *  Constructs the HouseList object with address, price, area and number of the beds from passed data.
     * @param fileName
     *      the name of the file where the list of House data is stored
     *
     **********************************************************************/
    public HouseList(String fileName){
        Scanner scanner;
        String tempAddress;
        int tempPrice;
        int tempArea;
        int tempBeds;
        try {
            scanner = new Scanner(new File(fileName)); //Read file using scanner
            while (scanner.hasNext()){
                tempAddress = scanner.next(); //get address form data
                tempPrice = scanner.nextInt(); //get price from data
                tempArea = scanner.nextInt(); //git area from data
                tempBeds = scanner.nextInt(); //get beds from data

                housesList.add(new House(tempAddress, tempPrice, tempArea, tempBeds)); // Put house in house list
            }
            scanner.close();
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("The name of the file is not found");
        }
    }

    /***********************************************************
     *  Accessor method to get the requirement for of the House.
     * @return
     *  the information like minimum-maximum Price, minimum-maximum Area, minimum-maximum Beds about House
     ***********************************************************/
    public String getHouses(Requirement r){
        return "Minimum Price: " + r.getMinimumPrice() + "Maximum Price: " + r.getMaximumPrice() + "Minimum Area: " + r.getMinimumArea()
                + "Maximum Area: " + r.getMaximumArea() + "Minimum Beds: " + r.getMinimumNumberOfBeds() + "Maximum Beds: " + r.getMaximumNumberOfBeds();
    }

    /***********************************************************
     *  Accessor method that prints the list of House if it meets the requirement.
     * @param r
     *      the requirement of the house like minimum-maximum Price, minimum-maximum Area, minimum-maximum Beds about House.
     ***********************************************************/
    public String printHouses(Requirement r){
        String house = " ";
        for (int i = 0; i < housesList.size(); i++) {
            if(housesList.get(i).satisfies(r)) // check if houseList satisfies given requirement
            {
                house = housesList.get(i) + " ";// print every house that is satisfies given requirement
            }
        }
        return house;
    }


    public String printAnotherHouse(Requirement r){
        String house = " ";
        for (int i = 0; i < housesList.size(); i++) {
            if(housesList.get(i).satisfies(r)) // check if houseList satisfies given requirement
            {
                int randomHouse = (int)(Math.random() * (housesList.size() - 1));
                house = housesList.get(randomHouse) + " ";// print every house that is satisfies given requirement
            }
        }
        return house;
    }

}
