import  java.util.Scanner;
public class StringOperation 
{
    public static void main(String[] args) 

  {
        String s1, s2,s3,s4;
        int ch,len;
        Scanner reader = new Scanner(System.in);
        System.out.print("\nSTRING OPERATIONS\n1.Length\n2.Concat\n3.Compare\n4.Copy\nEnter Your Choice : ");
        ch=reader.nextInt();

        switch (ch)

        {

            case 1:System.out.print("Enter String : ");
                   s1 = reader.next();
                   len=s1.length();
                   System.out.print("String Length is : "+len);
                   break;

            case 2:System.out.print("Enter First String : ");
                   s1 = reader.next();
                   System.out.print("Enter Second String : ");
                   s2 = reader.next();
                   s4=s1.concat(s2);
                   s3=s1+s2;
                   System.out.print("Concatenated String : "+s3);
                   System.out.print("\nConcatination Using Library Function : "+s4);
                   break;

            case 3:System.out.print("Enter First String : ");
                   s1 = reader.next();
                   System.out.print("Enter Second  String : ");
                   s2 = reader.next();
	  System.out.print("\nCompare Using Library Function : "+s1.equals(s2));
	  break;

            case 4:System.out.print("Enter First String : ");
                   s1 = reader.next();
                    System.out.print("Enter Second string : ");
                    s2 = reader.next();
                   s2=s1;
                   System.out.print("The Copied String is : "+s2);
                   break;
            default:System.out.print("Invalid Choice!");
            break;
        }

    }

}