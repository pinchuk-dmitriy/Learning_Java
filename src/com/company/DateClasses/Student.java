package com.company.DateClasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Student implements Serializable {
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

    public Student() {
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFamily() {
        return Family;
    }

    public void setFamily(String family) {
        Family = family;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public int getCourse() {
        return Course;
    }

    public void setCourse(int course) {
        Course = course;
    }

    public int getGroup() {
        return Group;
    }

    public void setGroup(int group) {
        Group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                yearOfBirth == student.yearOfBirth &&
                Course == student.Course &&
                Group == student.Group &&
                Objects.equals(Name, student.Name) &&
                Objects.equals(Family, student.Family) &&
                Objects.equals(Patronymic, student.Patronymic) &&
                Objects.equals(Address, student.Address) &&
                Objects.equals(PhoneNumber, student.PhoneNumber) &&
                Objects.equals(Faculty, student.Faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, Family, Patronymic, yearOfBirth, Address, PhoneNumber, Faculty, Course, Group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Family='" + Family + '\'' +
                ", Patronymic='" + Patronymic + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", Address='" + Address + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Faculty='" + Faculty + '\'' +
                ", Course=" + Course +
                ", Group=" + Group +
                '}';
    }

    public void printInformationAboutStudent(){
        System.out.println("Name: " + this.Name + "    Family: " + this.Family + "    Patronymic: " +
                this.Patronymic + "    dateOfBirth: " + this.yearOfBirth + "    Address: " + this.Address + "    PhoneNumber: " +
                this.PhoneNumber + "    Faculty: " + this.Faculty + "    Course: " + this.Course + "    Group: " + this.Group);
    }

    public static void listOfStudentsBirthDay(int pastYear, ArrayList<Student> arrayList){
        System.out.println("no");
    }
}
