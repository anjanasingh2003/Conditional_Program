/*. Write a program to input electricity unit charges and calculate total electricity bill
according to the given condition:
• For first 50 units Rs. 0.50/unit
• For next 150 units Rs. 0.75/unit
• For next 250 units Rs. 1.20/unit
• For unit above 250 Rs. 1.50/unit
• An additional surcharge of 20% is added to the bill
 */
	   public class Question21
	    {
        public static void main(String[] args)
	{ 
		int unit = 45;
		float amt,surcharge,bill_amt;
		if(unit<=50)
		{			
			amt = unit*0.50f;//amount=unit*rate
		}
		else if(unit<=150)
		{
			amt = unit*0.75f;
		}
		else if(unit<=250)
		{
			amt = unit*1.20f;
		}
		else
		{
			amt = unit*1.50f;
		}
 
		surcharge = amt*0.2f;
		bill_amt = amt+surcharge;
		System.out.println("Total Electricity Bill : "+bill_amt);
	}

    
}