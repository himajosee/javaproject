// operations using switch

package java1;

import java.util.Scanner;

public class operations {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		switch(num) {
		
		case 1:
			System.out.println("Addition");
			
			System.out.println("Enter First number");
			int f=sc.nextInt();
			
			System.out.println("Enter Second number");
			int s=sc.nextInt();
			
			int r=f+s;
			
			System.out.println("The sum is "+r);
			
		break;
		case 2:
			System.out.println("Subtraction");
			
			System.out.println("Enter First number");
			int f1=sc.nextInt();
			
			System.out.println("Enter Second number");
			int s1=sc.nextInt();
			
			int r1=f1-s1;
			
			System.out.println("The difference is "+r1);
			
		break;
		
		case 3:
			System.out.println("Multiplication");
			
			System.out.println("Enter First number");
			int f2=sc.nextInt();
			
			System.out.println("Enter Second number");
			int s2=sc.nextInt();
			
			int r2=f2*s2;
			
			System.out.println("The product is "+r2);
			
		break;
		
		case 4:
			System.out.println("Division");
			
			System.out.println("Enter First number");
			int f3=sc.nextInt();
			
			System.out.println("Enter Second number");
			int s3=sc.nextInt();
			
			int r3=f3/s3;
			
			System.out.println("The result is "+r3);
			
		break;
		default:
			System.out.println("Invalid input");
		}

	}

}
