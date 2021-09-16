import java.util.Scanner;
public class Factorial
{
 public static void main(String args[])
 {
  Scanner x=new Scanner(System.in);
  System.out.print("Enter a Number: ");
  int n=x.nextInt();
  int fact=1;
  for(int i=n;i>0;i--)
  {
    fact=fact*i;
  }
  System.out.println("Factorial of "+n+" is "+fact);
 }
}