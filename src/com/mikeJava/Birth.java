package com.mikeJava;

import java.util.Scanner;

public class Birth {
    Scanner scanner = new Scanner(System.in);
    private double bankBalance;

    public Birth(){

    }

    public double getBirth(){
        System.out.println("What is your birth month(as a number)? ");
        String y = scanner.nextLine().toLowerCase();

        if(y.equals("quit")){
            System.out.println("Nobody likes a quitter..");
            System.exit(0);
        } else if (!y.equals("quit")){
            int birthMonth = Integer.parseInt(y);
            if(birthMonth > 0 && birthMonth <= 4) {
                bankBalance = 256000.76;
            } else if(birthMonth > 4 && birthMonth <=8){
                bankBalance = 3687105.42;
            } else if (birthMonth >8 && birthMonth <= 12){
                bankBalance = 86.23;
            } else {
                bankBalance = 0.00;
            }

        }
        return this.bankBalance;
    }
}
