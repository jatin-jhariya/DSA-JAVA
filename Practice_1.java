import java.util.*;
public class Practice_1 {
    public static void main(String args[]){

    // calculates its radius and area and prints it as output to the user

       System.out.print("enter radius: "); 
       Scanner sc= new Scanner(System.in);
        int rad= sc.nextInt();
        System.out.println("the  radius of the circle is: "+rad);
        double pie= 3.14;
        double area= pie*rad*rad;
        System.out.println("the area of the circle is: "+area);
        sc.close();
    }

}
