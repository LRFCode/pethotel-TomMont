package com.arkansascodingacademy;

//TODO BRONZE Add command to checkout pet by suite number    checkout 2
//TODO BRONZE Add command to show all pets                   list
//TODO BRONZE Add command to show pet in specified suite     show 4
//TODO BRONZE Add command to show count of suites occupied   count

//TODO SILVER Add command to checkout pet by name                    checkoutbyname spot
//TODO SILVER Add command to move pet from one position to another   move 2 4
//            reject if pet in the way
//TODO SILVER Add command to swap two suites                         swap 1 3

//TODO GOLD Add command to shift all pets right one position and     shiftright
//          move rightmost pet to first position
//TODO GOLD Add command to shift all pets left one position and      shiftleft
//          move leftmost pet to last position

public class HotelManager
{
    private User user = new User();
    private PetHotel hotel = new PetHotel();

    public void executeUserCommands()
    {
        String command = "";

        do
        {
            //get input from user and puts it in one big string
            command = user.getInput("Please enter command: ");
            executeUserCommand(command);
        } while (!command.equals("exit"));
    }

    private void executeUserCommand(String command)
    {
        //split the big string into one string per word
        String word[] = command.split(" ");

        String instruction = word[0];

        if (instruction.equals("checkin"))
        {
            String petName = word[1];
            int suiteNumber = Integer.parseInt(word[2]);
            hotel.checkIn(petName, suiteNumber);
        } else if (instruction.equals("checkout"))
        {
            int suiteNumber = Integer.parseInt(word[1]);
            hotel.checkOut(suiteNumber);
        } else if (instruction.equals("list"))
        {
            hotel.list();
        } else if (instruction.equals("show"))
        {
            int suiteNumber = Integer.parseInt(word[1]);
            hotel.show(suiteNumber);
        } else if (instruction.equals("count"))
        {
            hotel.count();
        }

    }

    public static void main(String[] args)
    {
        HotelManager hotelManager = new HotelManager();
        hotelManager.executeUserCommands();
    }
}
