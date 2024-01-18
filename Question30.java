/*Write a program to check whether a triangle is valid or not, when the three angles of
the triangle are entered through the keyboard. A triangle is valid if the sum of all the three
angles is equal to 180 degrees*/

public class Question30 
{ 
     public static void main(String[] args)
	{
		int side1 = 30;
		int side2 = 60;
		int side3 = 60;
        
		if((side1 + side2) > side3)
    
			if((side2 + side3) > side1)
            

				if((side1 + side3) > side2) 
                
					System.out.println("Triangle is valid.");
                
				else
                
					System.out.println("Triangle is not valid.");
                
            
			      else
                     
				       System.out.println("Triangle is not valid.");
                    
			
		            else
                       
			           System.out.println("Triangle is not valid.");  
    
	}
}