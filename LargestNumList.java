import java.util.Scanner;
 public class LargestNumList
 {
  public static void main(String args[])
  {
    int i,max;
    Scanner x=new Scanner(System.in);
    System.out.print("Enter the Size of Array ");
    int lar=x.nextInt();
    int a[]=new int[lar];
    System.out.println("Enter the Elements ");
    for(i=0;i<lar;i++)
    {
      a[i]=x.nextInt();
     }
     System.out.print("Elements are ");
     for(i=0;i<lar;i++)
        System.out.print(" " +a[i]);
    System.out.println();
    max=a[0];
    for(i=1;i<lar;i++)
    {
    if(max<a[i])
      max=a[i];
    }
    System.out.print("Largest Number is "+max);
  }
 }