// for right pat reversible

package java1;

import java.util.Scanner;

public class patrev1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no.of rows");
		
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			
			for(int j=2;j<=i;j++) {
				
				System.out.print(" ");
				
				
			}
			
			for(int k=row;k>=i;k--) {
				System.out.print("*");
				
				
			}
			
			System.out.println();
		}
		

	}

}
