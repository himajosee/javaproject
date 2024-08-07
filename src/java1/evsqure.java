
//Check whether the given no is even then find the square of the number

package java1;

import java.util.Scanner;

public class evsqure {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		if(num%2==0) {
			
			int sqre=num*num;
			
			System.out.println(num+" is an even number"+" it's square is "+sqre);
			
			}
		
		else
		{
			System.out.println(num+" is an odd number");
		}

	}

}
