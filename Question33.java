
/*A certain grade of steel is graded according to the following conditions
i. Hardness must be greater than 50
ii. Carbon content must be less than 0.7
iii. Tensile strength must be greater than 5600
The grades are as follows:
• Grade is 10 if all three conditions are met
• Grade is 9 if conditions (i) and (ii) are met
• Grade is 8 if conditions (ii) and (iii) are met
• Grade is 7 if conditions (i) and (iii) are met
• Grade is 6 if only one condition is met
• Grade is 5 if none of the conditions are met
Write a program, which will require the user to give values of hardness, carbon content and
tensile strength of the steel under consideration and output the grade of the steel*/

public class Question33
 {
    public static void main(String[] args)
	{
		float hs = 40f;//hardness
		float cc = 0.6f;//carbon
		float ts = 456f;//tensile
		float hsf=0,ccf=0,tsf=0,grade;//f means flage;
		if(hs>50)
		{ 
			hsf=1;
		}	
		if(cc<0.7)
		{ 
			ccf=1;
		}
		if(ts>5600) 
		{
			tsf=1;
		}
		if(hsf==0 && ccf==0 && tsf==0) 
		{
			grade = 5;
		}
		else if(hsf==1 || ccf==1 || ts==1) 
		{
			grade = 6;
		}
		else if(hsf==1 && ccf==0 && tsf==1) 
		{
			grade = 7;
		}
		else if(hsf==0 && ccf==1 && tsf==1)
		{
			grade = 8;
		}
		else if(hsf==1 && ccf==1 && tsf==0)
		{ 
			grade = 9;
		}
		else
		{
			grade = 10;
		}
		System.out.println("The Grade of Steel  :"+ grade);
 
	}
}
