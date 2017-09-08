package com.arkansascodingacademy;

public class PetHotel
{
    private String[] petName = new String[10];

    public void checkIn(String name, int suiteNumber)
    {
        System.out.println("Checking in " + name + " to suite " + suiteNumber);
        petName[suiteNumber] = name;
    }

    public void checkOut(int suiteNumber)
    {
        System.out.println("Checkout not implemented yet.");
    }

}
