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

    public void checkOutByName(String searchName)
    {
        for (int i = 0; i <= petName.length; i++)
        {
            if (searchName.equalsIgnoreCase(petName[i]))
            {
                System.out.println("Found " + searchName);
                petName[i] = null;
            }
        }
    }


    public void list()
    {
        System.out.println("Here are the pets checked in:");
        for (String name : petName)
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
        int count = 0;
        for (String name : petName)
        {
            if (name != null)
            {
                count++;
            }
        }
        System.out.println("There are " + count + " pets checked in.");
    }

    public void walk(int suiteNumber)
    {
        System.out.println(petName[suiteNumber] + " is being walked");
    }

    public void move(int suiteNumber1, int suiteNumber2)
    {
        if (petName[suiteNumber2] == null)
        {
            System.out.println("Moving " + petName[suiteNumber1] + " from " + suiteNumber1 + " to " + suiteNumber2);
            petName[suiteNumber2] = petName[suiteNumber1];
            petName[suiteNumber1] = null;
        } else
        {
            System.out.println("HEYO, THERES A DOG HERE");

        }

    }
    public void swap(int suiteNumber1, int suiteNumber2)
    {
        petName[suiteNumber2] 
    }
}
