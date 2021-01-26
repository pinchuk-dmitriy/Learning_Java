package com.company;

import com.company.HelpClasses.MenuInterface;
import com.company.HelpClasses.Student;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.beans.XMLEncoder;

public class Main {
    static ArrayList<Student> students = new ArrayList<Student>();
    public static void main(String[] args) {
        int commandNumber = 0;
        Scanner in = new Scanner(System.in);
/*
        Student newstud = new Student("Enter name: ","Enter name: ","Enter name: ",42,"Enter name: ","Enter name: ","Enter name: ",3,3);
        Student newstud2 = new Student("Enter name: ","Enter name: ","Enter name: ",42,"Enter name: ","Enter name: ","Enter name: ",3,3);
        System.out.println(newstud.equals(newstud2));
        System.out.println(Objects.deepEquals(newstud2, newstud));
        System.out.println(Objects.equals(newstud2, newstud));
        System.out.println(newstud.equals(newstud2));
        System.out.println(newstud == newstud2);
*/
        while(true){
            MenuInterface.menuText();
            commandNumber = in.nextInt();
            switch(commandNumber){
                case 1:{
                    createStudent();
                    break;
                }
                case 2:{
                    System.out.println("Enter, how faculty you need: ");
                    String needFaculty = in.next();
                    MenuInterface.listOfThisFaculty(needFaculty, students);
                    break;
                }
                case 3:{
                    System.out.println("Enter, how year you need: ");
                    int pastYear = in.nextInt();
                    MenuInterface.listOfStudentsBirthDay(pastYear,students);
                    break;
                }
                case 4:{
                    System.out.println("Enter, how group you need: ");
                    int needGroup = in.nextInt();
                    MenuInterface.listStudentOfGroup(needGroup,students);
                    break;
                }
                case 5:{
                    for (int i = 0; i < students.size(); i++) {
                        students.get(i).printInformationAboutStudent();
                    }
                    break;
                }
                case 6: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("This command does not exist");
                    break;
                }
            }
        }
    }
    private static void createStudent(){
        String Name;
        String Family;
        String Patronymic;
        int yearOfBirth;
        String Address;
        String PhoneNumber;
        String Faculty;
        int Course;
        int Group;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name: ");
        Name = in.next();
        System.out.println("Enter Family: ");
        Family = in.next();
        System.out.println("Enter Patronymic: ");
        Patronymic = in.next();
        System.out.println("Enter yearOfBirth: ");
        yearOfBirth = in.nextInt();

        System.out.println("Enter Address: ");
        Address = in.next();
        System.out.println("Enter PhoneNumber: ");
        PhoneNumber = in.next();
        System.out.println("Enter Faculty: ");
        Faculty = in.next();
        System.out.println("Enter Course: ");
        Course = in.nextInt();
        System.out.println("Enter Group: ");
        Group = in.nextInt();
        Student newStudent = new Student(Name,Family,Patronymic,yearOfBirth,Address,PhoneNumber,Faculty,Course,Group);
        students.add(newStudent);
        xmlEncoderFunction(newStudent);
    }
    public static void xmlEncoderFunction(Object obj){
        try(XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(
                new FileOutputStream("data/serial.xml")))) {
            xmlEncoder.writeObject(obj);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

