package java1;

import java.util.Scanner;

public class con2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter time");
		
		int time=sc.nextInt();
		
		if(time<18) {
			
			System.out.println("Good Day");
			
		}
		
		else
		{
			System.out.println("Good evening");
		}

	}

}
