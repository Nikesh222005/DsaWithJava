package DsaWithJava.Arraysandarraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // arrays of primitive
        int [] arr = new int[5];
        arr[0] = 23;
        arr[1] = 44;
        arr[2] = 12;
        arr[3] = 67;
        arr[4] = 29;
        // [23,44,12,67,29]
//        System.out.println(arr[3]);

        // input using for loops
//        for(int i = 0; i< arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        for(int i = 0; i< arr.length; i++){
//            System.out.print(arr[i]  +" ");
//        }
//        for(int num : arr){         // for every element in array ,print the element
//            System.out.println(num + "  "); // here num represent element of the array
//        }
//        System.out.println(arr[6]); // index out of bound error
        // array of object
        String [] str = new String[5];
        for(int i = 0; i<str.length; i ++){
            str[i]= sc.next();

        }
        System.out.println(Arrays.toString(str));

        // Modify
        str[1] = "kunal";
        System.out.println(Arrays.toString(str));
    }

}
