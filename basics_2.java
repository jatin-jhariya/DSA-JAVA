// import java.util.*;

public class basics_2 {
    public static void main(String args[]) {
        // variables= container that stores data and its value can be changed.
        // eg. a,ch,name etc.

        // data types
        /*
         * there are mainly two types:- 1.primitive 2.non-primitive
         * primitive data types are as follows:- byte, boolean, char, int, long, float,
         * double, short
         * byte=it stores number from -128 to 127.
         * boolean= it stores either true or false.
         * char= it stores character value like a,b,c etc.
         * int= it stores numeric value.
         * long= it stores numbers having high range.
         * float= it stores decimal point numbers.
         * double= it stores high range decimal numbers.
         */

        // sum of two num
        /*
         * int a=10;
         * int b=20;
         * int sum= a+b;
         * System.out.println(sum);
         */

        /*
         * comments= part of the code that is not executed. it is used to increase the
         * readability of the program. there are two types of comments:-
         * 1. single line comment(//)
         * 2. multiline comment
         */

        // input in java
        /*
         * Scanner sc= new Scanner(System.in);
         * String name= sc.nextLine();
         * System.out.println(name);
         * sc.close();
         */

        // sum of two num using user input
        /*
         * System.out.print("Enter 1st number: ");
         * Scanner obj= new Scanner(System.in);
         * int a= obj.nextInt();
         * System.out.print("Enter 2nd number: ");
         * int b= obj.nextInt();
         * 
         * int sum=a+b;
         * System.out.print("Sum is: ");
         * System.out.print(sum);
         * obj.close();
         */

        // area of a circle
        /*
         * System.out.print("Enter the radius: ");
         * Scanner obj1= new Scanner(System.in);
         * float rad= obj1.nextInt();
         * float area;
         * area= 3.14f *rad*rad ; // by default 3.14 is considered as double.
         * System.out.println(area);
         * obj1.close();
         */

        /*
         * type conversion= conversion from one datatype to other datatype. it is also
         * known as widening or implicit conversion.
         */
        /*
         * int a=4;
         * int b=10;
         * float sum= a+b;
         * System.out.println(sum);
         */

        /*
         * type casting= conversion from one datatype to other datatype to shorten the
         * data. in this conversion we loose our data known as lossy conversion.
         */

        /*
         * float a = 3.123f;
         * int b = (int) a;
         * System.out.println(b);
         */

        /*
         * type promotion= java automatically promotes byte, short and char into int
         * when evaluating an expression & long, float and double are converted to the
         * long, float and double respectively when evaluating an expression.
         */
        byte a = 10;
        char b = 'a';
        short c = 20;
        int d = 40;
        long sum = (a + b + c + d);
        System.out.println(sum);

        /*
         * how java code runs?
         * java code runs in two step:
         * 1.compilation 2.execution
         * 
         * compilation= source code (.java file) converts into byte code (.class file)
         * using compiler.
         * execution= byte code converts into native code using jvm (java virtual
         * machine).
         */

    }
}