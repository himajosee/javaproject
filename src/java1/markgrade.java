// Print grade according to mark

package java1;

import java.util.Scanner;

public class markgrade {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		
		if(marks>=91 && marks <=100) {
			
			System.out.println("Grade is A1");
			
			
		}
		
		else if(marks>=81 && marks<=90) {
			System.out.println("Grade is A");
			
		}
		
		else if(marks>=71 && marks<=80) {
			System.out.println("Grade is B1");
			
			}
		
		else if(marks>=61 && marks<=70) {
			System.out.println("Grade is B");
			
			}
		else if(marks>=51 && marks<=60) {
			System.out.println("Grade is C1");
			
			}
		
		else if(marks>=40 && marks<=50) {
			System.out.println("Grade is C");
			
			}
		else
		{
			System.out.println("FAIL");
		}
	}

}
