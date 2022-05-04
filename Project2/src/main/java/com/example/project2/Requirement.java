package com.example.project2;

public class Requirement {
    // Invariant of the Requirement class:
    //  1. The instance variable minimumPrice is the minimum price of the house
    //  2. The instance variable maximumPrice is the maximum price of the house
    //  3. The instance variable minimumArea is the minimum area of the house
    //  4. The instance variable maximumArea is the maximum area of the house
    //  5. The instance variable minimumNumberOfBeds is the minimum number of beds
    //  6. The instance variable maximumNumberOfBeds is the maximum number of beds
    private int minimumPrice;
    private int maximumPrice;
    private int minimumArea;
    private int maximumArea;
    private int minimumNumberOfBeds;
    private int maximumNumberOfBeds;


    /*********************************************************************
     *
     *  Constructs the Requirement object with like minimum-maximum Price, minimum-maximum Area, minimum-maximum Beds about House
     * @param minimumPrice
     *      the minimum price of the house
     * @param maximumPrice
     *      the maximum price of the house
     * @param minimumArea
     *      the minimum area of the house in square feet
     * @param maximumArea
     *      the maximum area of the house
     * @param minimumNumberOfBeds
     *      the minimum number of the beds
     * @param maximumNumberOfBeds
     *      the maximum number of the beds
     *
     **********************************************************************/
    public Requirement(int minimumPrice, int maximumPrice, int minimumArea, int maximumArea, int minimumNumberOfBeds, int maximumNumberOfBeds) {
        this.minimumPrice = minimumPrice;
        this.maximumPrice = maximumPrice;
        this.minimumArea = minimumArea;
        this.maximumArea = maximumArea;
        this.minimumNumberOfBeds = minimumNumberOfBeds;
        this.maximumNumberOfBeds = maximumNumberOfBeds;
    }

    /***********************************************************
     *  Accessor method to get the minimum price of the house.
     * @return
     *  the minimum price
     ***********************************************************/
    public int getMinimumPrice() {
        return minimumPrice;
    }

    /***********************************************************
     *  Accessor method to get the maximum price of the house.
     * @return
     *  the maximum price of the house
     ***********************************************************/
    public int getMaximumPrice() {
        return maximumPrice;
    }

    /***********************************************************
     *  Accessor method to get the minimum area of the house.
     * @return
     *  the minimum area of the house
     ***********************************************************/
    public int getMinimumArea() {
        return minimumArea;
    }

    /***********************************************************
     *  Accessor method to get the maximum area of the house.
     * @return
     *  the maximum area of the house
     ***********************************************************/
    public int getMaximumArea() {
        return maximumArea;
    }

    /***********************************************************
     *  Accessor method to get the minimum beds of the house.
     * @return
     *  the minimum price of the house
     ***********************************************************/
    public int getMinimumNumberOfBeds() {
        return minimumNumberOfBeds;
    }

    /***********************************************************
     *  Accessor method to get the maximum beds of the house.
     * @return
     *  the maximum beds of the house
     ***********************************************************/
    public int getMaximumNumberOfBeds() {
        return maximumNumberOfBeds;
    }
}
