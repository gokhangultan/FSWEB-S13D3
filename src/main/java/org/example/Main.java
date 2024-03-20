package org.example;



public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 20);
        Person person2 = new Person("John", "Doe", 20,"Software Engineer", "Blue", 18 );
        Person person3 = new Person("Gokhan", "Gokhan", 2, "Student", "Blue", 20);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);




        Wall wall = new Wall(5, 4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }




}
