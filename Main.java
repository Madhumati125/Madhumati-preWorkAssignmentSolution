import java.util.*;
public class Main
{
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt(); 
        int i=n;
        do
        {
           int j=0;
           do
           {
               System.out.print("*");
           }while(++j<i);
           System.out.println();
        } while(--i>0) ;  
    }
}