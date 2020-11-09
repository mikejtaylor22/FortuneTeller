package com.mikeJava;

public class Fortune {
    private Firstname firstname;
    private Lastname lastname;
    private Color color;
    private Age age;
    private Birth birth;
    private Siblings siblings;

    public Fortune(Firstname firstname, Lastname lastname, Color color, Age age, Birth birth, Siblings siblings) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.color = color;
        this.age = age;
        this.birth = birth;
        this.siblings = siblings;
    }

    public void getFortune(){
        String fname = firstname.getFirstName();
        String lname = lastname.getLastName();
        int ageCalc = age.getAge();
        double birthCalc = birth.getBirth();
        String sibString = siblings.getSiblings();
        String carCalc = color.getColor();

        System.out.println(fname + " " + lname + " will retire in " + ageCalc + " years with $" + birthCalc + " in the bank, a vacation home in " + sibString+ ", and travel by " + carCalc );
    }

}
