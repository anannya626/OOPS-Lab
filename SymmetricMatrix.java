// Read a matrix from the Console and check whether it is Symmetric or Not.

import java.util.Scanner;
public class SymmetricMatrix
{
public static void main(String[] args)
  {
 		Scanner x=new Scanner(System.in);
 		int i,j,count=0;
 		System.out.println("Enter the Number of Rows and Columns : ");
 		int r=x.nextInt();
 		int c=x.nextInt();
 		int a[][]=new int[r][c];
 		int b[][]=new int[r][c];
 		System.out.println("Enter the Elements of Matrix : ");

 	for(i=0;i<r;i++)
 	{
   		for(j=0;j<c;j++)
   		{
     		a[i][j]=x.nextInt();
   		}
 	}

 	System.out.println("Elements of the Matrix are : ");
 	for(i=0;i<r;i++)
 	{
   		for(j=0;j<c;j++)
   		{
     		System.out.print(" "+a[i][j]);
   		}
   		System.out.println();
 	}

 	if(r==c)
     {
//Transpose of a Matrix
	
	for(i=0;i<r;i++)
 	{
   		for(j=0;j<c;j++)
   		{
     			b[i][j]=a[j][i];
   		}			
 	}
 	System.out.println("Transpose");
 	for(i=0;i<r;i++)
 	{
   		for(j=0;j<c;j++)
   		{
     			System.out.print(" "+b[i][j]);
   		}
   			System.out.println();
 	}

//SymmetricMatrix
	for(i=0;i<r;i++)
	{
  		for(j=0;j<c;j++)
  		{
    			if(a[i][j]!=b[i][j])
     			count=1;
  		}
	}

	if(count==0)

 		System.out.println("It is a Symmetric Matrix");
	else
 		System.out.println("It is not a Symmetric Matrix");
 }
 	else
  		System.out.println("It is not a Square matrix");
}
}