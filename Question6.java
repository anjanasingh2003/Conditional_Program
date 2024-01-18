//Write a program to check whether a year is leap year or not

public class Question6 
{
    public static void main(String[] args)
     {
        int year=2020;
        if((year%4==0) && (year%100!=0 || year%400==0))
        {
            System.out.println(" year is a leap year:" +year);
        }
        else
        {
            System.out.println("year is a not leap year:" +year);

        }
    }
}
