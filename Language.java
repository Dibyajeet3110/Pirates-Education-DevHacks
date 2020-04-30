import java.util.Scanner;
		public class Language{
		    Language(){
		        Scanner sc = new Scanner(System.in);
		        int y=1;
		       while(y==1){
		           System.out.println("     Press: \n 1. for JAVA \n 2. for C++ \n 3. for PYTHON \n 4. for SQL");
		           int n = sc.nextInt();
		           switch(n){
		              case 1:
		                 java();
		                 break;
		              case 2:
		                 c();
		                 break;
		              case 3:
		                 python();
		                 break;
		              case 4:
		                 sql();
		                 break;
		        }
		        System.out.println("\n\n      press 1 to continue    ");
		        System.out.println("\n\n      press any other number to go to previous menu    ");
		        y=sc.nextInt();
		        if(y!=1)
		        {
		        	Main.main(null);
					break;
		        }
		    }
		}
          public static void java(){
            System.out.println("Java is one of the most popular and widely used programming language.\n The byte code is run on Java Virtual Machine (JVM) regardless of the underlying architecture.\nJava is used in all kind of applications like Mobile Applications (Android is Java based)");
            System.out.println("\n*****  For more detailed course   *****\n visit:  https://www.youtube.com/playlist?list=PLKKfKV1b9e8ps6dD3QA5KFfHdiWj9cB1s");  
          }
          public static void c(){
            System.out.println("C is a procedural programming language.\nIt was initially developed by Dennis Ritchie as a system programming language to write operating system.\n The main features of C language include low-level access to memory, simple set of keywords, and clean style, these features make C language suitable for system programming like operating system or compiler development.");
            System.out.println("\n*****  For more detailed course  *****\n visit:  https://www.youtube.com/playlist?list=PLKKfKV1b9e8rpSY-mrVn_UK-LRsTDQAN5");
          }
          public static void python(){
            System.out.println("Python is currently the most widely used multi-purpose, high-level programming language.\nPython allows programming in Object-Oriented and Procedural paradigms.\nPython programs generally are smaller than other programming languages like Java.\n Programmers have to type relatively less and indentation requirement of the language, makes them readable all the time."); 
            System.out.println("\n*****  For more detailed course  *****\n visit:  https://www.youtube.com/playlist?list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3");
          }         
          public static void sql(){
            System.out.println("Structured Query Language or SQL is a standard Database language which is used to create, maintain and retrieve the data from relational databases like MySQL, Oracle, SQL Server, PostGre, etc. The recent ISO standard version of SQL is SQL:2019.\nAs the name suggests, it is used when we have structured data (in the form of tables). All databases that are not relational (or do not use fixed structure tables to store data) and therefore do not use SQL, are called NoSQL databases.\n Examples of NoSQL are MongoDB, DynamoDB, Cassandra, etc");
            System.out.println("\n*****  For more detailed course  *****\n visit:  https://www.youtube.com/watch?v=7S_tz1z_5bA");
          }      
		}