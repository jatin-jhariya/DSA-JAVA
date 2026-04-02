// import java.util.*;

public class practice1 {
    public static void main(String[] args) {

        // Q1. Write a Java program to get a number from the user and print whether it
        // is positive or negative.

        /*
         * System.out.print("enter the number: ");
         * Scanner sc= new Scanner(System.in);
         * int num= sc.nextInt();
         * 
         * if( num >= 0){
         * System.out.println("positive number");
         * } else{
         * System.out.println("negative number");
         * }
         * sc.close();
         */

        /*
         * Q2.Finish the following code so that it prints You have a fever if your
         * temperature
         * is above 100 and otherwise prints You don't have a fever.
         */

        /*
         * double temp= 103.5;
         * 
         * if(temp>100){
         * System.out.println("you have a fever");
         * } else {
         * System.out.println("you don't have a fever");
         * }
         */

        /*
         * Q3.Write a Java program to input week number(1-7) and print day of week name
         * using switch case.
         */

        /* System.out.print("enter week number(1-7): ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }
        sc.close();
        */

        /* Q4.Write a Java program that takes a year from the user and print whether that year is a leap year or not. */
        /* System.out.print("enter year: ");
        Scanner sc= new Scanner(System.in);
        int year= sc.nextInt();

        if(year%400 == 0){
            System.out.print("leap year");
        } else{
            if((year%4 == 0) && (year%100 != 0)){
                System.out.println("leap year");
            } else{
                System.out.println("not a leap year");
            }
        }
        sc.close();
        */

    }
}