/* 3. Create a class ‘Employee’ with data members Empid, Name, Salary, Address and constructors to initialize the data members. Create another class ‘Teacher’ that inherit the properties 
of class employee and contain its own data members department, Subjects taught and constructors to initialize these data members and also include display function to display all the data 
members. Use array of objects to display details of N teachers. */

import java.util.Scanner;
class Employee

{
 	int empid;
 	String name;
 	float salary;
 	String address;
 	
Employee()

 	{
  		empid=0;
  		name="";
  		salary=0;
  		address="";
 	}

 	void input()

 	{

  		Scanner in = new Scanner(System.in);
  		System.out.print("Enter the Employee Id : ");
  		empid = in.nextInt();
  		System.out.print("Enter the Name : ");
  		name = in.next();
  		System.out.print("Enter the Salary : ");
  		salary = in.nextFloat();
  		System.out.print("Enter the Address : ");
  		address = in.next();
 	}
}

class Teacher extends Employee

{

 	String dept,sub;

 	Teacher()

 	{

  		dept="";
  		sub="";
 	}

 	void data()

 	{

  		Scanner reader = new Scanner(System.in);
  		System.out.print("Enter the Department : ");
  		dept=reader.next();
  		System.out.print("Enter the Subject : ");
  		sub=reader.next();
 	}

 	 void display()

 	{

   		System.out.println("Employee id = " + empid);
   		System.out.println("Employee name = " + name);
   		System.out.println("Employee salary = " + salary);
   		System.out.println("Employee department = " + dept);
   		System.out.println("Employee subject = " + sub);
 	}

public static void main(String[] args)

   {
   		int n;
   		Scanner reader=new Scanner(System.in);
   		System.out.println("Enter the number of Employees : ");
   		n=reader.nextInt();
   		Teacher t[] = new Teacher[n];

   	for(int i=0; i<n; i++)

   	{

    		t[i] = new Teacher();
    		t[i].input();
    		t[i].data();
    		System.out.println();
   	}

   	System.out.println("---Employee Details---");
	
   	for(int i=0; i<n; i++)

   	{
    		t[i].display();
    		System.out.println();
   	}
   }
}