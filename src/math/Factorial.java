package math;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        Recursion re=new Recursion();
        int a=re.fact(10);
        System.out.println("The factorial number is : "+a);
        System.out.println("*********");

        int fact=5;
        int result =5;
        for (int i=fact-1;i>0;i--){

            result= result *i;

        }
        System.out.println("Factorial of fact is :"+fact + "  : " +result);
    }
}
class Recursion{

    int fact(int n) {
        int result;
        if (n==1)
            return 1;
        result =fact(n-1)*n;
        return result;

    }
}
