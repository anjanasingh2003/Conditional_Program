
//Write a program to find maximum between three numbers

public class Question2
 {
    public static void main(String[] args) 
    {  
       int a=40;
       int b=78; 
       int c=19;
       if(a>b  && a>c)
       {
        System.out.println("a is maximum :" +a);
       }

       else if(b>a && b>c)
       {
        System.out.println("b is  maximum:" +b);
       }
       else
       {
        System.out.println("c is maximum:" +c);
       }
    }
}
