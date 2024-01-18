/*A company insures its drivers in the following cases:
• If the driver is married
• If the driver is unmarried, male & above 30 years of age
• If the driver is unmarried, female & above 25 years of age*/

public class Question26 
{
    public static void main(String[] args)
	{
		int age = 22;
		char gen = 'F'; 
		char status = 'U';
        
		if(status == 'M' || status == 'm')
		{			
			System.out.println("Driver should be Insured.");
		}
		else if(status == 'U' && gen == 'M' && age > 30 || status == 'u' && gen == 'm' && age > 30)
		{			
			System.out.println("Driver should be Insured.");
		}
		else if(status == 'U' && gen == 'F' && age > 25 || status == 'u' && gen == 'f' && age > 25)
		{			
			System.out.println("Driver should be Insured.");
		}
		else
		{			
			System.out.println("Driver should not be Insured.");
        }
    }
}
