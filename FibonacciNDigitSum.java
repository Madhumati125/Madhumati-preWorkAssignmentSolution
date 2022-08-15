import java.util.Scanner;

public class FibonacciNDigitSum
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Fibonacci Series");
        System.out.println("2. Sum of digits");
        System.out.print("Enter your choice: ");
        int ch = in.nextInt();

        switch (ch) {
            case 1:
            int a = 0, b = 1;
            System.out.print(a + " " + b);
            /*
             * i is starting from 3 below
             * instead of 1 because we have 
             * already printed 2 terms of
             * the series. The for loop will 
             * print the series from third
             * term onwards.
             */
            for (int i = 3; i <= 10; i++) {
                int term = a + b;
                System.out.print(" " + term);
                a = b;
                b = term;
            }
            break;

            case 2:
            System.out.print("Enter number: ");
            int num = in.nextInt();
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println("Sum of Digits " + " = " + sum);
            break;

            default:
            System.out.println("Incorrect choice");
            break;
        }
    }
}