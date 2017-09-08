package com.arkansascodingacademy;

public class Main
{

    public static void main(String[] args)
    {
        String name[] = new String[5];  //0 - 4

        name[0] = "Inky";
        //name[1] = "Blinky";
        name[2] = "Pinky";
        name[3] = "Clyde";
        name[4] = "Sue";

        System.out.println(name[2]);

        int ghostNumber = 3;
        System.out.println(name[ghostNumber] + " is at position " + ghostNumber);

        ghostNumber++;
        System.out.println(name[ghostNumber] + " is at position " + ghostNumber);

        ghostNumber -= 3;
        System.out.println(name[ghostNumber] + " is at position " + ghostNumber);

        System.out.println("The ghosts are:");
        //for each ghost in name
        for (String ghost : name)
        {
            if (ghost == null)
            {
                System.out.println("No ghost here!");

            }
            else
            {
                System.out.println(ghost);
            }
        }

        System.out.println("The ghosts are:");

        //for (init; test; change)
        for (int i = 0; i < 5; i++)
        {
            System.out.println(name[i] + " is at position " + i);
        }

        System.out.println("The ghosts in reverse order are:");

        for (int i = 4; i >= 0; i--)
        {
            System.out.println(name[i] + " is at position " + i);
        }

        System.out.println("Put Bob where Clyde is");
        name[3] = "Bob";
        System.out.println(name[3]);

        System.out.println("Get rid of Bob");
        name[3] = null;
        System.out.println(name[3]);

    }
}
