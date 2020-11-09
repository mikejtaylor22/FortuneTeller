package com.mikeJava;

import java.util.Scanner;

public class Age {
    Scanner scanner = new Scanner(System.in);
    private int retirement;

    public Age(){

    }

    public int getAge(){
        System.out.println("What is your age? ");
        String age = scanner.nextLine().toLowerCase();

        if(age.equals("quit")){
            System.out.println("Nobody likes a quitter...");
            System.exit(0);
        } else if(!age.equals("quit")) {
            int x = Integer.parseInt(age);
            if(x % 2 == 0){
                retirement = 20;

            } else if(x % 2!=0) {
                retirement = 16;

            }
        }
        return retirement;
    }
}
