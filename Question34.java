/*A library charges a fine for every book returned late. For first 5 days the fine is 50
paise, for 6-10 days fine is one rupee and above 10 days fine is 5 rupees. If you return the
book after 30 days your membership will be cancelled. Write a program to accept the
number of days the member is late to return the book and display the fine or the
appropriate message*/

public class Question34 
{
     public static void main(String[] args)
	{
		int days = 5;
		int amt;
		if(days>0 && days<= 5) 
		{
			amt = (int)0.50 * days;
			System.out.println("Fine Amount Pay to Rs :"+ amt);
		}
		else if(days >= 6 && days <= 10) 
		{
			amt = 1 * days;
			System.out.println("Fine Amount Pay to Rs :"+ amt);
		}
		else if(days > 10) 
		{
			amt = 5 * days;
			System.out.println("Fine Amount Pay to Rs :"+ amt);
			if(days>30)
			{
				System.out.println("Your Membership would be Cancelled..");				
			}
		}
		else
		{
			System.out.println("Invalid");
		}
    }
}
