import java.util.*;
class table_printing{
public static void main(String args[]){
    System.out.print("enter the number: ");
    Scanner obj= new Scanner(System.in);
    int num= obj.nextInt();

    // Make a program that prints the table of a number that is input by the user. (simple without loops)

    System.out.println(num);
    System.out.println(num*2);
    System.out.println(num*3);
    System.out.println(num*4);
    System.out.println(num*5);
    System.out.println(num*6);
    System.out.println(num*7);
    System.out.println(num*8);
    System.out.println(num*9);
    System.out.println(num*10);
    obj.close();
}
}
