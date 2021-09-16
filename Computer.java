/*
Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer) and static nested class RAM (memory, manufacturer). 
Create an object of CPU and print information of Processor and RAM.
 */



import java.util.Scanner;

class Cpu

{
	int price;


  
  
  	class Processor

	{                        								
               
               		String Manufacturer, No_of_Cores;				 
	}


   
static class Ram                                                                   					
	{  
 
                   	String Manufacturer;
             		 int memory;
       
	}

    	Cpu.Ram RAMobject = new Cpu.Ram();                      				
	Processor PROCESSOR = new Processor();                      				
    
  

    void inputData()

	{ 
		Scanner in = new Scanner(System.in);
   
        		System.out.println("\nEnter the CPU Details \n");    
    
        		System.out.print("Enter RAM Manufacture Name : ");
         		RAMobject.Manufacturer=in.next();
 
        		System.out.print("Enter RAM Memory : ");
         		RAMobject.memory=in.nextInt();
        
          		System.out.print("Enter Processor Manufacture Name : ");
         		PROCESSOR.Manufacturer=in.next();
 
        		System.out.print("Enter No.Of.Cores : ");
         		PROCESSOR.No_of_Cores=in.next();

        		System.out.print("Enter CPU Price : ");
        		price=in.nextInt();
	}


void display()

	{
        		System.out.println("\nCPU Details");       
       
        		System.out.println("\nRAM Manufacture Name : "+ RAMobject.Manufacturer);
       
        		System.out.println("RAM Memory : "+ RAMobject.memory);
        
        		System.out.println("Processor Manufacture Name : "+ PROCESSOR.Manufacturer);
       
        		System.out.println("No.Of.Cores : "+ PROCESSOR.No_of_Cores);

        		System.out.println("CPU Price : "+ price);
	}
}


class Computer

{
		public static void main(String args[])
	{
		Cpu NEWCPU = new Cpu();                           						
  		NEWCPU.inputData();                              							
   		NEWCPU.display();                              							 
	}
}


































