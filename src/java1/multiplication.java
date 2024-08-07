package java1;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		
		Scanner sc2=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int x=sc2.nextInt();
		
		System.out.println("Enter second number");
		int y=sc2.nextInt();
		
		int z= x*y;
		
		System.out.println("The product is " +z);

	}

}
