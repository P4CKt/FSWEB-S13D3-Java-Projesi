package com.javad3;

public class Person {
    String firstname;
    String lastname;
    int age;

    String gozrenk;
    int maas;

    String sacrenk;

    public  Person( String firstname,String lastname,int age){
        this.firstname= firstname;
        this.lastname= lastname;
        this.age= age;

    }
    public  Person(String firstname,String lastname,int age,String gozrenk,int maas,String sacrenk){
        this(firstname,lastname,age);
        this.gozrenk= gozrenk;
        this.maas= maas;
        this.sacrenk= sacrenk;

    }
    public String getFirstName(){
        return firstname;
    }
    public String getLastName (){
        return lastname ;
    }
    public int getAge  (){
        return age ;
    }
    public boolean isTeen(){
        if( age >13 && age< 19){
            return true;
        }
        else {
            return false;
        }
    }

}
