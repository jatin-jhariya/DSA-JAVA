public class operators_1 {
    public static void main(String args[]) {
        // operators= it tells compiler which operation to be performed.

        // types of operators are as follows:-
        // 1. arithmetic(unary, binary) 2. relational 3. logical 4. bitwise 5.
        // assignment

        // ex. of arithmetic operators:-
        // binary operator= requires two operands.

        /*
         * int a=10;
         * int b=5;
         * System.out.println("Sum: "+ (a+b));
         * System.out.println("Subtract: "+ (a-b));
         * System.out.println("Multiply: "+ (a*b));
         * System.out.println("Divide: "+ (a/b));
         * System.out.println("Modulo(Remainder): "+ (a%b));
         */

        /*
         * unary operator= requires only one operand.
         * it is of two types: 1.increment(increase) 2.decrement(decrease)
         * 
         * further they are having subtypes:-
         * 1. pre (before) 2. post(after)
         * 
         * ex. are as follows:
         */

        /*
         * int a=10;
         * int b= ++a; // pre-increment
         * System.out.println(a);
         * System.out.println(b);
         * 
         * int c=10;
         * int d= --c; // pre-decrement
         * System.out.println(c);
         * System.out.println(d);
         * 
         * int x=10;
         * int y= x--; // post-decrement
         * System.out.println(x);
         * System.out.println(y);
         */

        /* relational operators= tells relation b/w operands. ex:- */

        /*
         * int a=10;
         * int b=5;
         * System.out.println(a==b); // equality check
         * System.out.println(a!=b); // not equal to check
         * System.out.println(a<b); // less than
         * System.out.println(a>b); // greater than
         * System.out.println(a<=b); // less than equal to
         * System.out.println(a>=b); // greater than equal to
         */

        /*
         * logical operators:-
         * 1.logical AND=true if all conditions are true.
         * 2.logical OR= true if one of them are true.
         * 3.logical NOT=reverse the answer. makes true->false & false->true
         */

        /*
         * System.out.println( (5>4) && (3<1) );
         * System.out.println( (10==15) || (5>3) );
         * System.out.println( !(5>4) );
         */

        /* Assignment operator= assigns value. ex */
        int a = 10;
        a += 10; // a= a+10;
        System.out.println(a);
        /*
         * same for other operations like subtraction, multiplication, division, modulo
         */

        /*
         * Operator precedence= in an expression how an operator wil be evaluated.
         * Associativity= if precedence is same then it is evaluated right to left or
         * left to right according to expression.
         */
    }
}