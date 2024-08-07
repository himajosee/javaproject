package java1;

import java.util.Scanner;

public class con6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		System.out.println("Enter weight");
		int weight=sc.nextInt();
		
		if(age>=18) {
			
			if(weight>50) {
				
				System.out.println("You are eligible to donate blood");
				
			}
		}
		
		else {
			System.out.println("You are not eligible to donate blood");
			
		}

	}

}
