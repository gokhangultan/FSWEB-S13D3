package org.example;


public class Person {
    String firstName;
    String lastName;
    int age;
    String eyeColor;
    int metaAge;
    String job;


    public Person (String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person (String firstName, String lastName, int age, String job, String eyeColor, int metaAge){
        this(firstName,lastName,age);
        this.eyeColor = eyeColor;
        this.metaAge = metaAge;
        this.job = job;

    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }
    public boolean isTeen(){
return this.age>=13 && this.age<19;
    }


    public String toString(){
        return "Person Info " + " " + this.firstName + " " + this.lastName + " " + this.age + " " + this.metaAge + " " + this.eyeColor;
    }
}

