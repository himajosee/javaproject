// various if else programs using switch

package java1;

import java.util.Scanner;

public class swvariouspgms {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		switch(num) {
		
		case 1:
			System.out.println("IF PROGRAM");
			
			System.out.println("Enter number");
			
			int a=sc.nextInt();
			
			if(a>18) {
				System.out.println(a+" is greater than 18");
				
			}
			
			
			break;
		
		
		case 2:
			System.out.println("IF ELSE PROGRAM");
			
			System.out.println("Enter time");
			int time=sc.nextInt();
			if(time<18) {
				
				System.out.println("Good day");
				
			}
			else {
				System.out.println("Good evening");
				
			}
			
			break;
			
		case 3:
			
			System.out.println("IF ELSE IF LADDER PROGRAM");
			
			System.out.println("Enter time");
			int time1=sc.nextInt();
			
			if(time1<10) {
				System.out.println("Good morning");
				
			}
			
			else if(time1<20) {
				System.out.println("Good day");
				
			}
			
			else {
				System.out.println("Good evening");
				
			}
		break;
		case 4:
			System.out.println("NESTED IF PROGRAM");
			
			System.out.println("ENTER AGE");
			int age=sc.nextInt();
			
			System.out.println("ENTER WEIGHT");
			int wt=sc.nextInt();
			
			if(age>=18) {
				if(wt>=50) {
					System.out.println("You are able to donate blood");
				}
			}
			
			break;
			
			default:
				System.out.println("Invalid input");
		}
		
	}

}
