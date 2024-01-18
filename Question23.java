/**
 * The current year and the year in which the employee joined the organization are
entered through the keyboard. If the number of years for which the employee has served
the organization is greater than 3 then a bonus of Rs. 2500/- is given to the employee. If
the years of service are not greater than 3, then the program should do nothing
 */

public class Question23 
{
      public static void main(String[] args)
	{
		int current_year = 2023;
		int join_year = 2020;
		int diff = current_year - join_year;
		if(diff>3)
		{			
			System.out.println("Bonus of Rs : 2500 /-");
		}
		else
		{			
			System.out.println("No Bonus");
		}		
	}
}
    
