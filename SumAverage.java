import java.util.Scanner;
import java.lang.Math;
public class SumAverage
{
public static void main(String args[])
{
  int i,sum=0;
 Scanner x=new Scanner(System.in);
 System.out.print("Enter the Size  of Array  ");
 int l=x.nextInt();
 int a[]=new int[l];
 System.out.println("Enter the Elements ");
 for(i=0;i<l;i++)
 {
   a[i]=x.nextInt();
   sum=sum+a[i];
 }
 System.out.print("Elements are ");
 for(i=0;i<l;i++)
    System.out.print(" " +a[i]);
  System.out.println();
  double avg=(double)sum/l;
  System.out.println("Sum of Elements : "+sum);
  System.out.println("Average of Elements : "+avg);

}
}