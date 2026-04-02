// my first program

import java.util.*; // contains package for user input

public class first_program {
    public static void main(String[] args) {
        // System.out.print("hello world"); // output

        // Q1. printing the pattern

        // System.out.print("*\n**\n***\n****");


        // variables
        // int a=30,b=50;
        // int sum= a+b;
        // System.out.print(sum);

        
        // user input
        // Scanner sc= new Scanner(System.in); 
        // System.out.print("enter your name: ");
        // String name= sc.nextLine();
        // System.out.print(name);
        // sc.close();

        // Q2. take 2 variables a&b and print their sum
    
        Scanner obj= new Scanner(System.in);
        System.out.print("enter 1st value: ");
        int a= obj.nextInt();
        System.out.print("enter 2nd value: ");
        int b= obj.nextInt();
        int sum=a+b;
        System.out.print("the sum is: "+sum);
        obj.close();

    }
}