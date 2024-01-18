/*Write a program to calculate profit or loss*/


public class Question18
 {   
    public static void main(String[] args)
     {
        int sp=980;
        int cp=678;
        int p; 
        int i=1;
    
    if(sp>cp)
    {
        p = sp-cp;
        System.out.println("Profit : "+p);
    }
    else if(sp<cp)
    {
        i = cp-sp;
        System.out.println("Loss : "+i);	
    }
    else
    {
        System.out.println("No Profit No Loss");
    }
  } 
}
