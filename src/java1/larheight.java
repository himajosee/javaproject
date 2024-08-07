// Enter the height of 2 students , then check which student is tallest 

package java1;

import java.util.Scanner;

public class larheight {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the height of first student");
		int height1=sc.nextInt();
		
		System.out.println("Enter the height of second student");
		int height2=sc.nextInt();
		
		if(height1>height2)
		{
			System.out.println("First student is taller with height "+height1);
		}
		else if(height2>height1) {
			
			System.out.println("Second student is taller with height "+height2);
		}
		
		else
		{
			System.out.println("They are of equal height");
		}
	}

}
