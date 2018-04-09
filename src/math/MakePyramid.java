package math;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here

        makePyramid(15);
    }

    public static void makePyramid(int max){
        for (int i = 1; i<max; i++){
            for(int j=i; j<max-1; j++){
                System.out.print(" ");
            }
            for(int j = i; j>0; j--){

                System.out.print("* ");

            }
            System.out.println();

        }
    }
  }
