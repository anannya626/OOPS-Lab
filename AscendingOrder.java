import java.util.Scanner;
public class AscendingOrder
{
  public static void main(String args[])
  {
    int i,j,temp;
    Scanner x=new Scanner(System.in);
    System.out.print("Enter the Size of Array  ");
    int l=x.nextInt();
    int a[]=new int[l];
    System.out.println("Enter the Elements ");
    for(i=0;i<l;i++)
    {
      a[i]=x.nextInt();
    }
    System.out.print("Elements are ");
    for(i=0;i<l;i++)
    System.out.print(" " +a[i]);
    System.out.println();
    for(i=0;i<l;i++)
    {
      for(j=i+1;j<l;j++) 
      {
      if(a[i]>a[j])
      {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
    }
    System.out.print("Elements in Ascending order : ");
    for(i=0;i<l;i++)
    System.out.print(" " +a[i]);
  }
}