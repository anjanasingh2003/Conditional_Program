/**
 while purchasing certain items, a discount of 10% is offered if the quantity purchased is
more than 100. If quantity and price per item are input through the keyboard, write a
program to calculate the total expenses
 */
public class Question22 
{
           public static void main(String[] args)
	{
	
	
		int qty = 5;
	
		float amt =690; 
		float exp;
		if(qty>100)
		{			
			exp = qty * amt; 
			exp = exp-(exp * 0.1f);
		}
		else
		{
			exp = qty * amt; 
		}		
		System.out.println("Total Expenses is : "+exp);
	}
}
    
