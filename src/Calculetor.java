package add.calculetor;

import java.util.Scanner;

public class Calculetor {
	
	public static Scanner s;
	public static int a;
	public static int b;

	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		System.out.print("Enter a value you want to add:");
		int a = s.nextInt();
		
		System.out.print("Enter a value you want to add:");
		int b = s.nextInt();
		
		Formula sum = new Formula();
		System.out.println("Summention of "+a+" and "+b+" is :"+sum.add(a, b));
		System.out.println(sum.add(2.5,2.5));
		sum.add();
	}
}
