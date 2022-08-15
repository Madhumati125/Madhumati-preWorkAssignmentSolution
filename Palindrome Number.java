import java.util.*;
public class MENU
{
	public static void main(String arr[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,r=0,d,ch,s=0;
		System.out.println("Enter a number:");
		n=sc.nextInt();
		System.out.println("MENU");
		System.out.println("1.Palindrome Number");
		System.out.println("2.Perfect Number");
		System.out.println("Enter your choice:");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				for(i=n;i>0;i/=10)
				{
					d=i%10;
					r=r*10+d;
				}
				if(r==n)
					System.out.println("Palindrome Number");
				else
					System.out.println("Not a Palindrome Number");
			break;
			case 2:
				for(i=1;i<n;i++)
				{
					if(n%i==0)
					s=s+i;
				}
				if(s==n)
					System.out.println("Perfect Number");
				else
					System.out.println("Not a Perfect Number");
			break;
			default:
				System.out.println("Invalid choice");
		}
	}
}