package com.mikeJava;

import java.util.Scanner;

public class Color {
    Scanner scanner = new Scanner(System.in);
    private boolean validColor = false;
    private String car;

    public Color(){

    }

    public String getColor(){
        do {
            System.out.println("What is your favorite ROYGBIV color? (type HELP for assistance)");
            String favoriteColor = scanner.nextLine().toLowerCase();
            if(favoriteColor.equals("quit")) {
                System.out.println("Nobody likes a quitter...");
                System.exit(0);
            }
            else if(favoriteColor.equals("red")){
                validColor = true;
                car = "Delorean";
            } else if(favoriteColor.equals("orange")){
                validColor = true;
                car = "Camero";
            } else if(favoriteColor.equals("yellow")){
                validColor = true;
                car = "taxi";
            } else if(favoriteColor.equals("green")){
                validColor = true;
                car = "Chariot";
            } else if (favoriteColor.equals("blue")){
                validColor = true;
                car = "Kia";
            } else if (favoriteColor.equals("indigo")){
                validColor = true;
                car = "Motor Scooter";
            } else if(favoriteColor.equals("violet")){
                validColor = true;
                car = "Ferrari";
            } else if (favoriteColor.equals("help")){
                System.out.println("ROYGBIV stands for Red, Orange, Yellow, Green, Blue, Indigo, and Violet. Please type one of these colors");
            } else {
                System.out.println("Invalid color");
            }
        }while (!validColor);
        return car;
    }
}
