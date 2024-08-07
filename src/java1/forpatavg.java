// to print pattern according to average

package java1;

import java.util.Scanner;

public class forpatavg {

	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter first no. ");
      int a=sc.nextInt();
      
      System.out.println("Enter second no. ");
      int b=sc.nextInt();
      
      System.out.println("Enter third no. ");
      int c=sc.nextInt();
      
      int avg=(a+b+c)/3;
      
      System.out.println("Average is : "+avg);
     
      int row=avg;
      
      for(int i=1;i<=row;i++) {
    	  
    	  for(int j=1;j<=i;j++) {
    		  
    		  System.out.print("*");
    		  
    	  }
    	  
    	  System.out.println();
    	  
    	  
      }
      
      
      
	}

}
