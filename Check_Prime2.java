import java.util.Scanner;
class Check_Prime2{
public static void main(String args[]){
int num;
boolean isPrime=false;
    Scanner scan=new Scanner(System.in); 
    //create a scanner object for input
System.out.print("Enter a number: ");
num=scan.nextInt();//get input from the user for num1
int i=2;
do{
    
    //condition for non-prime
    if(num%i==0)
    {
        isPrime=true;
        break;
    }
     i++;
}while( i<=num/2);
if(!isPrime){
    System.out.println(num+" is a prime numbner ");
}
else{
    System.out.println(num+" is not a prime numbner ");
}
}
}