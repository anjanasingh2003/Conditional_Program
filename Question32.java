/*Given the length and breadth of a rectangle, write a program to find whether the area
of the rectangle is greater than its perimeter. For example, the area of the rectangle with
length = 5 and breadth = 4 is greater than its perimeter*/


public class Question32
 {
      public static void main(String[] args)
	{
		
		float len = 5;
		float bre = 4;
		float area = len * bre;
		float perimeter = 2 * (len+bre);
		if(area>perimeter) 
		{
			System.out.println("Area  is greater than  Perimeter");
		}
		else
		{
			System.out.println("Perimeter  is greater than Area");
		}
	}
}
