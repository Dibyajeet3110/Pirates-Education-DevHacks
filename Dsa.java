import java.util.Scanner;

public class Dsa {
	private static int ch;
	static Scanner sc=new Scanner(System.in);
	public Dsa(){
		System.out.println("             Welcome to DSA Learning Series");
		System.out.println("choose the feild below you want to learn or practice :");
		System.out.println("1.DataStrucutures");
		System.out.println("2.Algorithms");
		System.out.println("3.Back to main menu");
		ch=sc.nextInt();
		switch(ch) {
		case 1:	DataStructures();
				break;
		case 2: Algorithms();
				break;
		case 3: 
				Main.main(null);
				break;
		default: System.out.println("YOU ENTERED A WRONG KEY!!!! (TRY AGAIN)");
					new Dsa();
					break;
		}
	}
	
	public static void DataStructures()
	{
		System.out.println("The following are the various topics of DataStrucutres which you can learn and practice");
		System.out.println("1.Linked List");
		System.out.println("2.Tree");
		System.out.println("3.Stacks And Queues");
		System.out.println("4.Sets And Maps");
		System.out.println("5.Graphs");
		System.out.println("6.Back to previous menu");
		//System.out.println(" ");
		int a=sc.nextInt();
		switch(a)
		{
		case 1: LinkedList(); 
				break;
		case 2: Tree();
				break;
		case 3: stack();
				break;
		case 4: sets();
				break;
		case 5: graphs();
				break;
		case 6: //System. out. flush();
				new Dsa();
				break;
			    
		default: System.out.println("pls enter a valid choice \n");
				 //System. out. flush();
				 DataStructures();
		         break;
		}
		
	}
						public static void LinkedList() 
						{
							System.out.println("welcome to our Section of Linked List");
							System.out.println("Resourse Links: "+ "https://bit.ly/2xdCqKW");
							System.out.println("problems for practice:  " + "https://bit.ly/2W27h5x");
							
							
							System.out.println("want to go back to previous menu(Y/N)");
							char a=sc.next().charAt(0);
							if(a=='Y'|| a=='N')
							{	System.out.flush();
								DataStructures();
							}
							
						}
						public static void Tree()
						{
							System.out.println("        welcome to our Section of Trees");
							System.out.println("Playlist On Trees: "+ "https://bit.ly/2YaszR1");
							System.out.println("problems for practice:  " + "https://bit.ly/2S4tlLy");
							
							
							System.out.println("want to go back to previous menu(Y/N)");
							char a=sc.next().charAt(0);
							if(a=='Y'|| a=='N')
							{	System.out.flush();
								DataStructures();
							}
						}
						public static void stack()
						{
							System.out.println("         welcome to our Section of Stacks And Queues");
							System.out.println("Playlist on stacks:  " + "https://bit.ly/3cOJAnS");
							System.out.println("Playlist on Queues:  " + "https://bit.ly/2xQaWvi");
							System.out.println("problems for practice:  " + "https://bit.ly/2Y5HCeN");
							
							
							System.out.println("want to go back to previous menu(Y/N)");
							char a=sc.next().charAt(0);
							if(a=='Y'|| a=='N')
							{	System.out.flush();
								DataStructures();
							}
						}
						public static void sets()
						{
							System.out.println("        welcome to our Section of sets And Maps");
							System.out.println("Playlist On Sets: "+ "https://bit.ly/2S9xo9n");
							System.out.println("problems for practice:  " + "https://bit.ly/2Y1ypEm");
							
							
							System.out.println("want to go back to previous menu(Y/N)");
							char a=sc.next().charAt(0);
							if(a=='Y'|| a=='N')
							{	System.out.flush();
								DataStructures();
							}
							
						}
						public static void graphs()
						{
							System.out.println("        welcome to our Section of Graphs");
							System.out.println("Playlist On Graphs: "+ "https://bit.ly/35aDVGm");
							System.out.println("problems for practice:  " + "https://bit.ly/3bHRTBK");
							
							
							System.out.println("want to go back to previous menu(Y/N)");
							char a=sc.next().charAt(0);
							if(a=='Y'|| a=='N')
							{System.out.flush();
								DataStructures();
							}
						}
						
private static void Algorithms() {
		System.out.println("The following are various Algorithms which you can learn or practice:");
		System.out.println("1. searching and sorting ");
		System.out.println("2.recurssion and backtracking");
		System.out.println("3.Dynamic Programming");
		System.out.println("4.Greedy");
		System.out.println("5.Back To Main Menu");
		int a;
		a=sc.nextInt();
		switch(a)
		{
		case 1: search();
				break;
		case 2: recurr();
				break;
		case 3: dp();
				break;
		case 4: greedy();
				break;
		case 5: System. out. flush();
				new Dsa();
				break;
		default: System.out.println("YOU ENTERED A WRONG KEY!!!! (TRY AGAIN)");
				 Algorithms();
				 break;
				
		}
}
									private static void search() {
									
										System.out.println("        welcome to our Section of searching And Sorting");
										System.out.println("Playlist On searching And Sorting : "+ "https://bit.ly/2KBHFXS");
										System.out.println("problems for practice:  " + "https://bit.ly/2x9olOB");
										
										
										System.out.println("want to go back to previous menu(Y/N)");
										char a=sc.next().charAt(0);
										if(a=='Y'|| a=='N')
										{   System.out.flush();
											Algorithms();
										}
									}
 
									private static void recurr() {
										
										System.out.println("        welcome to our Section of Recursion And Backtracking");
										System.out.println("Documentation: "+ "https://bit.ly/3aFIf1o");
										System.out.println("problems for practice:  " + "https://bit.ly/2x6s7bk");
										
										
										System.out.println("want to go back to previous menu(Y/N)");
										char a=sc.next().charAt(0);
										if(a=='Y'|| a=='N')
										{	System.out.flush();
											Algorithms();
										}
									}
						            private static void dp() {
						            	System.out.println("        welcome to our Section of Dynamic Programming");
										System.out.println("Documentaion: "+ "https://www.hackerrank.com/topics/dynamic-programming");
										System.out.println("problems for practice:  " + "https://bit.ly/2Y5rUjV");
										
										
										System.out.println("want to go back to previous menu(Y/N)");
										char a=sc.next().charAt(0);
										if(a=='Y'|| a=='N')
										{	System.out.flush();
											Algorithms();
										}
						             }
						            private static void greedy() {
						            	System.out.println("        welcome to our Section of Greedy Algorithms");
			
										System.out.println("problems for practice:  " + "https://bit.ly/3bF1c5D");
										
										
										System.out.println("want to go back to previous menu(Y/N)");
										char a=sc.next().charAt(0);
										if(a=='Y'|| a=='N')
										{	System.out.flush();
											Algorithms();
										}
										
									}
  
                                   
}
