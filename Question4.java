//Write a program to check whether a number is divisible by 5 and 11 or not

public class Question4
{
    public static void main(String[] args) 
    {
        int n=35;
        if(n%5==0)
        {
            System.out.println("number is divisible by 5:" +n);
        }
        else if(n%11==0)
        {
            System.out.println("number is  divisible by 11:" +n);
        }
        else
        {
            System.out.println("number is not divisible");
        }
    }
    
}
