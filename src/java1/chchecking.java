package java1;

import java.util.Scanner;

public class chchecking {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		char x=sc.next().charAt(0);
		
	
		
		if(Character.isDigit(x))
		{
			System.out.println("It is a digit");
			
			
		}
		else
		{
			
			System.out.println("It is a character");
			
		}
		
		
		
		

	}

}
