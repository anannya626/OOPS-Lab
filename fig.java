package graphics;

import java.util.Scanner;

        interface areafigure 
	{

        	void tri();
        	void rect();
        	void sqr();
        	void cir();
	}

    public class fig

{
        		Scanner reader=new Scanner(System.in);
        		public void tri()

		{
		System.out.print("\n Enter the Breadth and Height of Triangle:  ");
            		float b=reader.nextFloat();
            		float h=reader.nextFloat();
            		System.out.print("The Area of Triangle is: "+(0.5*(b*h)));
        		}
	
       public void rect()

	{
            		System.out.print("\n\n Enter the Length and Breadth of Rectangle:  ");
            		float l=reader.nextFloat();
            		float b=reader.nextFloat();
            		System.out.print("The Area of Rectangle is: "+(l*b));
        	}
        public void sqr()

	{
            		System.out.print("\n\n Enter the Side of Square:  ");
            		float s=reader.nextFloat();
            		System.out.print("The Area of Square is: "+(s*s));
        	}
       public void cir() 
	{
            		System.out.print("\n\n Enter the Radius of Circle:  ");
            		float r = reader.nextFloat();
            		System.out.print("The Area of Circle is: " + (3.14 * r * r));
        	}
}

