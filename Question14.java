/*Write a program to input angles of a triangle and check whether triangle is valid or not*/


public class Question14
 {      
    public static void main(String[] args) 
	{
		int angle1 =45; 
		int angle2 = 60;
		int angle3 = 40;
		int sum = angle1 + angle2 + angle3; //sum of tringle =180
		if(sum==180  &&  angle1>0  &&  angle2>0   && angle3>0) 
		{
			System.out.println("Triangle is valid");
		}
		else
		{
			System.out.println("Triangle is not valid");
		}
        
        
    }
}
