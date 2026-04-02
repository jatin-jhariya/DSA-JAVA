import java.util.*;

public class conditions {
    public static void main(String args[]) {
        // Scanner obj= new Scanner(System.in);
        // System.out.print("enter your age: ");
        // int age= obj.nextInt();

        // // condition for being an adult
        // if(age>=18){
        // System.out.println("adult");
        // }
        // else{
        // System.out.println("not an adult");
        // }
        // obj.close();

        // System.out.print("enter the number: ");
        // Scanner sc= new Scanner(System.in);
        // int num= sc.nextInt();

        // // even and odd
        // if(num%2 == 0){
        // System.out.println("even number");
        // } else{
        // System.out.println("odd number");
        // }
        // sc.close();

        // System.out.print("enter 1st number: ");
        // Scanner sc= new Scanner(System.in);
        // int num1= sc.nextInt();
        // System.out.print("enter 2nd number: ");
        // int num2= sc.nextInt();

        // // comparison b\w two numbers
        // if(num1 == num2){
        // System.out.println("num1 = num2");
        // } else if(num1>num2){
        // System.out.println("num1 > num2");
        // } else{
        // System.out.println("num1 < num2");
        // }
        // sc.close();

        System.out.print("enter the button: ");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // greeting button
        switch (button) {
            case 1: {
                System.out.println("hello");
                break;
            }
            case 2: {
                System.out.println("namaste");
                break;
            }
            case 3: {
                System.out.println("bonjour");
                break;
            }
            default: {
                System.out.println("invalid button");
                break;
            }
        }
        sc.close();
    }
}
