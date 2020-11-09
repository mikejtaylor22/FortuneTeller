package com.mikeJava;
import java.util.Scanner;

public class Firstname {

    Scanner scanner = new Scanner(System.in);

    public Firstname() {

    }

    public String getFirstName() {
        System.out.println("What is your first name? ");
        String firstName = scanner.nextLine().toLowerCase();
        if(firstName.equals("quit")){
            System.out.println("Nobody likes a quitter...");
            System.exit(0);
        }
        return firstName;
    }
}
