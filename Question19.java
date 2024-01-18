/* Write a program to input marks of five subjects Physics, Chemistry, Biology,
Mathematics and Computer. Calculate percentage and grade according to following:
• Percentage >= 90% : Grade A
• Percentage >= 80% : Grade B
• Percentage >= 70% : Grade C
• Percentage >= 60% : Grade D
• Percentage >= 40% : Grade E
• Percentage <  40% :  Grade F */

public class Question19
 {
       public static void main(String[] args)
	{
		int phy = 89;
		int che = 73;
		int bio = 90;
		int math =85;
		int com = 75;
		int tot = phy + che + bio + math + com;
		float per = tot/5;

		if(per>=90)
        {
			System.out.println("Grade A");
        }
		else if(per>=80)
        {
			System.out.println("Grade B");
        }
		else if(per>=70)
        {
			System.out.println("Grade C");
        }
		else if(per>=60)
        {
			System.out.println("Grade D");
        }
		else if(per>=40)
        {
			System.out.println("Grade E");
        }
		else
        {
			System.out.println("Grade F");
        }
	}
}

