package Calapp;
import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose any one operation");
		System.out.println("Addition 1");
		System.out.println("Substraction 2");
		System.out.println("multification 3");
		System.out.println("Division 4");
		
		int operation = sc.nextInt();
		
		if(operation != 1 && operation != 2 && operation != 3 && operation != 4) {
			System.out.println("Please re-run program and put correct number please ");
			return ;
		}
		
		System.out.println("Enter the First number");
		  int n1 = sc.nextInt();
		  System.out.println("Enter the Second number");
		  int n2 = sc.nextInt();
		  
		  
		  if(operation == 1) {
			  int c = n1 + n2;
			  System.out.println("Addition is: "+ c);
		  }
		  if (operation == 2) {
			  int c = n1 - n2;
			  System.out.println("Substration is: "+ c);
			  
		  }
		  if(operation == 3) {
			  int c = n1 * n2;
			  System.out.println("Multification is: " + c);
		  }
		  if(operation == 4) {
			  int c = n1 / n2;
			  System.out.println("Dividation is: " + c);
			  
		  }
	}

}
