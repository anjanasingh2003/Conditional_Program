/*Write a program to check whether the triangle is equilateral, isosceles or scalene
triangle*/

public class Question16
 {
      public static void main(String[] args)
	{
		int side1 = 56;
		int side2 = 76;
		int side3 = 57;
		if(side1 == side2 && side2 == side3)
        {
			System.out.println("Equilateral Triangle.");
        }
		else if(side1 == side2 || side1 == side3 || side2 == side3)
        {
			System.out.println("Isosceles Triangle.");
        }
		else 
        {
			System.out.println("Scalene Triangle.");
        }
	}
}
