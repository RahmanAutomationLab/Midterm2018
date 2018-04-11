package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */


        permutation("", "ABC");

    }

    public static void permutation(String s, String s1){
        int x = s1.length();

        if(x==0){
            System.out.println(s);
        }else{
            for(int i = 0; i < x; i++){
                permutation(s+s1.charAt(i), s1.substring(0,i) + s1.substring(i + 1, x));
            }
        }
    }
}