import java.util.Scanner;
import java.lang.Thread;
import java.lang.Thread;

class FibRun implements Runnable
{
  public void run()
  {
    int a=0,b=1,c,i;
    Scanner x=new Scanner(System.in);
    System.out.println("Enter the limit for fibonacci : ");
    int n=x.nextInt();
    System.out.println("fibonacci numbers");
    System.out.println(" "+a);
    System.out.println(" "+b);
    for(i=2;i<n;++i)
    {
      c=a+b;
      System.out.println(" "+c);
      a=b;
      b=c;
    }
  }
}

class EvenRun implements Runnable
{
  public void run()
  {
    Scanner x=new Scanner(System.in);
    System.out.println("Enter the limit for even numbers: ");
    int n=x.nextInt();
    System.out.println("Even Numbers");
    for(int i=2;i<=n;i++)
    {
      if (i%2==0)
        System.out.println(" Even number "+i);

    }
  }
}

class ThreadFibonacciEven
{
 public static void main(String args[])
 {
   Runnable r1=new FibRun();
   Thread t1=new Thread(r1);
   Runnable r2=new EvenRun();
   Thread t2=new Thread(r2);
    t1.start();
    t2.start();
 }
}