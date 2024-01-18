/*Write a program to input all sides of a triangle and check whether triangle is valid or
not*/


public class Question15

 {
      public static void main(String[] args)
	{
		int s1 = 65;
		int s2 = 70;
		int s3 = 76;
		int sum = s1 + s2 + s3; 
		if(sum == 180) 
		{
			System.out.println("Triangle is valid");
		}
		else
		{
			System.out.println("Triangle is not valid");
		}
	}
}
