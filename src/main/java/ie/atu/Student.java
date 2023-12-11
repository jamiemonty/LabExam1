package ie.atu;

import java.util.Scanner;

public class Student {
    public String name;
    public int studentNum;
    public int age;
    public String address;


    public Student(){

    }
    public Student(String name, int studentNum, int age, String address) {
        this.name = name;
        this.studentNum = studentNum;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}


    public String getAddress() {return address;}

    public void setAddress(String address) {this.address = address;}

    /*public void getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        this.setName(scanner.nextLine());

        System.out.println("Enter Student Number: ");
        this.setStudentNum(scanner.nextInt());

        System.out.println("Enter address: ");
        this.setAddress(scanner.nextLine());

        System.out.println("Enter Student Age: ");
        this.setAge(scanner.nextInt());

    }

    public void displayInfo()
    {
        System.out.println("Name: " + this.getName());
    }*/

}
