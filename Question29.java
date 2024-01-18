/*If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to
determine the youngest of the three */

public class Question29
 {
       public static void main(String args[])
	{
		int ram  = 46;
		int shyam = 34;
		int ajay = 25;
		if(ram<shyam && ram<ajay)
        {
			System.out.print("The Youngest Age is Ram");
        }
		else if(shyam<ram &&  shyam<ajay)	
        {		
			System.out.print("The Youngest Age is Shyam");
        }
		else
        {			
			System.out.print("The Youngest Age is Ajay");
        }
	}
}

