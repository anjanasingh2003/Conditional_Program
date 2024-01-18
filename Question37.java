/*Write a Java program that reads an positive integer and count the number of digits*/

public class Question37 
{
    public static void main(String[] args)
    {
     
	
		
 
			long num = 5l;
 
			if (num < 0)
			{
				num *= -1;
			}          
			
				int digits = 1;
				if (num >= 10 && num < 100)
				{
					digits = 2;
				}
				else if (num >= 100 && num < 1000)
				{
					digits = 3;
				}
				else if (num >= 1000 && num < 10000)
				{
					digits = 4;
				}
				else if (num >= 10000 && num < 100000)
				{
					digits = 5;
				}
				else if (num >= 100000 && num < 1000000)
				{
					digits = 6;
				}
				else if (num >= 1000000 && num < 10000000)
				{
					digits = 7;
				}
				else if (num >= 10000000 && num < 100000000)
				{
					digits = 8;
				}
				else if (num >= 100000000 && num < 1000000000)
				{
					digits = 9;
				}
				else if (num >= 1000000000 && num < 10000000000L)
				{
					digits = 10;
				}
				System.out.println("Number of digits in the number: " + digits);
	}
}


