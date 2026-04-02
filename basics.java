import java.util.*;
public class basics {
    // flowchart= diagram to represent solution of a problem.
    public static void main(String args[]){
        // Q1. max of three numbers
        Scanner s1= new Scanner(System.in);
        System.out.print("enter 1st number: ");
        int num=s1.nextInt();
        System.out.print("enter 2nd number: ");
        int num2=s1.nextInt();
        System.out.print("enter 3rd number: ");
        int num3=s1.nextInt();
        
        if(num>num2){
            if(num>num3){
                System.out.println(num);
            }else{
                System.out.println(num3);
            }
        }else{
            if(num2>num3){
                System.out.println(num2);
            }else{
                System.out.println(num3);
            }
        }
        s1.close();
    }
};
