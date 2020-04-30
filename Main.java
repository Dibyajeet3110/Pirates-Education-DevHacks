import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("             Welcome to Our Learning Platform");
		System.out.println("choose the feild below you want to learn or practice :");
		System.out.println("1.Language");
		System.out.println("2.DSA");
		System.out.println("3.Register Portal");
		System.out.println(" TO EXIT PRESS ANY KEY NUMBER EXCEPT(1-3)");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:	new Language();
				break;
		case 2: new Dsa();
				break;
		case 3: new contest();
				break;
		
		default:System.out.println("     Thank You For Visiting Our Platform        ") ;
				System.out.close();
				break;
		}
	}

}
