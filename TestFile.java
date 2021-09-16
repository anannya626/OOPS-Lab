import java.io.*;
import java.util.Scanner;

class TestFile
{
	public static void main(String args[])
	{
		File f1=new File("C:\\Users\\ANANNYA\\Desktop\\javaprogram\\Files");
		if(f1.isDirectory())
		{
			System.out.println("DETAILS: "+f1.getAbsolutePath());
			String s[]=f1.list();
			System.out.println("Total no.of files: "+s.length);
			for(int i=0;i<s.length;i++)
			{
				File f2=new File("C:\\Users\\ANANNYA\\Desktop\\javaprogram\\Files"+"//"+s[i]);
				if(f2.isDirectory())
				{
					System.out.println(s[i]+"\t is a directory");
				}
				else
				{
					System.out.println(s[i]+"\t is a file");
				}
			}
		}
	   else
	   {
		   System.out.println("C:\\Users\\ANANNYA\\Desktop\\javaprogram\\Files" + " is not a directory");
	   }
System.out.println("Enter a File Name to Search : ");
Scanner sc=new Scanner(System.in);
String fname=sc.nextLine();
String filelist[]=f1.list();
boolean f=false;
	for(int i=0;i<filelist.length;i++)
	{
		File f2=new File("C:\\Users\\ANANNYA\\Desktop\\javaprogram\\Files"+"//"+filelist[i]);
		if(fname.equals(f2.getName()))
		{
		  System.out.println(fname+"File Found");
		  f=true;
		  break;
		}
	}
	if(!f)
	{
		System.out.println("File Doesn't Exists");
	}
	
	}
}