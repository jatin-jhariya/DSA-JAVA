import java.util.*;

public class Practice {
    public static void main(String args[]) {
        // calculator

        Scanner obj = new Scanner(System.in);
        System.out.print("enter 1st number: ");
        int num1 = obj.nextInt();
        System.out.print("enter 2nd number: ");
        int num2 = obj.nextInt();

        System.out.print("enter operation to be performed: ");
        char operation = obj.next().charAt(0); // character 
        switch (operation) {
            case 'a': {
                System.out.print(num1 + num2);
                break;
            }
            case 's': {
                System.out.print(num1 - num2);
                break;
            }
            case 'm': {
                System.out.print(num1 * num2);
                break;
            }
            case 'd': {
                System.out.println(num1 / num2);
                break;
            }
            case 'r': {
                System.out.println(num1 % num2);
                break;
            }
            default: {
                System.out.println("invalid operation");
                break;
            }
        }
        obj.close();
    }
    
}
