import java.util.Scanner;
public class PosOrNeg
{
 public static void main(String args[])
 {
  Scanner y=new Scanner(System.in);
  System.out.print("Enter a Number:  ");
  int a=y.nextInt();
  String n=a>0?"Positive":(a<0)?"Negative":"zero";
  System.out.println(a+" is "+n);
 }
}