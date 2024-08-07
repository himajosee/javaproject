	// Check whether the given number is 3 digit positive number or not

package java1;

import java.util.Scanner;

public class threeposneg {

	public static void main(String[] args) {
	
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter 3 digit number");
      int num=sc.nextInt();
      
      if(num >= 100 && num<=999)
      {
    	  System.out.println(num+" is a 3 digit positive number");
      }
      
      else
      {
    	  System.out.println(num+" is not 3 digit positive number");
      }
	}

}
