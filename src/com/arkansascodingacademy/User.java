package com.arkansascodingacademy;

import java.util.Scanner;

public class User
{
    Scanner scanner = new Scanner(System.in);

    public String getInput(String prompt)
    {
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input;
    }

    public int getInt(String prompt)
    {
        System.out.print(prompt);
        String input = scanner.nextLine();

        int number = Integer.parseInt(input);
        return number;
    }
}
