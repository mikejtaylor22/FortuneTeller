package com.mikeJava;

import java.util.Scanner;

public class Siblings {
    Scanner scanner = new Scanner(System.in);
    private String location;

    public Siblings(){

    }

    public String getSiblings(){
        System.out.println("How many siblings do you have? ");
        String sibString = scanner.nextLine().toLowerCase();
        if(sibString.equals("quit")){
            System.out.println("Nobody likes a quitter..");
            System.exit(0);
        } else if(!sibString.equals("quit")){
            int siblings = Integer.parseInt(sibString);
            if(siblings < 0){
                location = "Chernobyl, Ukraine";
            } else if(siblings == 0){
                location = "Thailand";
            } else if (siblings  == 1){
                location = "Honolulu, Hawaii";
            } else if (siblings == 2){
                location = "South Korea";
            } else if (siblings == 3){
                location = "Portland, Oregon";
            } else if (siblings > 3){
                location = "San Diego, California";
            }

        }
        return this.location;
    }
}
