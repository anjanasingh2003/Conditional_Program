/*. Write a program to input any character and check whether it is alphabet, digit or special
character*/

public class Question9
 {
    public static void main(String[] args) 
    {
        char ch='a';
        if((ch>='a' && ch<='z')  || (ch>='A' && ch<='Z'))
        {
            System.out.println("this is Alphabet");
        }
        else if(ch>='0' && ch>='9')
        {
            System.out.println("this is Digit");
        }
        else
        {
            System.out.println("this is Special Character");
        }
    }
    
}