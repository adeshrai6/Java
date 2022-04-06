package com.example.project2;

public class House {

    //  Invariant of the House class:
    //    1. The instance variable address is the house address
    //    2. The instance variable price is the price of the house
    //    3. The instance variable area is the area of the house in square feet
    //    4. The instance variable numberOfBedrooms is the number of bed room of the house
    private String address;
    private int price;
    private int area;
    private int numberOfBedrooms;

    /*********************************************************************
     *
     *  Constructs the House object with address, price, area and number of the beds.
     * @param address
     *      the address of the house
     * @param price
     *      the price of the house
     * @param area
     *      the area of the house in square feet
     * @param numberOfBedrooms
     *      the number of the beds of the house
     *
     **********************************************************************/
    public House(String address, int price, int area, int numberOfBedrooms) {
        this.address = address;
        this.price = price;
        this.area = area;
        this.numberOfBedrooms = numberOfBedrooms;
    }

    /***********************************************************
     *  Accessor method to get the address of the house.
     * @return
     *  the address of the house
     ***********************************************************/

    public String getAddress() {
        return address;
    }

    /***********************************************************
     *  Modifier method to set the address of the house.
     * @param address
     *      the new address of the house
     ***********************************************************/

    public void setAddress(String address) {
        this.address = address;
    }

    /***********************************************************
     *  Accessor method to get the price of the house.
     * @return
     *  the price of the house
     ***********************************************************/

    public int getPrice() {
        return price;
    }

    /***********************************************************
     *  Modifier method to set the price of the house.
     * @param price
     *      the new price of the house
     ***********************************************************/

    public void setPrice(int price) {
        this.price = price;
    }

    /***********************************************************
     *  Accessor method to get the area of the house.
     * @return
     *  the area of the house
     ***********************************************************/

    public int getArea() {
        return area;
    }

    /***********************************************************
     *  Modifier method to set the area of the house.
     * @param area
     *      the new area of the house in the square feet
     ***********************************************************/

    public void setArea(int area) {
        this.area = area;
    }

    /***********************************************************
     *  Accessor method to get the number of beds of the house.
     * @return
     *  the number of the beds of the house
     ***********************************************************/

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    /***********************************************************
     *  Modifier method to set the number of the beds of the house.
     * @param numberOfBedrooms
     *      the new number of the beds of the house
     ***********************************************************/

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    /***********************************************************
     *  Boolean method checks if passed requirement meet's or not
     * @param r
     *      the requirement of the argument
     ***********************************************************/
    public boolean satisfies(Requirement r){
        if((r.getMinimumPrice() <= getPrice() && r.getMaximumPrice() >= getPrice()) && //check price of the house
                (r.getMinimumNumberOfBeds() <= getNumberOfBedrooms() && r.getMaximumNumberOfBeds() >= getNumberOfBedrooms()) && // check bedrooms
                (r.getMinimumArea() <= getArea() && r.getMaximumArea() >= getArea())){ //check area
            return true;
        }
        return false;
    }

    /***********************************************************
     *  The toString method returns the instance of House class
     * @return
     *      the string of address, price, area, and numberOfBedrooms
     ***********************************************************/
    @Override
    public String toString() {
        return "House: " +
                "address = " + address +
                ", price = $" + price +
                ", area = " + area +
                " sq ft, numberOfBedrooms = " + numberOfBedrooms;
    }
}
