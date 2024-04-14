package DsaWithJava.Arraysandarraylist;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        /* 1 2 3
           4 5 6
           7 8 9

         */
//        int [][] arr = new int[3][];
//        int [][] arr2D = {
//                {1,2,3,}, // 0th index
//                {4,5},   // Ist index
//                {6,7,8,9} // 2nd index ----> arr2D[2] = {6,7,8,9}
//        } ;
        int [][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows

        // Input
        for (int row = 0; row < arr.length; row++){
            // for each col in every row
            for(int col = 0; col < arr[row].length;col++){
                arr[row][col] = Sc.nextInt();
            }

        }
        // Output
//        for (int row = 0; row < arr.length; row++){
//            // for each col in every row
//            for(int col = 0; col < arr[row].length;col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
 //      }
        // ouutput
//        for(int row = 0; row< arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
        for(int [] a : arr){
            System.out.println(Arrays.toString(a));

        }
    }

}
