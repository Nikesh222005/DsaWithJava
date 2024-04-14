package DsaWithJava;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("enter three number");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // find the largest number
       /* int max = a;
        if(b>max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        System.out.println("Maximum number is  "  + max); */

       /* int max = 0;
        if(a>b){
            max = a;
        } if (b>c) {
            max=b;
        }
        else {
            max=c;
        }*/
        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
}
