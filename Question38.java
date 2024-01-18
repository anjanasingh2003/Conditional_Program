/* Write a java program that accepts three numbers from the user and check if numbers
are in "increasing" or "decreasing" order*/

public class Question38
 {
    public static void main(String[] args)
    {
    

		int num1 = 57;
		int num2 = 54;
		int num3 = 34;
		if (num1 < num2 && num2 < num3)
		{
			System.out.println("Numbers are in Increasing Order");
		}
		else if (num1 > num2 && num2 > num3)
		{
			System.out.println("Numbers are in Decreasing Order");
		}
		else
		{
			System.out.println("Neither Increasing or Decreasing Order");
        }
    }
}
