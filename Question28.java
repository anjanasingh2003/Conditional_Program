/**
 * A five-digit number is entered through the keyboard. Write a program to obtain the
reversed number and to determine whether the original and reversed numbers are equal
or not
 */

public class Question28
 {
       public static void main(String[] args) 
       {
		int number = 123456; 
		 int reverse = 0;
		  int digit;

		//we have not mentioned the initialization part of the for loop  
		while( number >0)   
		{  
		     digit = number % 10;  
		     reverse = reverse * 10 + digit;
			 number=number/10;   
		    
		}
	
		
			System.out.println("number is equal" +reverse);  
	}
}
       
    
