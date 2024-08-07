	// To print pattern if rows are even no
package java1;

import java.util.Scanner;

public class forpateven {

	public static void main(String[] args) {
	
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter no of rows");
       
       int row=sc.nextInt();
       
      if(row%2==0)
      { 
       for(int i=1;i<=row;i++) {
    	   
    	   for(int j=1;j<=i;j++) {
    		   
    		   System.out.print("*");
    		   
    		   
    	   }
    	   
    	  System.out.println(); 
    	   
       }
      }
      else
      {
    	  System.out.println("Please enter even no."); 
    	  
      }

	}

}
