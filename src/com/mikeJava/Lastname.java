package com.mikeJava;

import java.util.Scanner;

public class Lastname {

    Scanner scanner = new Scanner(System.in);

    public Lastname() {

    }

    public String getLastName(){
        System.out.println("What is your last name? ");
        String lastName = scanner.nextLine().toLowerCase();
        if(lastName.equals("quit")){
            System.out.println("Nobody likes a quitter...");
            System.exit(0);
        }
        return lastName;
    }
}
