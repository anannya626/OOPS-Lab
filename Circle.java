/* Create a class Circle with fields x co-ordinate, y co-ordinate and radius , Also having member functions area() and circumference(). Write a program to compute the circumference and 
area of the circle when user enters the centre and radius of the circle. */

import java.util.Scanner;
public class Circle
{

		double r;
		public double cir()

	{
		return 2*3.14*r;
	}

	public double area()

	{
		return 3.14*r*r;
	}

    	public static void main(String[] args) 

    	{
    		Scanner sc= new Scanner(System.in) ;
    		Circle aCircle;
		aCircle=new Circle();
		System.out.print("Enter the Radius : ");
		aCircle.r=sc.nextInt();
		double ar=aCircle.area();
		double cir=aCircle.cir();
		System.out.println("Area of Circle : "+ar);
		System.out.println("Circumference  of Circle : "+cir);
       
	}
    
}