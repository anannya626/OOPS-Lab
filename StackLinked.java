import static java.lang.System.exit;
import java.util.Scanner;
class StackUsingLL 
{
    	private class Node
	{
        		int data;
       	 	Node link;
    	}
    		Node top;

    		StackUsingLL()
		{
        		this.top=null;
    		}

   		 public void push(int x)
		{
			Node temp=new Node();
        			if(temp==null)
			{
            			System.out.print("\nStack Overflow");
            			return;
			}

        			temp.data=x;
        			temp.link=top;
        			top=temp;
    		}

    		public boolean isEmpty()
    		{
       			 return top ==null;
    		}

    		public int peek()
    {
        			if (!isEmpty())
			{
            				return top.data;
        			}

        			else
			{
            				System.out.println("Stack is Empty");
           				return -1;
        			}
    }

    		public void pop()
   {
        			if(top==null)
			{
            				System.out.print("\nStack Underflow");
            				return;
        			}
        				top=(top).link;
    }

    		public void display()
    {
        			if(top==null)
        			{
            				System.out.print("\nStack Underflow");
            				exit(1);
        			}
        			else
			{
            				Node temp=top;
           			 	while(temp !=null)
				{
                					System.out.printf("%d->",temp.data);
                					temp=temp.link;
            				}
        			}
    }
}

public class StackLinked
{
    public static void main(String[] args) 
	{
        			int n;
        			StackUsingLL obj=new StackUsingLL();
        			Scanner reader=new Scanner (System.in);
        			System.out.print("Enter the No.of Elements : ");
        			n=reader.nextInt();
       			int a[] = new int[n];
        			System.out.println("Enter the Elements : ");

        			for(int i=0;i<n;i++)
        			{
            				a[i]=reader.nextInt();
        			}
        
        
        			for(int i=0;i<n;i++)

        			{
            				obj.push(a[i]);
        			}
        
        
        		obj.display();
        		System.out.printf("\nTop Element of Stack is %d\n",obj.peek());
        		obj.pop();
        		obj.pop();
        		obj.display();
        		System.out.printf("\nTop Element of Stack is %d\n",obj.peek());
    	}
    
}