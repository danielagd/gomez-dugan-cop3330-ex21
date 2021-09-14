package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */
public class NumToNames
{
    public static void main( String[] args )
    {
        // Program to display the corresponding calendar month of the user's input
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of the month: ");
        int month = input.nextInt();

        getMonth(month);
    }

    // Program connecting the number and corresponding month
    public static void getMonth(int month)
    {
        switch(month) {
            case 1:
                System.out.print("The name of the month is January.");
                break;
            case 2:
                System.out.print("The name of the month is February.");
                break;
            case 3:
                System.out.print("The name of the month is March.");
                break;
            case 4:
                System.out.print("The name of the month is April.");
                break;
            case 5:
                System.out.print("The name of the month is May.");
                break;
            case 6:
                System.out.print("The name of the month is June.");
                break;
            case 7:
                System.out.print("The name of the month is July.");
                break;
            case 8:
                System.out.print("The name of the month is August.");
                break;
            case 9:
                System.out.print("The name of the month is September.");
                break;
            case 10:
                System.out.print("The name of the month is October.");
                break;
            case 11:
                System.out.print("The name of the month is November.");
                break;
            case 12:
                System.out.print("The name of the month is December.");
                break;
            default:
                System.out.print("Sorry, that was an invalid choice.");
        }
    }

}
