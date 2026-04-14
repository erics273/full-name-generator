package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        //create a scanner
        Scanner input = new Scanner(System.in);

        //ask for the first name
        System.out.println("Please enter your name");
        System.out.print("First Name: ");

        //store the first name
        String firstName = input.nextLine();

        //ask for the middle name
        System.out.print("Middle Initial: ");

        //store the middle initial
        String middleInital = input.nextLine();

        //ask for the last name
        System.out.print("Last Name: ");

        //store the middle initial
        String lastName = input.nextLine();

        //ask for the suffix
        System.out.print("Suffix: ");

        //store the middle initial
        String suffix = input.nextLine();

        //printing to prove i can collect the data
        //System.out.println(firstName + " " + middleInital + " " + lastName + " " + suffix);

        String fullName = firstName;

        //if the middile initial is not blank, concat it to fullName
        if( !middleInital.isBlank() ){
            fullName += " " + middleInital + ".";
        }

        fullName += " " + lastName;

        //if the suffix is not blank, concat it to fullName
        if( !suffix.isBlank() ){
            fullName += ", " + suffix;
        }


        //display the fully generated name
        System.out.println(fullName);



    }

}
