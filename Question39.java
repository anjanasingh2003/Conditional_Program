/* Write a Java program to create a simple calculator*/


public class Question39
 {
    public static void main(String[] args) {
    
        int p = 1; 
		int num1 = 87;   
		int  num2 = 76; 
		char  o = '*';//operator	
		
        
		if(o=='+')
		{
			System.out.print(num1+num2);
		}
		else  if(o=='-')
		{
		System.out.print(num1-num2);
		}
		else if(o=='*')
		{
			System.out.print(num1*num2);
		}
		else  if(o=='/')
		{
			System.out.print(num1/num2);
		} 
		else if(o=='^')
		{
		   for(int i=1; i<=num2; i++){
			 p *= num1;
		   } 
           System.out.print(p);
		}
		else
		{
			System.out.print("Invalid Operator.");
		}
 
    }
}

