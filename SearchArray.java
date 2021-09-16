//Search array element

import java.util.Scanner;
public class SearchArray
{
 public static void main(String args[])
 	{
  		Scanner x=new Scanner(System.in);
  		int i,count=0;
  		System.out.print("Enter the Size of Array : ");
  		int l=x.nextInt();
  		int a[]=new int[l];

  System.out.println("Enter the Elements : ");
  	for(i=0;i<l;i++)
  	{
    		a[i]=x.nextInt();
  	}
  System.out.println("Enter the Element to be Searched : ");
  int s=x.nextInt();
  	for(i=0;i<l;i++)
  	{
    		if(s==a[i])
    		{
      			System.out.println("Element "+s+" Found at Position "+ (i + 1));
      			count=count+1;
    		}
  	}
	
  	if(count==0)
   	System.out.println("The Element Not Found in this Array!");
  }
}