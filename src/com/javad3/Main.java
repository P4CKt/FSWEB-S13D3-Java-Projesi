package com.javad3;

public class Main {
    public static void main(String[] args) {

        Person kisi = new Person("Ömür", "Uslu", 25);

        System.out.println("Firstname: " + kisi.getFirstName());

        System.out.println("LastName: " + kisi.getLastName());

        System.out.println("Age: " + kisi.getAge());

        System.out.println("IsTeen: " + kisi.isTeen());

    }
}