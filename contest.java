
import java.util.Scanner;
public class contest {
	Scanner s=new Scanner(System.in);
	public contest(){
	System.out.println("    Welcome To Register Portal    ");
	System.out.print("Here are the upcoming events:-");
	System.out.println("1.Onling Coding Skills");
	System.out.println("2.Workshop");
	System.out.println("3.Hackathon");
	System.out.println("4.Recruitment");
	System.out.println("5.back to main menu");
	int n;
    System.out.print("Enter your choice: ");
    n=s.nextInt();
    switch(n)
    {
    case 1:code();
    break;
    case 2:workshop();
    break;
    case 3:hackathon();
    break;
    case 4:recruitment();
    break;
    case 5: Main.main(null);
			break;
    default:System.out.println("Invalid Input !!! try again");
    		new contest();
    		break;
    }
	}
   public void code(){System.out.println("You will have to solve given number of question in every month");
    	System.out.println("Enter your details:-");
	    register();
    	System.out.println("First you have to make a Id in one of the following:");
    	System.out.println("1.Hacker Rank");
    	System.out.println("2.Geeks for Geeks");
    	System.out.println("3.Code chef");
    	System.out.println("Enter your registered Id name so we can check your grade report:");
        int d;
    	System.out.println("Enter your choice:");
    	d=s.nextInt();
    	System.out.println("Here you have your coding questions:");
    	switch(d)
    	{case 1:
    	    System.out.println("Please copy this link and sign in for your questions");
    	    System.out.println("hackerrank.com/work/login?h_r=login&h_l=body_middle_right_button");
          	System.out.println("You have to score minimum 50 questions in PROBLEM SOLVING  in any language");
          	break;
    	case 2:
    		System.out.println("Please copy this link and sign in for your questions");
    		System.out.println("https://www.geeksforgeeks.org/");
        	System.out.println("You have to score minimum 50 questions in PROBLEM SOLVING  in any language");
        	break;
    	case 3:
    		System.out.println("Please copy this link and sign in for your questions");
    		System.out.println("https://www.codechef.com/");
    	    System.out.println("You have to score minimum 50 questions in PROBLEM SOLVING in any language");
    	    break;
    	    default:System.out.println("Thank You");
    	    
    }System.out.println("We will evaluate in 30th of each month");
   }
    
    public void register()
    {String name,email,college,branch;int phone;
    	System.out.println("Enter your name:");
    	s.nextLine();
    	name=s.nextLine();
    	System.out.println("Enter your email:");
    	email=s.next();
    	s.nextLine();
    	System.out.println("Enter your college name:");
    	college=s.nextLine();
    	System.out.println("Enter your branch:");
    	branch=s.nextLine();
    	new contest();
   }
   public void workshop()
    {
    	System.out.println("Please provide your emails so we can send you upcoming seminar details:");
    	System.out.println("You can also check by clicking below Link:-");
    	System.out.println("https://sites.google.com/view/dsckiit/home");
    	String mail;
    	mail=s.next();
    
    	if(mail.contains("@") && mail.contains("."))
        	System.out.println("Thanks for providing us the email. we will notify you shortly");
        	
        	else {
        		System.out.println("invalid mail id");
        		System.out.println(" ");
        		System.out.println(" ");
        		workshop();
        	}
    	System.out.println(" ");
    	new contest();
    }
   public void hackathon()
    {

    	System.out.println("Please provide your emails so we can send you upcoming seminar details:");
    	
    	System.out.println("You can also check by clicking below Link:-");
    	System.out.println("https://sites.google.com/view/dsckiit/home");String mail;
    	mail=s.next();
    	if(mail.contains("@") && mail.contains("."))
    	System.out.println("Thanks for providing us the email. we will notify you shortly");
    	
    	else {
    		System.out.println("invalid mail id");
    		System.out.println(" ");
    		System.out.println(" ");
    		hackathon();
    	}
    	System.out.println(" ");
    	
    	new contest();
    	
    }
	public void recruitment()
	{System.out.println("Our Recruitment process is alwalys takes place in month of october");
	System.out.println("You can also check by clicking below Link:-");
	System.out.println("https://sites.google.com/view/dsckiit/home");
	System.out.println("For pre-notice please provide ypur mail:");
	String mail;
	mail=s.next();
	if(mail.contains("@") && mail.contains("."))
    	System.out.println("Thanks for providing us the email. we will notify you shortly");
    	
    	else {
    		System.out.println("invalid mail id");
    		System.out.println(" ");
    		System.out.println(" ");
    		recruitment();
    	}
    	System.out.println(" ");
    	
	new contest();
		
	}
}
