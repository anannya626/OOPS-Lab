import java.util.Scanner;

class UsernameException extends Exception 
{

    public UsernameException(String msg) {
        System.out.print(msg);
    }
}

class PasswordException extends Exception 
{

    public PasswordException(String msg) {
        System.out.print(msg);
    }
}

public class Usernamepass  
{

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String username, password;

        System.out.print("Enter Username : ");
        username = reader.nextLine();
        System.out.print("Enter Password : ");
        password = reader.nextLine();
        int len = username.length();
        try 
	{

            		if(len < 8)
               		throw new UsernameException("Username Must be Greater than 8 Characters");
            		else if(!password.equals("admin"))
                		throw new PasswordException("Incorrect password!");
            		else
                		System.out.println("Login Successful!");
        	}

        catch (UsernameException u) 

	
        catch (PasswordException p) 

	
    }
}