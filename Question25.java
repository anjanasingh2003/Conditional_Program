/**The marks obtained by a student in 5 different subjects are input through the
keyboard. The student gets a division as per the following rules: Write a program to
calculate the division obtained by the student
• Percentage    above or equal to 60 -  First division
• Percentage    between 50 and 59     - Second division
• Percentage    between 40 and 49   -   Third division
• Percentage    less than 40 –          Fail*/

public class Question25
 {
        public static void main(String[] args)
	{
		int m1 = 65;
		int m2 = 75;
		int m3 = 85;
		int m4 = 89;
		int m5 = 78;
		int tot = m1+m2+m3+m4+m5;
		float per = tot/5;
		if(per>=60)
		{			
			System.out.println("First Division.");
		}
		else if(per>=50 && per<=59)
		{			
			System.out.println("Second Division.");
		}
		else if(per>=40 && per<=49)
		{			
			System.out.println("Third  Division.");
		}
		else
		{			
			System.out.println("Fail.");
		}
	}
}
