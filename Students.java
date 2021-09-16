/* Program to create a class Student having attributes name, roll, branch, mark, grade of datatype String, integer, array of character, double/float, character respectively. 
Read the student information and display the same. */

import java.util.Scanner;
class Students 
{
    public static void main(String[] args) 
	
	{
		String name;
		int roll,i;
		char[] branch;
		double mark;
		char grade;


		Scanner reader=new Scanner(System.in);
		System.out.print("Enter Student Name : ");
		name= reader.nextLine();
		System.out.print("Enter Roll Number : ");
		roll=reader.nextInt();
		System.out.print("Enter Branch Name : ");
		branch=reader.next().toCharArray();
		System.out.print("Enter Student Mark : ");
		mark=reader.nextDouble();
		System.out.print("Enter Student Grade : ");
		grade=reader.next().charAt(0);

		System.out.println("\n\nStudent Details:\nName: "+name+"\nRoll Number: "+roll+"\nBranch Name: ");

		for(i=0;i<branch.length;i++)

		System.out.print(branch[i]);
		System.out.print("\nMark : "+mark+"\nGrade: "+grade);

	}
}