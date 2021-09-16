/* Program to create a class Student having attributes name, roll, branch, mark, grade of datatype String, integer, array of character, double/float, character respectively. 
Read the student information and display the same. */

import java.util.Scanner;
class Student {
    public static void main(String[] args) {
String name;
int roll;
String branch;
char grade;
double mark;
Scanner reader=new Scanner(System.in);

System.out.print("Enter Student Name : ");
name= reader.nextLine();
System.out.print("Enter Roll Number : ");
roll=reader.nextInt();
System.out.print("Enter Branch : ");
branch=reader.next();
System.out.print("Enter Student Mark : ");
mark=reader.nextDouble();
System.out.print("Enter Student Grade : ");
grade=reader.next().charAt(0);

System.out.println("\nStudent Details:\nName: "+name+"\nRoll Number: "+roll+
"\nBranch Name: "+branch+"\nMArk : "+mark+"\nGrade: "+grade);

}
}