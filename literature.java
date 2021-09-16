import java.util.Scanner;
class publisher 

{

    	Scanner reader=new Scanner(System.in);
    	String name;
    	public publisher()

	{
        		name=" ";
    	}

	public void input()

		{
        			System.out.print("Enter Publisher Name : ");
        			name=reader.next();
    		}
}
class book extends publisher 

{
    		String bname;
   	 	int bid;

   	public book()
 
		{
        			bname = " ";
       			bid = 0;
    		}

  	public void binput() 

		{
        			System.out.print("Enter Book Id : ");
        			bid = reader.nextInt();
        			System.out.print("Enter Book Name : ");
        			bname = reader.next();
		}
}

class fiction extends book

{
    		String fic;
    		public fiction()
	{
        		fic=" ";
    	}

	void finput()

		{
        			System.out.print("Specify Fiction or Non Fiction : ");
        			fic=reader.next();
    		}
}

class literature extends book 

{
    		String lit;
		public literature() 
	{
        		lit = " ";
    	}

	void linput() 

		{
        			System.out.print("Enter Type of Literature : ");
        			lit = reader.next();
    		}

public static void main(String[] args) 

   {
        literature i = new literature();
        fiction f=new fiction();
        i.input();
        i.binput();
        f.finput();
        i.linput();
        System.out.println("\nBOOK DETAILS: ");
        System.out.println("Publisher Name : " + i.name);
        System.out.println("Book Id : " + i.bid);
        System.out.println("Book Name : " + i.bname);
        System.out.println("Fiction or Non-Fiction : " + f.fic);
        System.out.println("Literature Type : " + i.lit);

    }
}