import java.util.*;

public class Practice_2 {
    public static void main(String args[]) {

        // Q. print the sum of first n natural numbers

        /* System.out.print("enter the number: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;

        if(n<=0){
        System.out.print("not a natural number");
        }

        for(int i=1; i<=n;i++){
        sum=sum+i;
        }
        System.out.print("the sum of 1st "+n+" natural number is: "+sum);
        sc.close(); */

        // print the table of a number input by the user

        /* System.out.print("enter the number: ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int table;

        for(int i=1;i<=10;i++){
        table=num*i;
        System.out.print(table+" ");
        }
        sc.close(); */

        // Q1. print all even numbers till n

        /* System.out.print("enter the number till the even number to be printed: ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();

        int i=1;
        while( 2*i <= num){
        System.out.print(2*i +" ");
        i++;
        }
        sc.close(); */

        /* gives infinite loop bcz condition is not given
        for(; ;){
        System.out.print("hare krishna"+" ");
        } */


        // Q2. print if a number is prime or not (input n from the user)

        /* System.out.print("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 0 || num == 1) {
        System.out.println("not a prime");
        } else {
        boolean isPrime = true;
        for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) {
        isPrime = false;
        break;
        }
        }

        if (isPrime) {
        System.out.println("prime number");
        } else {
        System.out.println("not a prime");
        }
        sc.close();
        } */

        /*
           Q3 Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
           If the user enters 1 then keep taking input from the user for a student’s
           marks(out of 100).
           If they enter 0 then stop.
           If he/ she scores :
           Marks >=90 -> print “This is Good”
           89 >= Marks >= 60 -> print “This is also Good”
           59 >= Marks >= 0 -> print “This is Good as well”
         */

        System.out.print("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 0: {
                System.out.println("stop");
                break;
            }
            case 1: {
                System.out.print("enter marks: ");
                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("this is good");
                } else if (marks <= 89 && marks >= 60) {
                    System.out.print("this is also good");
                } else {
                    System.out.println("this is good as well"); // Because marks don’t matter but our effort does.

                }
                break;
            }
            default: {
                System.out.println("invalid number");
            }
        }
        sc.close();
    }
}
