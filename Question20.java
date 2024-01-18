/*Write a program to input basic salary of an employee and calculate its Gross salary
according to following:
• Basic Salary <= 10000 : HRA = 20%, DA = 80%
• Basic Salary <= 20000 : HRA = 25%, DA = 90%
• Basic Salary < 20000  : HRA = 30%, DA = 95%*/


public class Question20
 {
         public static void main(String[] args)
	{
	
		
		int BS =56;
		float HRA,DA;
		if(BS<=10000)
		{			
			HRA = BS*0.2f;
			DA = BS*0.8f;
		}
		else if(BS<=20000)
		{
			HRA = BS*0.25f;
			DA = BS*0.9f;
		}
		else
		{
			HRA = BS*0.3f;
			DA= BS*0.95f;
		}
		System.out.println("Gross Salary : "+(BS+HRA+DA));
	} 
}
