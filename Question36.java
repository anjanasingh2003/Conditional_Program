/*Write a Java program that accepts three numbers and check All numbers are equal or not*/


 public class Question36
 {
	public static void main(String[] args)
    {
        
		int num1 = 5;
		int num2 = 7;
		int num3 = 9;
 
		if (num1 == num2 && num1 == num3 && num2 == num3)
		{
			System.out.println("All Numbers are equal");
		}
		else if ((num1 == num2) || (num1 == num3) || (num3 == num2))
		{
			System.out.println("Neither all are Equal or Different");
		}
		else
		{
			System.out.println("All Numbers are Different");
		}
    }
 }
 