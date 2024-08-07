// Police details using switch

package java1;

import java.util.Scanner;

public class swpolice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Enter designation");
		int desig=sc.nextInt();
		
		switch(desig) {
		
		case 1:
			System.out.println("Name is A ,Salary is 80000 ,designation is ASI");
			break;
		
		case 2:
			System.out.println("Name is B ,Salary is 50000 ,designation is SI");
			break;
			
		case 3:
			System.out.println("Name is C ,Salary is 40000 ,designation is head constable");
			break;
			
		case 4:
			System.out.println("Name is D ,Salary is 30000 ,designation is  constable");
			break;	
			
		case 5:
			System.out.println("Name is E ,Salary is 20000 ,designation is  driver");
			break;	
			
		default:
			System.out.println("Invalid output");
				
		}

	}

}
