/* If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and DA = 90% of
basic salary. If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA =
98% of basic salary. If the employee's salary is input through the keyboard write a program
to find his gross salary*/

public class Question24
 {
     public static void main(String[] args)
	{
		float bs = 600;
		float hra,da,gs;
		if(bs<1500)
		{			
			hra=bs*0.1f;
			da=bs*0.9f;
		}
		else
		{			
			hra=500;
			da=bs*0.98f;
		}		
		gs = bs+hra+da;
		System.out.println("Gross Salary Rs:"+gs);
	}
}
