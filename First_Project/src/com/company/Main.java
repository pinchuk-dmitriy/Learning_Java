package com.company;

public class Main {

    public static void main(String[] args) {
        Person kate = new Person("Kate", 32, "Baker Street");
        kate.displayName();     // норм, метод public
        kate.displayAge();      // норм, метод имеет модификатор по умолчанию
        //kate.displayAddress();  // ! Ошибка, метод private
        Chelik chel = new Chelik("Dima", 19, "miroshnichenko 3B", "Pinchuk Dmitriy");
        chel.displayInfo();
    }
}
class Person{

    String name;
    public int age;
    public String address;

    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void displayName(){
        System.out.printf("Name: %s \n", name);
    }
    void displayAge(){
        System.out.printf("Age: %d \n", age);
    }
    private void displayAddress(){
        System.out.printf("Address: %s \n", address);
    }
}
class Chelik extends Person{
    String full_name;
    public Chelik(String name, int age, String address, String Family){
        super(name, age, address);
        full_name = name + " " + Family;
    }
    public void displayInfo(){
        System.out.printf("Name:" + name+ " " + "Age:"+  age + " " + "Address:" +  address + " " + "Fullname:" + full_name);
    }
}
