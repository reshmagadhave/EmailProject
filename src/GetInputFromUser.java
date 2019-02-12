import java.util.Scanner;


public class GetInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			  int a;
		      float b;
		      String s;
		     
		      Scanner in = new Scanner(System.in);
		     
		      System.out.println("Please enter From date");
		      a = in.nextInt();
		      System.out.println("You entered FromDate as " + a);
		     
		      System.out.println("Please enter To date");
		      b = in.nextFloat();
		      System.out.println("You entered ToDate as  " + b);  
		   
		      System.out.println("Enter a string");
		      s = in.nextLine();
		      System.out.println("You entered string " + s);
		   }
		
	}


