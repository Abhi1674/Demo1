package assignment2;
import java.util.*;
public class question_3
{
     public static void main(String[] args)
     {
    	 int r=0,num;
    	 int sum=0;
    	
    	 
    	 Scanner p= new Scanner(System.in);
    	 System.out.println("Enter the Number ");
    	 num=p.nextInt();
    	
    	 while(num>0)
    	 {
    		 r=num%10;
    		 num=num/10;
    		 sum=(sum*10)+r;
    		 
    	 }
    	System.out.println("Reverse number is "+sum);
     }
}
 