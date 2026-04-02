import java.util.*;
public class basics_3{
    public static void main(String args[]){
        
        /* int age=21;

        // if else
        if(age>=18){
            System.out.println("you are eligible for vote.");
        }
        else{
            System.out.println("you are not eligible for vote.");
        } 
        */

        // print the largest of two numbers

        /* int A=1;
        int B=3 ;

        if(A>=B){
            System.out.println("A is largest");
        }
        else{
            System.out.println("B is largest");
        }
        */

        // print if a number is even or odd

        /* Scanner sc= new Scanner(System.in); 
        int num= sc.nextInt();

        if(num%2 == 0){
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
        sc.close();
        */

        // else if -> for checking multiple conditions

        /* int age=6;
        if(age>=18){
            System.out.println("adult");
        } else if(age>=13 && age<18){
            System.out.println("teenager");
        } else{
            System.out.println("child");
        }
        */

        // income tax calculator
        /* System.out.print("Enter income: ");
        Scanner sc= new Scanner(System.in);
        float tax;
        int income= sc.nextInt();
        if(income<= 500000){
            tax=0;
        } 
        else if((income> 500000) && (income< 1000000)){
            tax= 0.2f*income;
        } 
        else{
            tax= 0.3f*income;
        }
        System.out.println("Tax: "+(int)tax);
        sc.close(); */

        // print the largest of 3 numbers
        /* int A=1;
        int B=3;
        int C=6;

        if((A>=B) && (A>=C)){
            System.out.println("Largest is A");
        } else if(B>=C){
            System.out.println("Largest is B");
        } else{
            System.out.println("Largest is C");
        }
        */

        // ternary operator= operates on 3 operand. another way of checking condition like if-else
        
        // ternary operator 
        /* int number=5;
        String result= ((number%2)==0)? "Even" : "Odd";
        System.out.println(result);
        */

        // check if a student will pass or fail
        /* System.out.print("enter marks: ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        // ternary operator
        String result= (num>=33) ? "Passed" : "Failed" ;
        System.out.println(result);
        sc.close();
        */

        // switch statement-> it is also used for  condition check. but it contains cases you can say like buttons 1, button 2, etc by pressing buttons we get the desired output. ex

        /* System.out.print("enter button: ");
        Scanner sc= new Scanner(System.in);
        int button= sc.nextInt();

        // switch statement
        switch(button){
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("Momos");
                break;
            case 3:
                System.out.println("pizza");
                break;
            case 4:
                System.out.println("burger");
                break;
            default:
                System.out.println("invalid button");
            break;
        }
        sc.close();
        */

        // NOTE: we can use char, boolean or any other data type in cases.

        // calculator
        System.out.print("enter 1st number: ");
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
        System.out.print("enter 2nd number: ");
        int num2= sc.nextInt();
        System.out.print("operation to be performed: ");
        char opr= sc.next().charAt(0);

        switch(opr){
            case '+':
            System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println((float)num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("invalid operator");
        }
        sc.close();
    }
}