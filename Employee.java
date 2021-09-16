/*
Program to create a class for Employee having attributes eNo, eName eSalary. Read n employ information and Search for an employee given eNo, using the concept 
of Array of Objects.
*/

import java.util.Scanner;
public class Employee 
{
 	int eno;
 	String ename;
 	float esalary;

public void Data() 

	{
  		Scanner in = new Scanner(System.in);
 		System.out.print("Enter the eno : ");
		eno = in.nextInt();
  		System.out.print("Enter the ename : ");
  		ename = in.next();
  		System.out.print("Enter the esalary : ");
  		esalary = in.nextFloat();
 	}
 
public void display() 
{
  System.out.println("Employee id : " + eno);
  System.out.println("Employee name : " + ename);
  System.out.println("Employee salary : " + esalary);
 }
 
public static void main(String[] args) 
{

	int n,id;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number of Employees : ");
	n=sc.nextInt();
	Employee e[] = new Employee[n];

for(int i=0; i<n; i++)
  {
   
	e[i] = new Employee();
   	e[i].Data();
  }

  System.out.println("Enter the ID to Search");
  id=sc.nextInt();
  System.out.println();
  System.out.println("____Employees Details____");
  for(int i=0; i<n; i++)
 	{
   		if(e[i].eno==id)
   		e[i].display();
   		else
   		{
     			System.out.println("ID not Found");
   		}
  	}
 }
}
