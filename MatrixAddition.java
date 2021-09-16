// Read 2 matrices from the console and perform matrix addition

import java.util.Scanner;
import java.lang.Math;
public class MatrixAddition
{
public static void main(String[] args)
{
	Scanner x=new Scanner(System.in);
	int i,j;
	System.out.println("Enter the Number of Rows and Columns: ");
	int r=x.nextInt();
	int c=x.nextInt();
	int a[][]=new int[r][c];
	int b[][]=new int[r][c];
 	System.out.println("Enter Elements of First Matrix : ");

 	for(i=0;i<r;i++)
 {
   		for(j=0;j<c;j++)
   	{

     		a[i][j]=x.nextInt();
   	}
 }

 System.out.println("Enter Elements of Second Matrix : ");

 	for(i=0;i<r;i++)
 	{
   		for(j=0;j<c;j++)
   		{
    			 b[i][j]=x.nextInt();
   		}
 	}
 System.out.println("Elements of First Matrix are : ");

 	for(i=0;i<r;i++)
 	{
   		for(j=0;j<c;j++)
   		{
     			System.out.print(" "+a[i][j]);
  		}

   		System.out.println();
 	}

 System.out.println("Elements of Second Matrix are : ");
 	for(i=0;i<r;i++)
 	{
  	 	for(j=0;j<c;j++)
   		{
    	 		System.out.print(" "+b[i][j]);
   		}
   		System.out.println();
 	}
 System.out.println("Matrix After Addition : ");
 		for(i=0;i<r;i++)
 	{
   		for(j=0;j<c;j++)
   		{
     			System.out.print(" "+(a[i][j]+b[i][j]));
   		}
   		System.out.println();
 	}
}
}