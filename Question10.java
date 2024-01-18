/*Write a program to check whether a character is uppercase or lowercase alphabe*/

public class Question10
 {
    public static void main(String[] args) 
    {
        char ch='a';

        if(ch>='a' && ch<='z')
        {
            System.out.println("this is lowercase:" +ch);
        }
        else if(ch>='A' && ch<='Z')
        {
            System.out.println("this is Uppercase");
        }
    }
}
