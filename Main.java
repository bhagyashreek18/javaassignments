/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

public class Main
{
 
    public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    }   
    
    
    
    
  public static void main (String[]args) throws InvalidUserException,InvalidEmailIdException
  {
          String Useremail ="";
             Scanner scanner1 = new Scanner (System.in);
        System.out.println ("Enter the Email to validate :");
    
        Useremail = scanner1.nextLine ();
    try
    {
      Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter the username to validate :");
      String userName = scanner.nextLine ();
      
      
    //   Scanner scanner1 = new Scanner (System.in);
    //     System.out.println ("Enter the Email to validate :");
    
    //     Useremail = scanner1.nextLine ();
      
      
      int length = userName.length ();
          char c;

      for (int i = 0; i < length; i++)	//Check for `Firstname`
	{
	  c = userName.charAt (i);
	  
	  if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) && c != ' ')
	  
	    {
	        
	     continue;
	     
	    }
	   // else{
	        
	   //     throw new InvalidUserException ("Invalid username entered");
	        
	   // }
	  
	}

    }
    catch (Exception e)
    {
    throw new InvalidUserException ("Invalid username entered");
     
    }
    try{
        
        
        if(isValid(Useremail)) {
            System.out.print("Valid Email"); 
      }
     
    }
    catch(Exception ee ){
        
         throw new InvalidEmailIdException ("Invalid Email ID entered");
    }
    
      
    } 
  }

