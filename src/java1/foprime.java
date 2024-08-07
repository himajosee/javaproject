	// To check a number is prime or not(0,1 not prime numbers) 
package java1;

import java.util.Scanner;

public class foprime {

	public static void main(String[] args) {
	
  Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter number");
  
  int num=sc.nextInt();
  int count=0;
  
  if(num==0||num==1)
	  System.out.println(num+" is not prime number");
  
  else {
	  for(int i=1;i<=num/2;i++) {
		  
		  if(num % i==0) {
			  
			  count++;
		  }
		  
	  }
	  
	  if(count>1)
		  System.out.println(num+" is not prime number");
	  else
		  System.out.println(num+" is prime number");
  }
  
	  
	}

}
