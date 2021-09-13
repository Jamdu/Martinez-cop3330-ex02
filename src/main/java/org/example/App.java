/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Martinez
 */

package org.example;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); //create scanner object
        System.out.println("What is the input string? ");

        String string = scnr.nextLine();
        int number = string.length();

        System.out.println(string + " has " + number + " characters.");
    }
}

