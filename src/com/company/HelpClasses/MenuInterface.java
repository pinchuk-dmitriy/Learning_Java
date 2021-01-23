package com.company.HelpClasses;

import java.util.ArrayList;

public class MenuInterface {
    public static void menuText() {
        System.out.println("1 - создать студента ");
        System.out.println("2 - список студентов заданного факультета ");
        System.out.println("3 - список студентов, родившихся после заданного года ");
        System.out.println("4 - список учебной группы ");
        System.out.println("5 - показать список ");
        System.out.println("6 - close ");
        System.out.println("Enter your command: ");
    }
    public static void listOfThisFaculty(String needFaculty, ArrayList<Student> arrayList){
        for (Student obj: arrayList) {
            if(obj.Faculty.equals(needFaculty)){
                obj.printInformationAboutStudent();
            }
        }
    }

    public static void listOfStudentsBirthDay(int pastYear, ArrayList<Student> arrayList){
        for (Student obj: arrayList) {
            if(obj.yearOfBirth <= pastYear){
                obj.printInformationAboutStudent();
            }
        }
    }
    public static void listStudentOfGroup(int needGroup, ArrayList<Student> arrayList){
        for (Student obj: arrayList) {
            if(obj.Group == needGroup){
                obj.printInformationAboutStudent();
            }
        }
    }

}
