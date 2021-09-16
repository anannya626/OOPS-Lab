import java.util.Scanner;
public class Palindrome
{
public static void main(String[] args)
{
  Scanner x=new Scanner(System.in);
  System.out.print("Enter a Number : ");
  int num=x.nextInt();
  int a=num;
  int r;
  int rev=0;
  while(a!=0)
  {
    r=a%10;
    rev=rev*10+r;
    a=a/10;
  }
  if(num==rev)
     System.out.println(num+ " is a Palindrome Number");
  else
    System.out.println(num+ " is not a Palindrome Number");
}
}