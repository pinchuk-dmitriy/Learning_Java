package com.company.HelpClasses;

public class Student {
    int id = 0;
    String Name;
    String Family;
    String Patronymic;
    int yearOfBirth;
    String Address;
    String PhoneNumber;
    String Faculty;
    int Course;
    int Group;
    public Student(String name, String family, String patronymic, int dateBirth, String address, String phone, String faculty, int course, int group) {
        this.id = id + 1;
        Name = name;
        Family = family;
        Patronymic = patronymic;
        yearOfBirth = dateBirth;
        Address = address;
        PhoneNumber = phone;
        Faculty = faculty;
        Course = course;
        Group = group;
    }
    public void printInformationAboutStudent(){
        System.out.println("Name: " + this.Name + "    Family: " + this.Family + "    Patronymic: " +
                this.Patronymic + "    dateOfBirth: " + this.yearOfBirth + "    Address: " + this.Address + "    PhoneNumber: " +
                this.PhoneNumber + "    Faculty: " + this.Faculty + "    Course: " + this.Course + "    Group: " + this.Group);
    }
}
