package com.mikeJava;

public class Main {

    public static void main(String[] args) {

	Firstname firstname = new Firstname();
	Lastname lastname = new Lastname();
	Color color = new Color();
	Age age = new Age();
	Birth birth = new Birth();
	Siblings siblings = new Siblings();
	Fortune fortune = new Fortune(firstname, lastname, color, age, birth, siblings);

	fortune.getFortune();
    }
}
