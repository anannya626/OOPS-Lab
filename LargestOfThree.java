import java.util.Scanner;
import java.lang.Math;
public class LargestOfThree
{
  public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    System.out.print("Enter any 3 Numbers : ");
    int a=x.nextInt();
    int b=x.nextInt();
    int c=x.nextInt();
    if(a>b && a>c)
     System.out.println(a+" is Greater");
    else if( b>c )
     System.out.println(b+" is Greater");
    else
     System.out.println(c+" is Greater");
 }
}