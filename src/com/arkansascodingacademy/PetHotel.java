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
        System.out.println("Checking out pet " + petName[suiteNumber] + " in suite " + suiteNumber);
        petName[suiteNumber] = null;
        System.out.println("Checking out pet in suite " + suiteNumber);
    }

    public void list()
    {
        System.out.println("Here are the pets checked in:");
        for(String name : petName)
        {
            System.out.println(name);
        }
    }

    public void show(int suiteNumber)
    {
        System.out.println("Showing pet in suite " + suiteNumber);
        System.out.println("Pet in suite " + suiteNumber + " is " + petName[suiteNumber]);
    }

    public void count()
    {
        int count= 0;
        for(String name: petName)
        {
            if(name != null)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
