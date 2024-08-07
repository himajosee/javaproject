
// TO print patterns using switch

package java1;

import java.util.Scanner;

public class swpatterns {

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
   
    
    System.out.println("Enter Pattern no: ");
    int num=sc.nextInt();
    
  
    
 
    System.out.println("Enter no.of rows");
	int row=sc.nextInt();
    	
  
     
    
    switch(num) {
    
    
    case 1:
    	
    	System.out.println("Pattern1");
    	
		
          for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
    	
    	break;
     
    case 2:
    	System.out.println("Pattern2");
    	
    
		
           for (int i= 1; i<=row; i++)  {
	    	
	    	for (int j=row; j>=i; j--)  
	    	{  
	    		
	    		
	    		System.out.print("*");  
	    	}
	    	
	    	System.out.println();  
	    }
    	
    	break;
    	
    case 3:
    	
    	
    	for (int i= 1; i<=row; i++)  
		{ 
			for (int j=row; j>=i; j--)  
			{  
			System.out.print(" ");  
			}  
			for (int k=1;k<=i;k++)  
			{  
			System.out.print("*");  
			}   
			System.out.println();  
		}
    	
    	
    	
    	break;
    
    case 4:
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
		
    	
    	break;
    	
    	default:System.out.println("Invalid pattern no");
    }


	}

}
